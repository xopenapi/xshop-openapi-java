package com.example.graphqldemo.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequest;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TimeZone;

import static com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN;
import static com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY;
import static com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;
import static com.fasterxml.jackson.databind.PropertyNamingStrategy.LOWER_CAMEL_CASE;
import static com.fasterxml.jackson.databind.SerializationFeature.*;
import static org.apache.http.HttpStatus.*;

public abstract class Api {

    public URI endpoint;
    public CloseableHttpClient restKlient;
    public static final List<Integer> HTTP_KODER_TOM_RESPONS = new ArrayList<Integer>(Arrays.asList(SC_NOT_MODIFIED, SC_NO_CONTENT, SC_ACCEPTED));

    public static final ObjectMapper MAPPER = mapper();

    public static ObjectMapper mapper() {
        return new ObjectMapper()
                .registerModule(new Jdk8Module())
                .registerModule(new JavaTimeModule())
                .setPropertyNamingStrategy(LOWER_CAMEL_CASE)
                .setTimeZone(TimeZone.getTimeZone("Europe/Oslo"))
                .disable(WRITE_DATES_AS_TIMESTAMPS)
                .disable(WRITE_DURATIONS_AS_TIMESTAMPS)
                .disable(FAIL_ON_EMPTY_BEANS)
                .configure(WRITE_BIGDECIMAL_AS_PLAIN, true)
                .enable(FAIL_ON_READING_DUP_TREE_KEY)
                .enable(FAIL_ON_UNKNOWN_PROPERTIES);
    }

    Api(String url) {
        this.endpoint = validate(URI.create(url));
        this.restKlient = HttpClients.custom().build();
    }

    Api(URI endpoint, String tema, CloseableHttpClient klient) {
        this.endpoint = validate(endpoint);
        this.restKlient = klient;
    }

    public static URI validate(URI endpoint) {
/*        if (!endpoint.toString().endsWith("graphql")) {
            throw new IllegalArgumentException(
                    "Ekplisitt konfigurert URL fra property pdl.base.url må inneholde path /graphql, verdi er " + endpoint);
        }*/
        return endpoint;
    }

    public <T extends GraphQLResult<?>> T query(GraphQLOperationRequest q, GraphQLResponseProjection p, Class<T> clazz) throws Exception {
        return query(new GraphQLRequest(q, p), clazz);

    }

    public <T extends GraphQLResult<?>> T query(GraphQLRequest req, Class<T> clazz) throws Exception {
        T res = sendReq(post(req), new OidcRestClientResponseHandler.ObjectReaderResponseHandler<T>(endpoint, MAPPER.readerFor(clazz)));
        if (res.hasErrors()) {
            throw new Exception("请求异常");
        }
        return res;
    }

    public HttpPost post(GraphQLRequest req) {
        try {
            HttpPost post = new HttpPost(endpoint);
            post.setEntity(new StringEntity(req.toHttpJsonBody()));
            post.setHeader("Content-Type", "application/json; charset=utf8");
            return post;
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public <T extends GraphQLResult<?>> T sendReq(HttpPost req, OidcRestClientResponseHandler.ObjectReaderResponseHandler<T> responseHandler) throws Exception {
        try {
            CloseableHttpResponse res = restKlient.execute(req);
            Integer status = res.getStatusLine().getStatusCode();
            if (status == HttpStatus.SC_OK) {
                return responseHandler.handleResponse(res);
            }else {
                String body = HTTP_KODER_TOM_RESPONS.contains(status)
                        ? "<tom_respons>"
                        : EntityUtils.toString(res.getEntity());
                String msg = "Kunne ikke hente informasjon for query mot PDL: " + req.getURI()
                        + ", HTTP request=" + req.getEntity()
                        + ", HTTP status=" + res.getStatusLine()
                        + ". HTTP Errormessage=" + body;
                throw new Exception(msg);
            }

        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " [endpoint=" + endpoint + ", restKlient=" + restKlient + "]";
    }



}

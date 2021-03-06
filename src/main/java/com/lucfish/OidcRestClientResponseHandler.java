package com.lucfish;

import com.fasterxml.jackson.databind.ObjectReader;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ResponseHandler;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URI;
import java.nio.charset.StandardCharsets;

public abstract class OidcRestClientResponseHandler<T> implements ResponseHandler<T> {

    private final URI endpoint;



    public OidcRestClientResponseHandler(URI endpoint) {
        this.endpoint = endpoint;
    }

    @Override
    public T handleResponse(final HttpResponse response) throws IOException {
        int status = response.getStatusLine().getStatusCode();
        if (status == HttpStatus.SC_NO_CONTENT) {
            return null;
        }
        if (status >= HttpStatus.SC_OK && status < HttpStatus.SC_MULTIPLE_CHOICES) {
            HttpEntity entity = response.getEntity();
            return entity != null ? readEntity(entity) : null;
        }
        if (status == HttpStatus.SC_FORBIDDEN) {
            throw new IOException();
        }
        throw new IOException();
    }

    protected abstract T readEntity(HttpEntity entity) throws IOException;

    public static class StringResponseHandler extends OidcRestClientResponseHandler<String> {
        public StringResponseHandler(URI endpoint) {
            super(endpoint);
        }

        /**
         * default håndteres alt som string.
         */
        @Override
        protected String readEntity(HttpEntity entity) throws IOException {
            return EntityUtils.toString(entity, StandardCharsets.UTF_8);
        }
    }

    public static class ByteArrayResponseHandler extends OidcRestClientResponseHandler<byte[]> {
        public ByteArrayResponseHandler(URI endpoint) {
            super(endpoint);
        }

        @Override
        protected byte[] readEntity(HttpEntity entity) throws IOException {
            return EntityUtils.toByteArray(entity);
        }
    }

    public static class ObjectReaderResponseHandler<T> extends OidcRestClientResponseHandler<T> {

        private ObjectReader reader;

        public ObjectReaderResponseHandler(URI endpoint, ObjectReader reader) {
            super(endpoint);
            this.reader = reader;
        }

        @Override
        protected T readEntity(HttpEntity entity) throws IOException {
            return reader.readValue(entity.getContent());
        }

    }
}

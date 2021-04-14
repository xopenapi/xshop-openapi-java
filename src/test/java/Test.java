import com.example.graphqldemo.api.OrderApi;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequest;
import io.github.kobylynskyi.product.graphql.model.OrderQueryRequest;
import io.github.kobylynskyi.product.graphql.model.OrderResponseProjection;
import io.github.kobylynskyi.product.graphql.model.OrderTO;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class Test {
    public static void main(String[] args) throws Exception {
        System.out.println("ttttt");
        String url = "http://127.0.0.1:10250/admin/v1/graphql";
        OrderApi orderApi = new OrderApi(url);
        String orderId = "111";
        OrderTO res1 = orderApi.order(orderId);

        CloseableHttpClient restKlient = HttpClients.custom().build();
        HttpPost post = new HttpPost(url);
        OrderQueryRequest q = new OrderQueryRequest();
        q.setId(orderId);
        GraphQLRequest req = new GraphQLRequest(q, new OrderResponseProjection().id());
        post.setEntity(new StringEntity(req.toHttpJsonBody()));
        post.setHeader("Content-Type", "application/json; charset=utf8");
        CloseableHttpResponse res = restKlient.execute(post);
        System.out.println(res);
    }
}

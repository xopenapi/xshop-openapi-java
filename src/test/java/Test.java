import com.lucfish.OrderApi;
//import io.github.kobylynskyi.product.graphql.model.OrderTO;
import com.lucfish.xshop.openapi.OrderTO;

public class Test {
    public static void main(String[] args) throws Exception {
        System.out.println("ttttt");
        String url = "http://127.0.0.1:10250/admin/v1/graphql";
        OrderApi orderApi = new OrderApi.Builder().setUrl(url).setAccessToken("111").build();
        String orderId = "111";
        OrderTO res1 = orderApi.order(orderId);
        System.out.println(res1);
    }
}

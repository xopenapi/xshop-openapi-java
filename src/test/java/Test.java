import com.example.graphqldemo.api.OrderApi;
import com.lucfish.xshop.openapi.OrderTO;

public class Test {
    public static void main(String[] args) throws Exception {
        System.out.println("ttttt");
        String url = "http://127.0.0.1:10250/admin/v1/graphql";
        OrderApi orderApi = new OrderApi(url);
        String orderId = "111";
        OrderTO res1 = orderApi.order(orderId);
        System.out.println(res1);
    }
}

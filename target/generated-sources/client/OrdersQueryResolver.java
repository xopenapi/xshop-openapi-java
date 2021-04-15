import com.lucfish.xshop.openapi.*;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public interface OrdersQueryResolver {

    @javax.validation.constraints.NotNull
    OrderConnectionTO orders(String after, String before, Integer first, Integer last, Boolean reverse) throws Exception;

}

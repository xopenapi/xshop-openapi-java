import com.lucfish.xshop.openapi.*;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public interface QueryResolver {

    CustomerTO customer(@javax.validation.constraints.NotNull String id) throws Exception;

    OrderTO order(@javax.validation.constraints.NotNull String id) throws Exception;

    @javax.validation.constraints.NotNull
    OrderConnectionTO orders(String after, String before, Integer first, Integer last, Boolean reverse) throws Exception;

    ProductTO product(@javax.validation.constraints.NotNull String id) throws Exception;

    ProductVariantTO productVariant(@javax.validation.constraints.NotNull String id) throws Exception;

    @javax.validation.constraints.NotNull
    ShopTO shop() throws Exception;

}

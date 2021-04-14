import com.lucfish.xshop.openapi.*;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-14T23:29:07+0800"
)
public interface MutationResolver {

    @javax.validation.constraints.NotNull
    CheckoutCreateTO checkoutCreate(@javax.validation.constraints.NotNull CheckoutCreateInputTO input) throws Exception;

    @javax.validation.constraints.NotNull
    OrderCloseTO orderClose(@javax.validation.constraints.NotNull OrderCloseInputTO input) throws Exception;

    @javax.validation.constraints.NotNull
    RefundCreateTO refundCreate(@javax.validation.constraints.NotNull RefundInputTO input) throws Exception;

    @javax.validation.constraints.NotNull
    ProductCreateTO productCreate(@javax.validation.constraints.NotNull ProductInputTO input) throws Exception;

    @javax.validation.constraints.NotNull
    ProductDeleteTO productDelete(@javax.validation.constraints.NotNull ProductDeleteInputTO input) throws Exception;

}

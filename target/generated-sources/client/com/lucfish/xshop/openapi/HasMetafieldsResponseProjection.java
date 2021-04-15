package com.lucfish.xshop.openapi;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for HasMetafields
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-04-15T14:48:53+0800"
)
public class HasMetafieldsResponseProjection extends GraphQLResponseProjection {

    public HasMetafieldsResponseProjection() {
    }

    @Override
    public HasMetafieldsResponseProjection all$() {
        return all$(3);
    }

    @Override
    public HasMetafieldsResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("HasMetafieldsResponseProjection.MetafieldResponseProjection.metafield", 0) <= maxDepth) {
            projectionDepthOnFields.put("HasMetafieldsResponseProjection.MetafieldResponseProjection.metafield", projectionDepthOnFields.getOrDefault("HasMetafieldsResponseProjection.MetafieldResponseProjection.metafield", 0) + 1);
            this.metafield(new MetafieldResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("HasMetafieldsResponseProjection.MetafieldResponseProjection.metafield", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("HasMetafieldsResponseProjection.MetafieldConnectionResponseProjection.metafields", 0) <= maxDepth) {
            projectionDepthOnFields.put("HasMetafieldsResponseProjection.MetafieldConnectionResponseProjection.metafields", projectionDepthOnFields.getOrDefault("HasMetafieldsResponseProjection.MetafieldConnectionResponseProjection.metafields", 0) + 1);
            this.metafields(new MetafieldConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("HasMetafieldsResponseProjection.MetafieldConnectionResponseProjection.metafields", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("HasMetafieldsResponseProjection.MetafieldResponseProjection.privateMetafield", 0) <= maxDepth) {
            projectionDepthOnFields.put("HasMetafieldsResponseProjection.MetafieldResponseProjection.privateMetafield", projectionDepthOnFields.getOrDefault("HasMetafieldsResponseProjection.MetafieldResponseProjection.privateMetafield", 0) + 1);
            this.privateMetafield(new MetafieldResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("HasMetafieldsResponseProjection.MetafieldResponseProjection.privateMetafield", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("HasMetafieldsResponseProjection.MetafieldConnectionResponseProjection.privateMetafields", 0) <= maxDepth) {
            projectionDepthOnFields.put("HasMetafieldsResponseProjection.MetafieldConnectionResponseProjection.privateMetafields", projectionDepthOnFields.getOrDefault("HasMetafieldsResponseProjection.MetafieldConnectionResponseProjection.privateMetafields", 0) + 1);
            this.privateMetafields(new MetafieldConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("HasMetafieldsResponseProjection.MetafieldConnectionResponseProjection.privateMetafields", 0)));
        }
        this.typename();
        return this;
    }

    public HasMetafieldsResponseProjection metafield(MetafieldResponseProjection subProjection) {
        return metafield((String)null, subProjection);
    }

    public HasMetafieldsResponseProjection metafield(String alias, MetafieldResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("metafield").alias(alias).projection(subProjection));
        return this;
    }

    public HasMetafieldsResponseProjection metafield(HasMetafieldsMetafieldParametrizedInput input, MetafieldResponseProjection subProjection) {
        return metafield(null, input, subProjection);
    }

    public HasMetafieldsResponseProjection metafield(String alias, HasMetafieldsMetafieldParametrizedInput input, MetafieldResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("metafield").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public HasMetafieldsResponseProjection metafields(MetafieldConnectionResponseProjection subProjection) {
        return metafields((String)null, subProjection);
    }

    public HasMetafieldsResponseProjection metafields(String alias, MetafieldConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("metafields").alias(alias).projection(subProjection));
        return this;
    }

    public HasMetafieldsResponseProjection metafields(HasMetafieldsMetafieldsParametrizedInput input, MetafieldConnectionResponseProjection subProjection) {
        return metafields(null, input, subProjection);
    }

    public HasMetafieldsResponseProjection metafields(String alias, HasMetafieldsMetafieldsParametrizedInput input, MetafieldConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("metafields").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public HasMetafieldsResponseProjection privateMetafield(MetafieldResponseProjection subProjection) {
        return privateMetafield((String)null, subProjection);
    }

    public HasMetafieldsResponseProjection privateMetafield(String alias, MetafieldResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("privateMetafield").alias(alias).projection(subProjection));
        return this;
    }

    public HasMetafieldsResponseProjection privateMetafield(HasMetafieldsPrivateMetafieldParametrizedInput input, MetafieldResponseProjection subProjection) {
        return privateMetafield(null, input, subProjection);
    }

    public HasMetafieldsResponseProjection privateMetafield(String alias, HasMetafieldsPrivateMetafieldParametrizedInput input, MetafieldResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("privateMetafield").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public HasMetafieldsResponseProjection privateMetafields(MetafieldConnectionResponseProjection subProjection) {
        return privateMetafields((String)null, subProjection);
    }

    public HasMetafieldsResponseProjection privateMetafields(String alias, MetafieldConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("privateMetafields").alias(alias).projection(subProjection));
        return this;
    }

    public HasMetafieldsResponseProjection privateMetafields(HasMetafieldsPrivateMetafieldsParametrizedInput input, MetafieldConnectionResponseProjection subProjection) {
        return privateMetafields(null, input, subProjection);
    }

    public HasMetafieldsResponseProjection privateMetafields(String alias, HasMetafieldsPrivateMetafieldsParametrizedInput input, MetafieldConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("privateMetafields").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public HasMetafieldsResponseProjection onOrder(OrderResponseProjection subProjection) {
        return onOrder(null, subProjection);
    }

    public HasMetafieldsResponseProjection onOrder(String alias, OrderResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Order").alias(alias).projection(subProjection));
        return this;
    }

    public HasMetafieldsResponseProjection onCustomer(CustomerResponseProjection subProjection) {
        return onCustomer(null, subProjection);
    }

    public HasMetafieldsResponseProjection onCustomer(String alias, CustomerResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Customer").alias(alias).projection(subProjection));
        return this;
    }

    public HasMetafieldsResponseProjection onProduct(ProductResponseProjection subProjection) {
        return onProduct(null, subProjection);
    }

    public HasMetafieldsResponseProjection onProduct(String alias, ProductResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Product").alias(alias).projection(subProjection));
        return this;
    }

    public HasMetafieldsResponseProjection typename() {
        return typename(null);
    }

    public HasMetafieldsResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}

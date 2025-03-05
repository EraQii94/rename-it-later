package com.example.ecommerce.projection;

import com.example.ecommerce.entity.Product;
import org.springframework.data.rest.core.config.Projection;
import java.math.BigDecimal;

@Projection(name = "productView", types = Product.class)
public interface ProductProjection {
    Long getId();
    String getSku();
    String getName();
    String getDescription();
    BigDecimal getUnitPrice();
    String getImageUrl();
    Boolean getActive();
    int getUnitInStock();
}

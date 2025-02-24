package com.example.ecommerce.Entity;

import jakarta.persistence.Table;
import jdk.jfr.Enabled;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Enabled
@Table(name = "product")
@Data
public class Product {
    private long id;

    private String sku;

    private String name;

    private String description;

    private BigDecimal unitPrice;

    private String imageUrl;

    private Boolean active;

    private int unitInStock;

    private Date dateCreated;

    private Date lastUpdated;

}

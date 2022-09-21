package com.lov2code.ecommerce.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name="product")
@Data
public class Product {
    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

   @ManyToOne
   @JoinColumn(name = "category_id")
    private ProductCategory category;

    @Column(name="sku")
    private  String sku;

    @Column(name = "name")
    private  String name;

    @Column(name = "description")
    private String description;

    @Column(name = "unit_price")
    private BigDecimal unitPrice;

    @Column(name="active")
    private  boolean active;

    @Column(name = "imageUrl")
    private String imageUrl;

    @Column(name = "units_in_stock")
    private  int unitsInStock;
    @CreationTimestamp
    @Column(name = "date_created")
    private  Date dateCreated;

    @UpdateTimestamp
    @Column(name = "last_updated")
    private Date lastUpdated;

}

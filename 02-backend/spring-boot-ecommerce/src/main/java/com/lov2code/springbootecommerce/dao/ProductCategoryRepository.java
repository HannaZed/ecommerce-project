package com.lov2code.springbootecommerce.dao;

import com.lov2code.springbootecommerce.entity.Product;
import com.lov2code.springbootecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "productCategory",path = "product-category")

public interface ProductCategoryRepository  extends JpaRepository<ProductCategory,Long> {
}

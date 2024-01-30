package com.djouabliamoislam.ecommerceapp.dao;

import com.djouabliamoislam.ecommerceapp.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "productcategory",path = "productcategory")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Long> {
}

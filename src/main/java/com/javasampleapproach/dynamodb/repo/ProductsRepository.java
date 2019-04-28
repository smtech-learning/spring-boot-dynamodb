package com.thecloudthoughts.api.repo;

import java.util.List;

import com.thecloudthoughts.api.model.Product;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface ProductsRepository extends CrudRepository<Product, String> {

    List<Product> findByProductShortName(String productShortName);
}

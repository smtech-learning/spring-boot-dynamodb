package com.javasampleapproach.dynamodb.repo;

import java.util.List;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import com.javasampleapproach.dynamodb.model.Product;

@EnableScan
public interface ProductsRepository extends CrudRepository<Product, String> {

    List<Product> findByProductShortName(String productShortName);
}

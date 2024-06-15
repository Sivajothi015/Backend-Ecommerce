package com.example.ecommerce.repository;

import com.example.ecommerce.entity.Cart;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface CartRepository extends MongoRepository<Cart,String> {

    Optional<Cart> findByUsername(String username);

}

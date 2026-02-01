package com.ecommerce.hcd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.hcd.model.CartItems;

@Repository
public interface CartItemsRepository extends JpaRepository<CartItems, Long> {

}

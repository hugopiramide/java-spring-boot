package com.ecommerce.hcd.service.interfaces;

import java.util.List;
import java.util.Optional;

import com.ecommerce.hcd.model.CartItems;

public interface CartItemsService {

    List<CartItems> findAll();

    Optional<CartItems> findById(Long id);

    CartItems save(CartItems cartItem);

    CartItems update(Long id, CartItems cartItem);
    
    void deleteById(Long id);
}

package com.ecommerce.hcd.service.interfaces;

import java.util.List;
import java.util.Optional;

import com.ecommerce.hcd.model.Cart;

public interface CartService {

    List<Cart> findAll();

    Optional<Cart> findById(Long id);

    Cart save(Cart cart);

    Cart update(Long id, Cart cart);
    
    void deleteById(Long id);
}

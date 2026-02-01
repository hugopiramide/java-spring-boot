package com.ecommerce.hcd.service.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ecommerce.hcd.model.CartItems;
import com.ecommerce.hcd.repository.CartItemsRepository;
import com.ecommerce.hcd.service.interfaces.CartItemsService;

@Service
public class CartItemsServiceImpl implements CartItemsService {

    private final CartItemsRepository cartItemsRepository;

    public CartItemsServiceImpl(CartItemsRepository cartItemsRepository) {
        this.cartItemsRepository = cartItemsRepository;
    }

    @Override
    public List<CartItems> findAll() {
        return cartItemsRepository.findAll();
    }

    @Override
    public Optional<CartItems> findById(Long id) {
        return cartItemsRepository.findById(id);
    }

    @Override
    public CartItems save(CartItems cartItem) {
        return cartItemsRepository.save(cartItem);
    }

    @Override
    public CartItems update(Long id, CartItems cartItem) {
        cartItem.setId(id);
        return cartItemsRepository.save(cartItem);
    }

    @Override
    public void deleteById(Long id) {
        cartItemsRepository.deleteById(id);
    }

}

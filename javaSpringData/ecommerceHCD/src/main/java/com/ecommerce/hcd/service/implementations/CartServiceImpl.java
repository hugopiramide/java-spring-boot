package com.ecommerce.hcd.service.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ecommerce.hcd.model.Cart;
import com.ecommerce.hcd.repository.CartRepository;
import com.ecommerce.hcd.service.interfaces.CartService;
import com.ecommerce.hcd.dto.request.CartRequest;
import com.ecommerce.hcd.dto.response.CartResponse;
import com.ecommerce.hcd.mapper.CartMapper;
import java.util.ArrayList;

@Service
public class CartServiceImpl implements CartService {

    private final CartRepository cartRepository;

    public CartServiceImpl(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    @Override
    public List<Cart> findAll() {
        return cartRepository.findAll();
    }

    @Override
    public Optional<Cart> findById(Long id) {
        return cartRepository.findById(id);
    }

    @Override
    public Cart save(Cart cart) {
        return cartRepository.save(cart);
    }

    @Override
    public Cart update(Long id, Cart cart) {
        cart.setId(id);
        return cartRepository.save(cart);
    }

    @Override
    public void deleteById(Long id) {
        cartRepository.deleteById(id);
    }

    @Override
    public List<CartResponse> findAllDto() {
        List<Cart> list = cartRepository.findAll();
        List<CartResponse> out = new ArrayList<>();
        for (Cart c : list) out.add(CartMapper.toResponse(c));
        return out;
    }

    @Override
    public java.util.Optional<CartResponse> findByIdDto(Long id) {
        return cartRepository.findById(id).map(CartMapper::toResponse);
    }

    @Override
    public CartResponse saveDto(CartRequest req) {
        Cart c = CartMapper.toEntity(req);
        Cart saved = cartRepository.save(c);
        return CartMapper.toResponse(saved);
    }

    @Override
    public CartResponse updateDto(Long id, CartRequest req) {
        Cart c = CartMapper.toEntity(req);
        c.setId(id);
        Cart saved = cartRepository.save(c);
        return CartMapper.toResponse(saved);
    }

}

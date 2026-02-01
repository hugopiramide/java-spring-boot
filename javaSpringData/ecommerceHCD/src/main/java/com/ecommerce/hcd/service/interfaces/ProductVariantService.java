package com.ecommerce.hcd.service.interfaces;

import java.util.List;
import java.util.Optional;

import com.ecommerce.hcd.model.ProductVariant;

public interface ProductVariantService {

    List<ProductVariant> findAll();

    Optional<ProductVariant> findById(Long id);

    ProductVariant save(ProductVariant productVariant);

    ProductVariant update(Long id, ProductVariant productVariant);
    
    void deleteById(Long id);
}

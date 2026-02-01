package com.ecommerce.hcd.service.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ecommerce.hcd.model.ProductVariant;
import com.ecommerce.hcd.repository.ProductVariantRepository;
import com.ecommerce.hcd.service.interfaces.ProductVariantService;

@Service
public class ProductVariantServiceImpl implements ProductVariantService {

    private final ProductVariantRepository productVariantRepository;

    public ProductVariantServiceImpl(ProductVariantRepository productVariantRepository) {
        this.productVariantRepository = productVariantRepository;
    }

    @Override
    public List<ProductVariant> findAll() {
        return productVariantRepository.findAll();
    }

    @Override
    public Optional<ProductVariant> findById(Long id) {
        return productVariantRepository.findById(id);
    }

    @Override
    public ProductVariant save(ProductVariant productVariant) {
        return productVariantRepository.save(productVariant);
    }

    @Override
    public ProductVariant update(Long id, ProductVariant productVariant) {
        productVariant.setId(id);
        return productVariantRepository.save(productVariant);
    }

    @Override
    public void deleteById(Long id) {
        productVariantRepository.deleteById(id);
    }

}

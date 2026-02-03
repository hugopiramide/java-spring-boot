package com.ecommerce.hcd.service.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ecommerce.hcd.model.Product;
import com.ecommerce.hcd.repository.ProductRepository;
import com.ecommerce.hcd.service.interfaces.ProductService;
import com.ecommerce.hcd.dto.request.ProductRequest;
import com.ecommerce.hcd.dto.response.ProductResponse;
import com.ecommerce.hcd.mapper.ProductMapper;
import java.util.ArrayList;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;


    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product update(Long id, Product product) {
        product.setId(id);
        return productRepository.save(product);
    }

    @Override
    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public List<ProductResponse> findAllDto() {
        List<Product> list = productRepository.findAll();
        List<ProductResponse> out = new ArrayList<>();
        for (Product p : list) out.add(ProductMapper.toResponse(p));
        return out;
    }

    @Override
    public java.util.Optional<ProductResponse> findByIdDto(Long id) {
        return productRepository.findById(id).map(ProductMapper::toResponse);
    }

    @Override
    public ProductResponse saveDto(ProductRequest req) {
        Product p = ProductMapper.toEntity(req, null);
        Product saved = productRepository.save(p);
        return ProductMapper.toResponse(saved);
    }

    @Override
    public ProductResponse updateDto(Long id, ProductRequest req) {
        Product p = ProductMapper.toEntity(req, null);
        p.setId(id);
        Product saved = productRepository.save(p);
        return ProductMapper.toResponse(saved);
    }

}

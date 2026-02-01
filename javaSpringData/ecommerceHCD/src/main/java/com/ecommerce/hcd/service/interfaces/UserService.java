package com.ecommerce.hcd.service.interfaces;

import java.util.List;
import java.util.Optional;

import com.ecommerce.hcd.model.User;

public interface UserService {

    List<User> findAll();

    Optional<User> findById(Long id);

    User save(User user);
    
    User update(Long id, User user);

    void deleteById(Long id);
}

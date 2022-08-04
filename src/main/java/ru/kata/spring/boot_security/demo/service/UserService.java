package ru.kata.spring.boot_security.demo.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService extends UserDetailsService {

    List<User> findAll();
    User findById(Long id);
    void save(User user);
    void update(Long id, User updateUser);
    void delete(Long id);
    List<Role> listRoles();


    ///////////////////////////////

    void saveUser(User user);




}

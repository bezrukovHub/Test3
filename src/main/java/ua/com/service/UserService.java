package ua.com.service;

import ua.com.entity.User;

import java.util.List;

public interface UserService {

    void save(User user);
    List<User> findAll();
    User findOne(int id);
    void delete(int id);
    
}

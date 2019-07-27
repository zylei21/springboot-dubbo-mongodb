package com.cibei.api;

import com.cibei.entity.User;

import java.util.List;
import java.util.Optional;

/**
 * Demo class
 *
 * @author leishufeng
 * @date 2019/07/26 16:24
 */
public interface UserApi{
    Optional<User> findByName(String name);
    List<User> findAllByAge(Integer age);
    List<User> findAllUser();
    void saveUser(User user);
    void deleteUser(User user);
    void updateUser(User user);
}

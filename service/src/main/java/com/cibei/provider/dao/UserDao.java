package com.cibei.provider.dao;

import com.cibei.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

/**
 * Demo class
 *
 * @author leishufeng
 * @date 2019/07/26 16:41
 */
public interface UserDao extends MongoRepository<User,Integer> {
    Optional<User> findByName(String name);
    List<User> findAllByAge(Integer age);
}

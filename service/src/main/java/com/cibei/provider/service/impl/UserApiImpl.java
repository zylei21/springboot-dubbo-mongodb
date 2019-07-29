package com.cibei.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.cibei.api.UserApi;
import com.cibei.provider.dao.UserDao;
import com.cibei.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 * Demo class
 *
 * @author leishufeng
 * @date 2019/07/26 16:35
 */
@Service
@Component
public class UserApiImpl implements UserApi {
    @Autowired
    UserDao userDao;

    @Override
    public Optional<User> findByName(String name) {
        return userDao.findByName(name);
    }

    @Override
    public List<User> findAllByAge(Integer age) {
        return userDao.findAllByAge(age);
    }

    @Override
    public List<User> findAllUser() {
        return userDao.findAll();
    }

    @Override
    public void saveUser(User user) {
        userDao.insert(user);
    }

    @Override
    public void deleteUser(User user) {
        userDao.delete(user);
    }

    @Override
    public void updateUser(User user) {
        Optional<User> user1 = userDao.findById(user.getId());
        userDao.delete(user1.get());
        userDao.insert(user);
    }
}

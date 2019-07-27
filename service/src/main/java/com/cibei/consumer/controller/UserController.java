package com.cibei.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cibei.api.UserApi;
import com.cibei.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/**
 * Demo class
 *
 * @author leishufeng
 * @date 2019/07/26 16:58
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Reference
    @Autowired
    UserApi userApi;

    @GetMapping("/{name}")
    public Optional<User> findByName(@PathVariable String name){
        return userApi.findByName(name);
    }
    @GetMapping
    public List<User>findAll(){
        return userApi.findAllUser();
    }
}

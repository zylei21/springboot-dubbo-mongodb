package com.cibei;

import com.cibei.entity.User;
import com.cibei.provider.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Demo class
 *
 * @author leishufeng
 * @date 2019/07/26 17:22
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {
    @Autowired
    UserDao userDao;
    @Test
    public void demo1(){
        userDao.deleteAll();
        userDao.insert(new User(1,"张三","男",20));
        userDao.insert(new User(2,"李四","男",21));
        userDao.insert(new User(3,"王武","男",22));

        List<User> all = userDao.findAll();
        System.err.println(all);
    }
}

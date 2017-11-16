package cn.xinge.demo.controller;

import cn.xinge.demo.entity.User;
import cn.xinge.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenxinghua on 2017/10/25.
 * 集成Redis测试环境，将数据读取出来并存在Redis中
 */
@RestController
public class RedisTest {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/{id}",method = {RequestMethod.GET})
    public User getUser(@PathVariable Integer id){
        return userService.getUser(id);
    }
}


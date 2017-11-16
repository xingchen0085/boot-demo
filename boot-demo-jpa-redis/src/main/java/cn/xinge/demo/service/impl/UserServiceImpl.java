package cn.xinge.demo.service.impl;

import cn.xinge.demo.dao.UserDao;
import cn.xinge.demo.entity.User;
import cn.xinge.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by chenxinghua on 2017/10/25.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    //Redis缓存
//    @Cacheable(value = "user-key")
    public User getUser(Integer id) {
        System.out.println("方法已执行，此时前往数据库.");
        return userDao.findOne(id);
    }
}

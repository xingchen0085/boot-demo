package cn.xinge.demo.service;

import cn.xinge.demo.entity.User;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by chenxinghua on 2017/10/25.
 */
public interface UserService {
    public void save(User user);

    User getUser(Integer id);
}

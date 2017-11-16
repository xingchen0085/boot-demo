package cn.xinge.demo.dao;

import cn.xinge.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by chenxinghua on 2017/10/25.
 */
public interface UserDao extends JpaRepository<User, Integer> {
    //内置有很多方法
}

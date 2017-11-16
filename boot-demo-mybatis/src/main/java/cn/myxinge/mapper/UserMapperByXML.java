package cn.myxinge.mapper;

import cn.myxinge.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by chenxinghua on 2017/11/16.
 * 使用xml配置的Mapper
 */
public interface UserMapperByXML {
    /**
     * 查找全部用户信息
     *
     * @return all users
     */
    public List<User> findAll();

    /**
     * 添加用户信息
     *
     * @param user user obj
     */
    public void inser(User user);


    /**
     * 根据 id 删除用户信息
     *
     * @param uid 用户id
     */
    public void delete(Integer uid);
}

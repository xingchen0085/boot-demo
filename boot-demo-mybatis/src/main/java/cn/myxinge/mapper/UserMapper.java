package cn.myxinge.mapper;

import cn.myxinge.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by chenxinghua on 2017/11/16.
 * 持久层Mapper类
 */
public interface UserMapper {
    /**
     * 查找全部用户信息
     * @return all users
     */
    @Select("select * from user")
    @Results({
            @Result(property = "uid",column = "id"),
            @Result(property = "username",column = "name")
    })
    public List<User> findAll();

    /**
     * 添加用户信息
     * @param user user obj
     */
    @Insert("insert into user values (null,#{username},#{age})")
    public void inser(User user);


    /**
     * 根据 id 删除用户信息
     * @param uid 用户id
     */
    @Delete("delete from user where id = #{value}")
    public void delete(Integer uid);
}







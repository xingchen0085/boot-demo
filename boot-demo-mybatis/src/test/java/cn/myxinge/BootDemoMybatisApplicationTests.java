package cn.myxinge;

import cn.myxinge.mapper.UserMapper;
import cn.myxinge.mapper.UserMapperByXML;
import cn.myxinge.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("cn.myxinge.mapper")
public class BootDemoMybatisApplicationTests {

    //引入mapper
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserMapperByXML userMapperByXML;

    /**
     * 测试mybatis配置是否完成
     */
	@Test
	public void testAnno() {
        List<User> users = userMapper.findAll();
        System.out.println(users);
        //----------------------------
        User user = new User();
        user.setUsername("这是测试数据 Name");
        user.setAge(100);
       // userMapper.inser(user);

        //------------
        userMapper.delete(10);
    }

    @Test
    public void testXml() {
        List<User> users = userMapperByXML.findAll();
        System.out.println(users);
        //----------------------------
//        User user = new User();
//        user.setUsername("这是测试数据 Name");
//        user.setAge(100);
//        userMapperByXML.inser(user);
//
//        //------------
        userMapperByXML.delete(11);
    }
}

package cn.xinge.demo;

import cn.xinge.demo.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootDemoJpaApplicationTests {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private RedisTemplate redisTemplate;

    //普通测试
    @Test
    public void contextLoads() {
        //存值
        //stringRedisTemplate.opsForValue().set("a","AAA");
        //取值
        String result = stringRedisTemplate.opsForValue().get("a");
        System.out.println(result);
    }

    //过期时间测试
    @Test
    public void testValiTime() throws InterruptedException {
        User user = new User();
        user.setId(1);
        user.setName("张三");
        user.setAge(15);
        //时间单位1秒
        redisTemplate.opsForValue().set("user", user, 1, TimeUnit.SECONDS);
        //睡1秒
        Thread.sleep(1000);
        //还在不在？
        Boolean isExists = redisTemplate.hasKey("user");
        if (!isExists) {
            System.out.println("缓存已过期，user键不存在");
        }

    }
}

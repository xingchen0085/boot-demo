package cn.xinge.demo.controller;

import cn.xinge.demo.entity.User;
import cn.xinge.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by chenxinghua on 2017/10/25.
 * 测试JPA最简单的添加数据功能
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Value("${helloMsg}")
    private String helloMsg;
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/save", method = {RequestMethod.POST})
    public String save(User user,Model model) {

        System.out.println("请求到达>>>" + user);
        userService.save(user);

        model.addAttribute("name",user.getName());
        model.addAttribute("helloMsg",helloMsg);

        return "test";
    }
}

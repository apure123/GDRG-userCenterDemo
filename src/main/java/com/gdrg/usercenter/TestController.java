package com.gdrg.usercenter;

import com.gdrg.usercenter.dao.user.UserTableMapper;
import com.gdrg.usercenter.domain.entity.user.UserTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    /*@GetMapping("get1")
    public String gets(){
        return "hello1";
    }
*/
    @Autowired
    private UserTableMapper userTableMapper;


    @GetMapping("test")
    public UserTable insertUser(){
        UserTable user=new UserTable();
        user.setUsername("zhangsan");
        user.setRoles("user");
        user.setWxId("wx_123123");

        this.userTableMapper.insertSelective(user);
        return user;
    }


    @GetMapping("/get1")
    public String get1(){
        return "hello1";
    }

}

package com.gdrg.usercenter.controller.user;

import com.gdrg.usercenter.domain.entity.user.UserTable;
import com.gdrg.usercenter.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//将api放在/user下面
@RestController
@RequestMapping("/user")
public class UserController {

    //注入service
    @Autowired
    private UserService userService;

    //使用了路径参数注解
    @GetMapping("/{id}")
    public UserTable findeById(@PathVariable Integer id){
        return this.userService.findById(id);
    }

}

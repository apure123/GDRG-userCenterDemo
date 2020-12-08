package com.gdrg.usercenter.service.user;

import com.gdrg.usercenter.dao.user.UserTableMapper;
import com.gdrg.usercenter.domain.entity.user.UserTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired(required = false)
    private UserTableMapper userMapper;

    public UserTable findById(Integer id){
        //这里使用了mapper代码，会自动生成sql查询语句
        return this.userMapper.selectByPrimaryKey(id);
    }
}

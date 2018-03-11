package com.wjh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wjh.dao.UserMapper;
import com.wjh.entity.User;
import com.wjh.service.UserServiceI;

/**
 * @author gacl
 * ʹ��@Serviceע�⽫UserServiceImpl���עΪһ��service
 * service��id��userService
 */
@Service("userService")
public class UserServiceImpl implements UserServiceI {

    /**
     * ʹ��@Autowiredע���עuserMapper������
     * ����Ҫʹ��UserMapperʱ��Spring�ͻ��Զ�ע��UserMapper
     */
    @Autowired
    private UserMapper userMapper;//ע��dao

    public void addUser(User user) {
        userMapper.insert(user);
    }

	public User getUserById(String userId) {
		// TODO Auto-generated method stub
		 return userMapper.selectByPrimaryKey(userId);
	}

	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userMapper.getAllUser();
	}

}
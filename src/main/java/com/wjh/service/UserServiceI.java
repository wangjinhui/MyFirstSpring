package com.wjh.service;

import java.util.List;

import com.wjh.entity.User;

public interface UserServiceI {

    /**
     * ����û�
     * @param user
     */
    void addUser(User user);
    
    /**
     * �����û�id��ȡ�û�
     * @param userId
     * @return
     */
    User getUserById(String userId);
    
    /**��ȡ�����û���Ϣ
     * @return List<User>
     */
    List<User> getAllUser();
}

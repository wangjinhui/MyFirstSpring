package com.sillyboy.customer.modules.serviceImpl;

import com.sillyboy.customer.modules.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by sillyboy on 2018/1/14
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public String init() {
        return "1";
    }
}
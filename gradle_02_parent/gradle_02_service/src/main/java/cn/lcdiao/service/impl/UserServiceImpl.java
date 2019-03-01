package cn.lcdiao.service.impl;

import cn.lcdiao.dao.UserDao;
import cn.lcdiao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by diao on 2019/3/1
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public String save() {
        return userDao.save();
    }
}

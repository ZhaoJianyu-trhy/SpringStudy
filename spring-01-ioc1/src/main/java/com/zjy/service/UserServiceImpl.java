package com.zjy.service;

import com.zjy.dao.UserDao;
import com.zjy.dao.UserDaoImpl;
import com.zjy.dao.UserDaoMysqlImpl;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}

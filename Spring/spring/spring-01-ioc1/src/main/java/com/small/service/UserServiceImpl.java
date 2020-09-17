package com.small.service;

import com.small.dao.UserDao;
import com.small.dao.UserDaoImpl;
import com.small.dao.UserDaoMysqlImpl;

/**
 * @author smallYJ
 */
public class UserServiceImpl implements UserService{
    /**
     * 这是Java的组合
     * userDao实现,写死了new一个对象
     */
//    private UserDao userDao = new UserDaoImpl();

    /**
     * 用户需要数据库的东西,就需要添加数据库的实现
     */
//    private UserDao userDaoMysql = new UserDaoMysqlImpl();

    /**
     * 使用set进行动态实现值的注入!!!
     * 类似于多态
     */
    private UserDao userDao;
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}

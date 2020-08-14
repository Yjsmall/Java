package com.small.dao;

import com.small.pojo.User;

import java.util.List;

/**
 * 接口操作User表
 * @author smallYJ
 */
public interface UserDao {
    /**
     * 查询User表中的所有数据
     * @return 集合
     */
    List<User> getUserList();

    /**
     * 插入方法
     * @param user
     * @return 返回影响的行数
     */
    int insertUser(User user);
}

package com.small.dao;

import com.small.domain.User;

import java.util.List;

/**
 * @author smallYJ
 */
public interface UserDao {
    /**
     * 返回数据库查询
     * @return
     */
    List<User> userList();

    /**
     * 影响行数
     * @param user
     * @return
     */
    int insertUser(User user);

}

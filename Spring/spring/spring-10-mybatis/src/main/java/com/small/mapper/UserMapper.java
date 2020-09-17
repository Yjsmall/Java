package com.small.mapper;


import com.small.pojo.User;

import java.util.List;

/**
 * @author smallYJ
 */
public interface UserMapper {
    /**
     * 返回一个结合
     * @return
     */
    public List<User> selectUser();
}

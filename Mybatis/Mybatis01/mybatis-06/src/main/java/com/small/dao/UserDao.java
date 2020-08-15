package com.small.dao;

import com.small.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author smallYJ
 */
public interface UserDao {
    /**
     * 动态sql,使用Java对象作为参数
     * @param user
     * @return
     */
    List<User> selectUserIf(User user);

    /**
     * where使用
     * @param user
     * @return
     */
    List<User> selectUserWhere(User user);

    /**
     * foreach用法1
     * @param idList
     * @return
     */
    List<User> selectForeachOne(List<Integer> idList);

    /**
     * 循环一个对象
     * @param userList
     * @return
     */
    List<User> selectForeachTwo(List<User> userList);

    /**
     * 使用PageHelper分页数据
     * @return
     */
    List<User> selectAll();

}

package com.small.dao.impl;

import com.small.dao.UserDao;
import com.small.domain.User;
import com.small.utlis.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author smallYJ
 */
public class UserDaoImpl implements UserDao {
    @Override
    public List<User> userList() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        String sqlId = "com.small.dao.UserDao.userList";

        List<User> Users = sqlSession.selectList(sqlId);
        sqlSession.close();
        return Users;
    }

    @Override
    public int insertUser(User user) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        String sqlId = "com.small.dao.UserDao.insertUser";
        int num = sqlSession.insert(sqlId,user);
        sqlSession.commit();
        sqlSession.close();
        return num;
    }
}

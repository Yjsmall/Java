package com.small.dao;

import com.small.pojo.User;
import com.small.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void test(){
        //第一步:获取SqlSession对象
        SqlSession sqlSession = MybatisUtils.sqlSession();

        //方式一:getMapper
        UserDao UserDao = sqlSession.getMapper(UserDao.class);
        List<User> userList = UserDao.getUserList();

        for (User user : userList){
            System.out.println(user);
        }

        //方式二:不推荐
        List<User> userList1= sqlSession.selectList("com.small.dao.UserDao.getUserList");
        for (User user : userList1) {
            System.out.println(user);
        }


        //关闭sqlSession
        sqlSession.close();
    }
}

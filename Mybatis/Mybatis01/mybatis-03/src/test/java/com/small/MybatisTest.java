package com.small;

import com.small.dao.UserDao;
import com.small.dao.impl.UserDaoImpl;
import com.small.domain.User;
import com.small.utlis.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MybatisTest {
    @Test
    public void userSelectTest(){
        /**
         * 使用mybatis的动态代理机制,使用SqlSession.getMapper(dao接口)
         * getMapper能获取dao接口对于的实现类对象
         */

        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao dao = sqlSession.getMapper(UserDao.class);
        System.out.println("dao:" + dao.getClass().getName());
        //dao:com.sun.proxy.$Proxy8 jdk的动态代理


        //调用dao的方法,执行数据库的操作
        List<User> users = dao.userList();
        users.forEach(user -> System.out.println(user));
    }

    @Test
    public void insertTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao dao = sqlSession.getMapper(UserDao.class);
        User user = new User(9,"我爱你","你爱我");
        int i = dao.insertUser(user);
        System.out.println("添加对象的数量是:" + i);
    }
}

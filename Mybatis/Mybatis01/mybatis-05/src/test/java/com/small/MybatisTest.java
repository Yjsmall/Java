package com.small;

import com.small.dao.UserDao;
import com.small.domain.MyUser;
import com.small.domain.User;
import com.small.utlis.MybatisUtils;
import com.small.vo.QueryParam;
import com.small.vo.ViewUser;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MybatisTest {
    @Test
    public void userSelectByIdTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao dao = sqlSession.getMapper(UserDao.class);

        User user = dao.selectUserById(1);
        System.out.println("User=" + user);
    }

    @Test
    public void selectMultiParamTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao dao = sqlSession.getMapper(UserDao.class);

        List<User> users = dao.selectMulitParam("张三", "1234");
        users.forEach(user -> System.out.println(user));
        sqlSession.close();
    }

    @Test
    public void selectViewUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao dao = sqlSession.getMapper(UserDao.class);

        ViewUser user = dao.selectUserReturnViewUser(1);
        System.out.println("1号用户是:"+user);

        sqlSession.close();
    }

    @Test
    public void selectMap(){

        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao dao = sqlSession.getMapper(UserDao.class);
        Map<Object, Object> map = dao.selectMapById(2);
        System.out.println("map==" + map);

        sqlSession.close();
    }

    @Test
    public void selectAllMap(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao dao = sqlSession.getMapper(UserDao.class);
        List<User> users = dao.selectAllUser();
        users.forEach(user -> System.out.println(user));

        sqlSession.close();
    }

    @Test
    public void selectMyUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao dao = sqlSession.getMapper(UserDao.class);
        List<MyUser> users = dao.selectMyUser();

        users.forEach(user -> System.out.println(user));
        sqlSession.close();
    }

    @Test
    public void selectDiffTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao dao = sqlSession.getMapper(UserDao.class);
        List<MyUser> users = dao.selectDiffColProperty();

        users.forEach(user -> System.out.println(user));
        sqlSession.close();
    }

    @Test
    public void selectLikeOneTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao dao = sqlSession.getMapper(UserDao.class);

        //准备好like内容
        String name = "张%";
        List<User> users = dao.selectLikeOne(name);

        users.forEach(user -> System.out.println(user));
        sqlSession.close();
    }

    @Test
    public void selectLikeTwoTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao dao = sqlSession.getMapper(UserDao.class);

        //准备好like内容
        String name = "李";
        List<User> users = dao.selectLikeTwo(name);

        users.forEach(user -> System.out.println(user));
        sqlSession.close();
    }



}


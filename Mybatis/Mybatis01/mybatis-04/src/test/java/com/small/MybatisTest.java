package com.small;

import com.small.dao.UserDao;
import com.small.domain.User;
import com.small.utlis.MybatisUtils;
import com.small.vo.QueryParam;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

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
    public void queryParam(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao dao = sqlSession.getMapper(UserDao.class);

        QueryParam param = new QueryParam();
        param.setParamId(2);
        param.setParamName("张三");
        List<User> users = dao.selectMultiObject(param);

        users.forEach(user -> System.out.println(user));
        sqlSession.close();
    }

    @Test
    public void selectPosition(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao dao = sqlSession.getMapper(UserDao.class);

        List<User> users = dao.selectPosition(1,"张三");

        users.forEach(user -> System.out.println(user));
        sqlSession.close();
    }

    @Test
    public void selectMap(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao dao = sqlSession.getMapper(UserDao.class);

        HashMap<String, Object> data = new HashMap<>();
        data.put("myname","张三");
        data.put("id",2);

        List<User> users = dao.selectMap(data);

        users.forEach(user -> System.out.println(user));
        sqlSession.close();

    }
    @Test
    public void select$Order(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao dao = sqlSession.getMapper(UserDao.class);

        List<User> users = dao.select$Order("name");

        users.forEach(user -> System.out.println(user));
        sqlSession.close();

    }

}


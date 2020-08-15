package com.small;

import com.github.pagehelper.PageHelper;
import com.small.dao.UserDao;
import com.small.domain.User;
import com.small.utlis.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MybatisTest {
    @Test
    public void selectUserIf() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao dao = sqlSession.getMapper(UserDao.class);

        User user = new User();
        user.setId(3);
        user.setName("李四");
        List<User> users = dao.selectUserIf(user);
        users.forEach(user1 -> System.out.println(user1));
    }

    @Test
    public void selectUserWhere() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao dao = sqlSession.getMapper(UserDao.class);

        User user = new User();
        user.setId(3);
        user.setName("李四");

        List<User> users = dao.selectUserWhere(user);
        users.forEach(user1 -> System.out.println(user1));
    }

    @Test
    public void forTest() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        String sql = "select * from user where id in";
        StringBuilder builder = new StringBuilder();
        int init = 0;
        int len = list.size();

        builder.append("(");
        for (Integer i : list) {
            builder.append(i).append(",");
        }
        builder.deleteCharAt(builder.length() - 1);

        //循环结束
        builder.append(")");
        sql = sql + builder.toString();
        System.out.println("sql==" + sql);

    }

    @Test
    public void selectForTest() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao dao = sqlSession.getMapper(UserDao.class);
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        List<User> users = dao.selectForeachOne(list);
        users.forEach(user -> System.out.println(user));
    }

    @Test
    public void selectForTestTwo() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao dao = sqlSession.getMapper(UserDao.class);
        List<User> userList = new ArrayList<>();

        User user1 = new User();
        user1.setId(3);
        userList.add(user1);

        user1 = new User();
        user1.setId(7);
        userList.add(user1);

        List<User> users = dao.selectForeachTwo(userList);

        users.forEach(user -> System.out.println(user));
    }

    @Test
    public void selectAll() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao dao = sqlSession.getMapper(UserDao.class);

        /**
         * 加入PageHelper的方法,分页
         * pageNum:第几页,从1开始
         * pageSize: 一页有多少行数据
         */
        PageHelper.startPage(1,3);

        List<User> users = dao.selectAll();
        users.forEach(user -> System.out.println(user));
    }
}


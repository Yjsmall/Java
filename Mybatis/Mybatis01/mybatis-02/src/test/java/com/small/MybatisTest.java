package com.small;

import com.small.dao.UserDao;
import com.small.dao.impl.UserDaoImpl;
import com.small.domain.User;
import org.junit.Test;

import java.util.List;

public class MybatisTest {
    @Test
    public void userSelectTest(){
        UserDao dao = new UserDaoImpl();
        List<User> users = dao.userList();
        for(User user: users){
            System.out.println(user);
        }
    }

    @Test
    public void insertTest(){
        UserDao dao = new UserDaoImpl();
        User user = new User(8,"small","aaaa");
        int i = dao.insertUser(user);
        System.out.println("添加的数量是" + i);
    }
}

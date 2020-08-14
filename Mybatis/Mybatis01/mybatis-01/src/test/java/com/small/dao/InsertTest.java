package com.small.dao;

import com.small.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class InsertTest {
    @Test
    public void insertTest() throws IOException {
        //访问mybatis读取student数据
        //1.定义mybatis主配置文件的名称,从类路径的root开始(target/clasess)
        String config = "mybatis-config.xml";

        //2.读取config文件
        InputStream in = Resources.getResourceAsStream(config);

        //3. 创建对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

        //4.创建工厂对象
        SqlSessionFactory factory = builder.build(in);

        //5. 获取SqlSession对象,从工厂获取
        SqlSession sqlSession = factory.openSession(true);

        //6.[重点] 指定要执行的sql语句
        String sqlId = "com.small.dao.UserDao.insertUser";

        //7.[重点] 执行sql语句
        User user1 = new User();
        user1.setId(5);
        user1.setName("世界");
        user1.setPwd("1234");
        int num = sqlSession.insert(sqlId,user1);

//        sqlSession.commit();
        //8.输出结果
        System.out.println("影响的行数是" +num);

        //9.关闭sqlSession对象
        sqlSession.close();
    }
}

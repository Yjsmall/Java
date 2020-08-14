package com.kuangshen.lesson01;


import java.sql.*;

/**
 * 我的第一个JDBC程序
 * 用Java代码来实现可视化操作
 * @author smallYJ
 */
public class JdbcFirstDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");

        //2.用户信息
        //userUnicode=true&&character=utf8&&useSSL=true
        String url = "jdbc:mysql://localhost:3306/jdbcstudy?useUnicode=true&characterEncoding=utf8&useSSL=false";
        String username = "root";
        String password = "123456";

        //3.连接成功，返回数据库对象，就可以对数据库操作
        //Connection 代表数据库
        Connection connection = DriverManager.getConnection(url,username,password);

        //4.执行SQL对象 Statement 执行sql的对象
        Statement statement = connection.createStatement();

        //5. 执行sql的对象去执行sql，可以存在结果，查看返回结果
        String sql = "SELECT * FROM users";
        //返回一个结果集
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()){
            System.out.println("id=" + resultSet.getObject("id"));
            System.out.println("name=" + resultSet.getObject("NAME"));
            System.out.println("pwd=" + resultSet.getObject("PASSWORD"));
            System.out.println("email=" + resultSet.getObject("email"));
            System.out.println("birthday=" + resultSet.getObject("birthday"));
        }

        //6.释放连接
        resultSet.close();
        statement.close();
        connection.close();
    }
}

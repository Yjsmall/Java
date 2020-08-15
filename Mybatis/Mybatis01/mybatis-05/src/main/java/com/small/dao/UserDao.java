package com.small.dao;

import com.small.domain.MyUser;
import com.small.domain.User;
import com.small.vo.QueryParam;
import com.small.vo.ViewUser;
import org.apache.ibatis.annotations.Param;

import javax.print.DocFlavor;
import java.util.List;
import java.util.Map;

/**
 * @author smallYJ
 */
public interface UserDao {
    /**
     * 传入一个简单类型的参数:8个基本类型和String
     * 在Mapper文件获取简单类型的一个参数值---#{任意字符}
     *

     * @param id
     * @return
     */
    User selectUserById(@Param("UserId")Integer id);

    /**
     * 多个参数:命名参数,在形参定义的前面加入@Param("自定义参数名称")
     * @param name
     * @param pwd
     * @return
     */
    List<User> selectMulitParam(@Param("myname") String name,@Param("mypwd") String pwd);

    /**
     * 返回这个类型
     * @param id
     * @return
     */
    ViewUser selectUserReturnViewUser(@Param("uid")Integer id);

    /**
     * 返回数据行数
     * @return
     */
    int countUser();

    /**
     * 定义方法返回Map
     * @param id
     * @return
     */
    Map<Object,Object> selectMapById(Integer id);

    /**
     * resultMap自定义映射关系
     * @return
     */
    List<User> selectAllUser();

    /**
     * 返回另外一个
     * @return
     */
    List<MyUser> selectMyUser();

    /**
     * 第二种方式
     * @return
     */
    List<MyUser> selectDiffColProperty();

    /**
     * 第一种:模糊查询
     * @param name
     * @return
     */
    List<User> selectLikeOne(String name);

    /**
     * 第二种:在mapper拼接方式
     * @param name
     * @return
     */
    List<User> selectLikeTwo(String name);
}

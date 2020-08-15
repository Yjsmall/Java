package com.small.dao;

import com.small.domain.User;
import com.small.vo.QueryParam;
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
    User selectUserById(Integer id);

    /**
     * 多个参数:命名参数,在形参定义的前面加入@Param("自定义参数名称")
     * @param name
     * @param pwd
     * @return
     */
    List<User> selectMulitParam(@Param("myname") String name,@Param("mypwd") String pwd);

    /**
     * 多个参数,使用Java对象作为接口中方法的参数
     * @param param
     * @return
     */
    List<User> selectMultiObject(QueryParam param);

    /**
     * 简单类型,位置查询(了解即可)
     * @param id
     * @param name
     * @return
     */
    List<User> selectPosition(Integer id,String name);

    /**
     * 多个参数,使用Map存放多个值(了解即可)
     * @param map
     * @return
     */
    List<User> selectMap(Map<String,Object> map);

    /**
     * $查询列名
     * @param name
     * @return
     */
    List<User> select$Order(@Param("colName") String name);
}

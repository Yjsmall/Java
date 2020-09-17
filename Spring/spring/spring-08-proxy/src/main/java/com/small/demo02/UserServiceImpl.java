package com.small.demo02;

/**
 * @author smallYJ
 */
public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("add a user");
    }

    @Override
    public void delete() {
        System.out.println("delete a user");
    }

    @Override
    public void update() {
        System.out.println("update a user");
    }

    @Override
    public void query() {
        System.out.println("query a user");
    }

    /**
     * 1. 这些代码再修改非常麻烦,而且固定,人家这个就是只实现这个
     */
}

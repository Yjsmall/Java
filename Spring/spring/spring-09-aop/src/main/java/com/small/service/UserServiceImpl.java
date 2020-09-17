package com.small.service;

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
    public void upadate() {
        System.out.println("update a user");
    }

    @Override
    public void select() {
        System.out.println("select a user");
    }
}

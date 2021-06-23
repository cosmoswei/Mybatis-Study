package com.wei.dao;

import com.wei.pojo.User;

import java.util.List;

/**
 * @author 21170
 */
public interface UserDao {

    List<User> getUserList();

    User getUserById(int id);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int id);
}

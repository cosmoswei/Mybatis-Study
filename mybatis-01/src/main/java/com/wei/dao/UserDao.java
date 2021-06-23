package com.wei.dao;

import com.wei.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author 21170
 */
public interface UserDao {

    List<User> getUserList();

    User getUserById(int id);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int id);

    List<User> getUserListByLimit(Map<String, Integer> map);

    List<User> getUserListByRowBounds(Map<String, Integer> map);

}

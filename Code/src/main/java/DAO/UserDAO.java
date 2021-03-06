package DAO;

import Entity.User;

import java.util.List;

/**
 * Created by zheng on 2017/10/7.
 */
public interface UserDAO {

    List getUsers();

    User getUser(Integer id);

    User getUser(String UserName, String PassWord);

    void addUser(User user);

    void updateUser(User user);

    String deleteUser(Integer id);

}

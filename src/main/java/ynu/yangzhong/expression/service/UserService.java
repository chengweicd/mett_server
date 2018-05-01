package ynu.yangzhong.expression.service;

import ynu.yangzhong.expression.entity.User;

import java.util.List;

public interface UserService {

    /*查询所有的用户*/
    List<User> findAllUser();

    /*添加用户*/
    User addUser(String username,String password,String email);

    /*根据ID查询用户*/
    User findById(String id);

    /*更新User的信息*/
    User updateUser(String id,String username,String password,String email);

    /*根据id删除user*/
    void deleteUser(String id);

    /*根据username查询user*/
    User findByUsername(String username);
}

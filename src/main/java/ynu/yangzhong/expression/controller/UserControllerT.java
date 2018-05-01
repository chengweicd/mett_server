package ynu.yangzhong.expression.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ynu.yangzhong.expression.entity.ResEntity;
import ynu.yangzhong.expression.entity.User;
import ynu.yangzhong.expression.service.UserService;
import ynu.yangzhong.expression.statuscode.ResCode;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserControllerT {
    @Autowired
    private UserService userService;

    /*查询所有的用户*/
    @RequestMapping("/getAllUser")
    public ResEntity getAllUser(){

        ResEntity resEntity=new ResEntity(ResCode.SUCCESS,userService.findAllUser());
        return resEntity;
    }

    /*添加用户*/
    @PostMapping("/addUser")
    public ResEntity addUser(@RequestParam("username") String username,@RequestParam("password") String password,
                        @RequestParam("email") String email){
        ResEntity resEntity=new ResEntity(ResCode.SUCCESS,userService.addUser(username,password,email));

        return resEntity;

    }

    /*根据id查询用户*/
    @GetMapping("/getUser/{id}")
    public ResEntity findById(@PathVariable("id") String id){

        ResEntity resEntity=new ResEntity(ResCode.SUCCESS,userService.findById(id));
        return resEntity;
    }



    /*更新用户数据，使用PUt*/
    @PutMapping("/updateUser/{id}")
    public ResEntity updateUser(@PathVariable("id") String id,@RequestParam("username") String username,
                           @RequestParam("password") String password, @RequestParam("email") String email){

        ResEntity resEntity=new ResEntity(ResCode.SUCCESS,userService.updateUser(id,username,password,email));

        return resEntity;

    }

    /*删除user根据id*/
    @DeleteMapping("/deleteUser/{id}")
    public ResEntity deleteUser(@PathVariable("id") String id){

        userService.deleteUser(id);
        ResEntity resEntity=new ResEntity(ResCode.SUCCESS);


        return resEntity;
    }

    /*查询user根据username*/
    @GetMapping("/findByUsername/{username}")
    public ResEntity findByUsername(@PathVariable("username") String username){

        User user=userService.findByUsername(username);
        if (null==user){
            ResEntity resEntity=new ResEntity(ResCode.USERNOTEXIST);
            return resEntity;
        }else {
            ResEntity resEntity=new ResEntity(ResCode.SUCCESS,userService.findByUsername(username));
            return resEntity;
        }

        //System.out.printf(String.valueOf(userService.findByUsername(username)));

    }
}

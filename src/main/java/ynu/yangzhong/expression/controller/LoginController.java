package ynu.yangzhong.expression.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ynu.yangzhong.expression.entity.ReqUser;
import ynu.yangzhong.expression.entity.ResEntity;
import ynu.yangzhong.expression.entity.User;
import ynu.yangzhong.expression.service.UserService;
import ynu.yangzhong.expression.statuscode.ResCode;

import javax.validation.Valid;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResEntity login(@RequestBody @Valid ReqUser reqUser){

        User user=userService.findByUsername(reqUser.getUsername());
        if (null==user){
            return new ResEntity(ResCode.USERNOTEXIST);
        }else if (reqUser.getPassword().equals(user.getPassword())){
            return new ResEntity(ResCode.LOGINSUCCESS,user);
        }else{
            return new ResEntity(ResCode.PASSWORDERRO);
        }

    }
}

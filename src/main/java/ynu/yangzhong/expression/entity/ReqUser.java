package ynu.yangzhong.expression.entity;

import javax.validation.constraints.NotBlank;

public class ReqUser {

    private String username;
    private String password;

    @NotBlank(message = "用户名不能为空")
    public String getUsername() {
        return username;
    }

    @NotBlank(message = "密码不能为空")
    public String getPassword() {
        return password;
    }
}

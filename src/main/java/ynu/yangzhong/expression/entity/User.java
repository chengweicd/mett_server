package ynu.yangzhong.expression.entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


//使用entity注解来自动创建表
@Entity
public class User {

    //uuid
    @Id
    @GeneratedValue(generator = "myIdStrategy")
    @GenericGenerator(name = "myIdStrategy",strategy = "uuid")
    @Column(name = "id")
    private String id;
    private String username;
    private String password;
    private String email;

    //需声明无参数的构造函数
    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

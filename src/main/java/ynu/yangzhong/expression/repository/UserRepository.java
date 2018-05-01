package ynu.yangzhong.expression.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ynu.yangzhong.expression.entity.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {

    /*根据username来查询user
    * 方法名字要遵循findBy+字段名
    * @param username
    * @return
    * */
    public User findByUsername(String username);


}



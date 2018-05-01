package ynu.yangzhong.expression.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ynu.yangzhong.expression.entity.User;
import ynu.yangzhong.expression.repository.UserRepository;
import ynu.yangzhong.expression.service.UserService;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User addUser(String username,String password,String email) {
        User user=new User();
        /*Date date=new Date();*/

        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);
        /*Integer ID=(int)(date.getTime());

        System.out.printf(String.valueOf(date.getTime()));

        user.setId(ID);*/

        return userRepository.save(user);
    }

    @Override
    public User findById(String id) {
        Integer ID=Integer.parseInt(id);
        return userRepository.findById(ID).get();
    }

    @Override
    public User updateUser(String id,String username,String password,String email) {

        User user=new User();
        user.setId(id);
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);

        return userRepository.save(user);
    }

    @Override
    public void deleteUser(String id) {
        Integer ID=Integer.parseInt(id);
        userRepository.deleteById(ID);
    }

    @Override
    public User findByUsername(String username) {

        return userRepository.findByUsername(username);
    }
}

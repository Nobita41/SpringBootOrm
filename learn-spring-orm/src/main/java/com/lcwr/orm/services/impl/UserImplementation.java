package com.lcwr.orm.services.impl;

import com.lcwr.orm.Entities.User;
import com.lcwr.orm.repositories.UserReopsitory;
import com.lcwr.orm.services.UserServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserImplementation implements UserServices {

    @Autowired
    private UserReopsitory userReopsitory;
    Logger logger= LoggerFactory.getLogger(UserImplementation.class);

    @Override
    public User saveuser(User user) {

       User savedUser= userReopsitory.save(user);
        logger.info("User saved:{}", savedUser.getId());
        return savedUser;
    }

    @Override
    public User saveuser() {
        return null;
    }

    @Override
    public User updateuser(User user, int user_id) {

        // first step is get user
        User oldUser = userReopsitory.findById(user_id).orElseThrow(() -> new RuntimeException("User id bot found"));
        oldUser.setName(user.getName());
        oldUser.setCity(user.getCity());
        oldUser.setAge(user.getAge());


        // second step is update user
        User updateUser = userReopsitory.save(oldUser);

        return updateUser;
    }

    @Override
    public void deleteUser(int userId) {

        User user = userReopsitory.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
        userReopsitory.delete(user);
        logger.info("User deleted {}",user);
    }

    @Override
    public List<User> getAllUser() {

        List<User> user = userReopsitory.findAll();
        return user;
    }

    // get single user
    @Override
    public User getUser(int userId) {
        Optional<User> userOptional = userReopsitory.findById(userId);
        User user = userOptional.orElseThrow(() -> new RuntimeException("User with given id not found"));

        return user;
    }
}

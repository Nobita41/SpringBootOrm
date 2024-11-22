package com.lcwr.orm.services;

import com.lcwr.orm.Entities.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface UserServices {

    User saveuser(User user);

    User saveuser();
        User updateuser(User user, int user_id);
        void deleteUser(int userId);
        List<User> getAllUser();

         User getUser(int userId);

}

package com.lcwr.orm.repositories;

import com.lcwr.orm.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface UserReopsitory extends JpaRepository<User, Integer> {

    

}

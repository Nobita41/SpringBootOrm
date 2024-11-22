package com.lcwr.orm.repositories;

import com.lcwr.orm.Entities.Laptop;
import com.lcwr.orm.Entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}

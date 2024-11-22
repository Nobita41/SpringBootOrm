package com.lcwr.orm.Entities;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="USER")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class User {

    @Id
    @Column(name="user_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;

    @Column(name="User_name", length = 100)
    private String name;

    @Column(name="User_city", length = 50)
    private String city;


    @Column(name="User_age", length = 20)
    private String age;


}

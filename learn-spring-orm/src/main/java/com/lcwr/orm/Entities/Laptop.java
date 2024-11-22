package com.lcwr.orm.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Laptop {
    @Id
    private int modelNo;
    private String name;
    private String Color;

    @OneToOne
    private  Student student;
}

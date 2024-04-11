package com.iltech.studentSystem.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;


@Entity
@Data
@Table(name = "studentdb")
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;
    @Column(name = "names")
    private String name;
    @Column(name = "adresses")
    private String address;

}

package com.ibm.springMVC.Spring.MVC.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@DynamicUpdate
public class User {

    //Declaration

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

    private String username;
    private int age;
    private int salary;

    public User(String username, int age, int salary, String address) {
        this.username = username;
        this.age = age;
        this.salary = salary;
        this.address = address;
    }


    private String address;


}

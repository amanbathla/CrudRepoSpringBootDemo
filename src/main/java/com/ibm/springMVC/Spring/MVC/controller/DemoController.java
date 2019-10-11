package com.ibm.springMVC.Spring.MVC.controller;

import com.ibm.springMVC.Spring.MVC.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.ibm.springMVC.Spring.MVC.service.DemoService;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class DemoController {



    //Declaration


    private DemoService demoService;

    //Constructor

    @Autowired
    public void setDemoService(DemoService demoService) {
        System.out.println("Setting Bean");
        this.demoService = demoService;
    }

    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }


    //constructor
    public DemoController() {

    }
    // Get Mapping to get User Details


    @GetMapping("/allusers")
    public ResponseEntity<List<User>> getAllUser(){
        List<User> userList = demoService.getListOfUser();
        return new ResponseEntity<List<User>>(userList, HttpStatus.OK);
    }

    //Get USer by name

    @GetMapping("/username")
    public String getUserName(int Userid){

        return  null;
    }

    //Post Mapping To Add User

    @PostMapping("/adduser")
    public ResponseEntity<User> addUser(@RequestBody User user){
        System.out.println(user);

        System.out.println("**********" + user);
        User saveUser = demoService.addUser(user);
        return new ResponseEntity(saveUser,HttpStatus.CREATED);
    }

    //PUT  mapping to add user

    @PutMapping("/updateuser")
    public String updateUser(User User){
        return null;
    }

    //Delete User

    @DeleteMapping("/deleteuser")
    public String deleteUser(User user){
        return "User Deleted Successfully";
    }

}

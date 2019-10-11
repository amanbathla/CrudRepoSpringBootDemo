package com.ibm.springMVC.Spring.MVC.service;

import com.ibm.springMVC.Spring.MVC.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ibm.springMVC.Spring.MVC.repository.DemoRepository;

import java.util.List;

@Service
public class DemoService {

    //Declaration
    private DemoRepository demoRepository;

    //Setter i.e Autowired
//

    public DemoService(DemoRepository userRepository) {
        this.demoRepository = userRepository;
    }

    @Autowired
    public void setDemoRepository(DemoRepository demoRepository) {
        this.demoRepository = demoRepository;
    }



    public DemoService() {

    }

    // Get the List of user

    public List<User> getListOfUser(){

        List<User> userList = (List<User>) demoRepository.findAll();
        return userList;

    }

    //ADD user

    public User addUser(User user){
        User SavedUser = demoRepository.save(user);
        return SavedUser;
    }









}

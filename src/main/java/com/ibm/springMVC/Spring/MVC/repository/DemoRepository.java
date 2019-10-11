package com.ibm.springMVC.Spring.MVC.repository;

import com.ibm.springMVC.Spring.MVC.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoRepository extends CrudRepository<User,Integer> {

}

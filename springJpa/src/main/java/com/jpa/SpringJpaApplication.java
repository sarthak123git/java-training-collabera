package com.jpa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.dao.UserRepo;
import com.jpa.entities.User;

import antlr.collections.List;

@SpringBootApplication
public class SpringJpaApplication {

	public static void main(String[] args) {
		
	ApplicationContext context=	SpringApplication.run(SpringJpaApplication.class, args);
    UserRepo userRepo= context.getBean(UserRepo.class)	;
    //create table  start
    User user = new User();
    user.setName("sk");
    user.setCity("punr");
    user.setStatus("its jpa");
    
    User user1 = new User();
    user1.setName("sk");
    user1.setCity("punr");
    user1.setStatus("its jpa");
    
    User user2 = new User();
    user2.setName("sk");
    user2.setCity("punr");
    user2.setStatus("its jpa");
    
    //save single user
   //// User result= userRepo.save(user1);
    //save multiple object
      java.util.List<User> users= java.util.List.of(user1, user2);
      Iterable<User>  result= userRepo.saveAll(users);
    
    result.forEach(e->{
    	System.out.println(e);
    });
    
   //User user1= userRepo.save(user);
  // System.out.println(user1);
    //create table end
    
    
    //start update
   Optional<User> optional=   userRepo.findById(1);
   User userget=optional.get();
   
   userget.setName("sarthak");
   User result1=userRepo.save(userget);
   System.out.println(result1);
   
    //get the data
   //findByid(id) -return optional containing data
       Iterable<User>itr= userRepo.findAll();
       Iterator<User>iterator=itr.iterator();
     //  while(iterator.hasNext());
       //{
    	 //  User userget1=iterator.next();
   // 	   System.out.println(userget1);
     //  }
       
       itr.forEach(use->{
    	   System.out.println(use);
       });
      
       //delete
       userRepo.deleteById(2);
      java.util.List<User> result3= userRepo.findByName("sarthak");
       result3.forEach(e2->System.out.println(e2));
	}

}

package com.JPAProject.Project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.JPAProject.Project.entity.User;
import com.JPAProject.Project.repository.UserRepository;

@SpringBootApplication
public class JpaProjectApplication {
	
	
	
	public static void main(String[] args) {
		System.out.println("this has started");
		
		
		ApplicationContext cont = SpringApplication.run(JpaProjectApplication.class, args);
		
		UserRepository repo = cont.getBean(UserRepository.class);
		
		User usr = new User();
		usr.setName("Amit");
		usr.setCity("Delhi");
		usr.setStatus("Single");
		
		User obj = repo.save(usr);
		
		System.out.print(obj);
		
	}

}
  
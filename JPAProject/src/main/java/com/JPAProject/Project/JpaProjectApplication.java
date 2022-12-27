package com.JPAProject.Project;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.JPAProject.Project.entity.User;
import com.JPAProject.Project.repository.UserRepository;

@SpringBootApplication
public class JpaProjectApplication {
	
	
	
	public static void main(String[] args) {
//		System.out.println("this has started");
		
		
		ApplicationContext cont = SpringApplication.run(JpaProjectApplication.class, args);
		
		UserRepository repo = cont.getBean(UserRepository.class);
		


		
		
//		Scanner sc = new Scanner(System.in);
//		for(int i=0; i<5; i++) {
//			User obj = new User();
//			System.out.println("Enter the name");
//			String name = sc.nextLine();
//			System.out.println("Enter the City");
//			String city= sc.nextLine();
//			System.out.println("Enter Your Relationship Status");
//			String status = sc.nextLine();
//			obj.setCity(city);
//			obj.setName(name);
//			obj.setStatus(status);
//			User obj1 = repo.save(obj);
//			System.out.print(obj1);
//			
//		}
		
	
		
//		Optional<User> ref = repo.findById(52);
//		
//		User user = ref.get();
//		user.setName("Tom Swayer");
//		repo.save(user);
//		System.out.println(user.getName());
//		
	   List<User> names = repo.findByName("Ankit");
		
		names.forEach(e-> System.out.println(e));
		
			
		
		
		
		
	}

}
  
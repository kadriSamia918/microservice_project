package org.sid.customerservice;

import org.sid.customerservice.dao.OffreRepository;
import org.sid.customerservice.dao.UserRepository;
import org.sid.customerservice.entities.User;
import org.sid.customerservice.entities.offre;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(UserRepository userRepository, OffreRepository offreRepository){
		return  args -> {


            userRepository.save(new User(1,"ddd","ss","ddd","ssss","AAA",123,"ddd",234,"WWWW","DDD","SSS","DDD",true));
			userRepository.save(new User(2,"ddd","ss","ddd","ssss","AAA",123,"ddd",234,"WWWW","DDD","SSS","DDD",true));
			userRepository.save(new User(3,"ddd","ss","ddd","ssss","AAA",123,"ddd",234,"WWWW","DDD","SSS","DDD",true));
			userRepository.findAll().forEach(System.out::println);
		};

		
	}

}

package com.wowoni.onetoonemapping;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wowoni.onetoonemapping.entity.Gender;
import com.wowoni.onetoonemapping.entity.User;
import com.wowoni.onetoonemapping.entity.UserProfile;
import com.wowoni.onetoonemapping.repository.UserProfileRepository;
import com.wowoni.onetoonemapping.repository.UserRepository;

@SpringBootApplication
public class SpringbootHibernateOneOneMappingApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHibernateOneOneMappingApplication.class, args);
	}
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserProfileRepository userProfileRepository;
	@Override
	public void run(String... args) throws Exception {
		
		User user = new User();
		user.setName("Rohan");
		user.setEmail("rohan@gmail.com");
		
		UserProfile userProfile = new UserProfile();
		userProfile.setAddress("Pune");
		userProfile.setBirthofDate(LocalDate.of(1998, 03, 18));
		userProfile.setGender(Gender.MALE);
		userProfile.setPhoneNumber("4545375455");
		
		user.setUserProfile(userProfile);
		userProfile.setUser(user);
		
		userRepository.save(user);
	}
	

}

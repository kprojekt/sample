package in.ashokit.RegistrationDemo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import in.ashokit.RegistrationDemo.entity.User;



@Service
public class RegistrationService {
	
	
	
	@PostMapping(path="/registeruser")
	public User register(@RequestBody User user) {
		return registrationRepository.save(user);
	}
	

}

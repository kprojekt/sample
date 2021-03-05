package in.ashokit.RegistrationDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.RegistrationDemo.entity.User;
import in.ashokit.RegistrationDemo.service.RegistrationService;

@RestController
@RequestMapping(path="/register")
public class RegistrationController {
	
	@Autowired
	RegistrationService registrationService;
	@PostMapping(path="/addEmployee")
	public User register(@RequestBody User user) {
		return registrationService.register(user);
	}
	

}

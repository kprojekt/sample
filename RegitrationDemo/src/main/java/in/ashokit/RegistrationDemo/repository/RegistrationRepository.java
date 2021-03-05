package in.ashokit.RegistrationDemo.repository;

import in.ashokit.RegistrationDemo.entity.User;
import org.springframework.data.repository.CrudRepository;
public interface RegistrationRepository extends CrudRepository<User, Integer> {  

}
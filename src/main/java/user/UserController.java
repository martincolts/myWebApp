package user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@EntityScan(basePackages = { "user" }) @EnableJpaRepositories(basePackages = { "user" })
public class UserController {

	private final UserRepository userRepository ;
	
	@Autowired
	UserController(UserRepository userRepository){
		this.userRepository = userRepository ;
	}
	
	@RequestMapping (value="/api/saveUser", method=RequestMethod.POST)
	public User saveUser (@RequestBody UserDTO userDTO, BindingResult bindingResult) throws BindException{
		if (bindingResult.hasErrors()){
			throw new BindException(bindingResult);
		}
		else {
		return userRepository.save(userDTO.toUser());
		
		}
		
	}
	
}

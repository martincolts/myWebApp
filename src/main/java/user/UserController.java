package user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@EntityScan(basePackages = { "user" }) @EnableJpaRepositories(basePackages = { "user" })
@RestController
@RequestMapping(value="/user")
public class UserController {

	private final UserRepository userRepository ;
	
	@Autowired
	UserController(UserRepository userRepository){
		this.userRepository = userRepository ;
	}
	
	@RequestMapping (value = "/save/" , method=RequestMethod.POST)
	public User saveUser (@RequestBody UserDTO userDTO, BindingResult bindingResult) throws BindException{
		System.out.println("Entro al save user");
		if (bindingResult.hasErrors()){
			throw new BindException(bindingResult);
		}
		else {
		return userRepository.save(userDTO.toUser());
		
		}
	}
	
	@RequestMapping (value = "/getAll/" , method=RequestMethod.GET)
	public ResponseEntity<List<User>> getAllUsers (){
		List<User> users = userRepository.findAll();
		if (users.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
            // You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	}
}

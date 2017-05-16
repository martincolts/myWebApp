package user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
@EntityScan(basePackages = { "user" }) @EnableJpaRepositories(basePackages = { "user" })
public class UserService {
    
    private final UserRepository userRepository;
    
    @Autowired
    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUser(String lastname){
        return userRepository.findByLastname(lastname);
    }
}
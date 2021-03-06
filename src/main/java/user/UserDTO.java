package user;

import javax.validation.constraints.NotNull;

public class UserDTO {
	
	@NotNull
	private String name ;
	@NotNull
	private String lastname ;
	@NotNull
	private Long dni ;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public UserDTO(){}
	
	public User toUser(){
		User user = new User ();
		user.setName(name);
		user.setLastname(lastname);
		user.setDni (dni);
		return user ;
	}

}

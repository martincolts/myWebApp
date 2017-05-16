package user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	private String name ;
	private String lastname ;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long dni ;
	
	protected User (){}
	
	protected User (String name , String lastname){
		this.name = name ;
		this.lastname = lastname ;
	}
	
	public String getName (){
		return name ;
	}
	
	public String getLastname (){
		return lastname ;
	}
	
	public void setName (String name){
		this.name = name ;
	}
	
	public void setLastname (String lastname){
		this.lastname = lastname ;
	}
	
	public void setDni (Long dni){
		this.dni = dni ;
	}
	
}

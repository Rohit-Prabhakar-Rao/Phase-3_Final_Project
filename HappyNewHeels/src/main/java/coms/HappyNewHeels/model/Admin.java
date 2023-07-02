package coms.HappyNewHeels.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import coms.HappyNewHeels.service.UserService;

@Entity
@DiscriminatorValue("Admin")
public class Admin extends User{

	public Admin() {
 		super();
		
	} 
	
}

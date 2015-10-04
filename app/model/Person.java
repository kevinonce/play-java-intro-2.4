package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person extends com.avaje.ebean.Model{

	@Id
	@GeneratedValue
	public long id;
	
	public String name;
}

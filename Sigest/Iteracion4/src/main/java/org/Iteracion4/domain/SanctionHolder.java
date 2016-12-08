package org.Iteracion4.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SanctionHolder {
	
	@Id
	@GeneratedValue
	protected int id;	
	protected String dni;	
	protected String name;	
	protected String lastName;
	
	public SanctionHolder() {
		
	}
	
	public SanctionHolder(String dni, String name, String lastName) {
		super();
		this.dni = dni;
		this.name = name;
		this.lastName = lastName;
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

}

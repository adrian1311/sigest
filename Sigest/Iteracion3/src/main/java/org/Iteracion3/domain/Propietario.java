package org.Iteracion3.domain;

public class Propietario extends Persona {
	int cod;
	
	public Propietario(String dni, String nombre, String apellidos, int cod) {
		super(dni, nombre, apellidos);	
		this.cod=cod;
	}
	
	//Gets
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	//Sets
	public void setName(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellidos;
	}
	public void setLastName(String apellidos) {
		this.apellidos = apellidos;
	}
	
	
	
	
}

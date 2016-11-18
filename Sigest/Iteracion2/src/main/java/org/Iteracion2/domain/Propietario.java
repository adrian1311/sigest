package org.Iteracion2.domain;

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
	public String getName() {
		return nombre;
	}
	//Sets
	public void setName(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	
	
	
}

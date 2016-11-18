package org.Iteracion1.domain;

public class Vehiculo {
	
	private String matricula;
	private Propietario propietario;
	
	public Vehiculo(){
		
	}
	
	public Vehiculo (String matricula){
		this();
		this.matricula=matricula;	
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}
	

}

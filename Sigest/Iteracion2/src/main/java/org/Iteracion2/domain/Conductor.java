package org.Iteracion2.domain;

public class Conductor extends Persona {
	
	private int puntos;
	
	
	public Conductor() {
		this.puntos=12;
	}

	public Conductor(String dni, String nombre, String apellidos) {
		super(dni, nombre, apellidos);
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

}

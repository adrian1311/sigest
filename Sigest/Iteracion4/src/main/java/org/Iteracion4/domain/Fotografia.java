package org.Iteracion4.domain;

public class Fotografia {
	
	private int id;
	private String matricula;
	private double vel;
	private double velmax;
	private String localizacion;
	
	public Fotografia(int id, String matricula, double vel, double velmax, String localizacion) {
		super();
		this.id = id;
		this.matricula = matricula;
		this.vel = vel;
		this.velmax = velmax;
		this.localizacion = localizacion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getVel() {
		return vel;
	}

	public void setVel(double vel) {
		this.vel = vel;
	}

	public double getVelmax() {
		return velmax;
	}

	public void setVelmax(double velmax) {
		this.velmax = velmax;
	}

	public String getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}
	
	
	

}

package org.Iteracion4.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Fotografia {
	
	@Id
	@GeneratedValue
	private int id;
	private String license;
	private double vel;
	private double velmax;
	private String location;
	
	protected Fotografia() {
	}

	public Fotografia(int id, String license, double vel, double velmax, String location) {
		super();
		this.id = id;
		this.license = license;
		this.vel = vel;
		this.velmax = velmax;
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
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

	public String getLocation() {
		return location;
	}

	public void setlocation(String location) {
		this.location = location;
	}
	
	
	

}

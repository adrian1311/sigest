package org.Iteracion4.domain;

import javax.persistence.Entity;
@Entity
public class Driver extends SanctionHolder {
	
	private int points;
	
	
	public Driver() {
		this.points=12;
	}

	public Driver(String dni, String name, String lastName) {
		super(dni, name, lastName);
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

}

package org.Iteracion4.domain;






public class Owner extends SanctionHolder {
	//@OneToMany(fetch = FetchType.LAZY, targetEntity=Inquiry.class, cascade={CascadeType.PERSIST, CascadeType.REMOVE})
	//private Set<Inquiry> inquiries;
	//@OneToMany(fetch = FetchType.LAZY, targetEntity=Inquiry.class, cascade={CascadeType.PERSIST, CascadeType.REMOVE})
	//private Set<Vehicle> vehicles;
	
	public Owner(String dni, String name, String apellidos, int cod) {
		super(dni, name, apellidos);	
		
	}
	
	//Gets
	/*public Set<Vehicle> getVehicles() {
		return vehicles;
	}
	
	public void setVehicles(Set<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}*/
	
	
	
	
	
}
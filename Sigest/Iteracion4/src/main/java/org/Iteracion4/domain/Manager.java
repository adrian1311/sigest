package org.Iteracion4.domain;
import java.io.IOException;

import javax.persistence.Entity;
import org.Iteracion4.dao.GeneralDao;
import org.Iteracion4.dao.OwnerDao;
import org.Iteracion4.dao.VehicleDao;

@Entity
public class Manager {
	public static void main(String[] args) throws IOException {
		
		Fotografia foto=new Fotografia(1,"555555C",200.00,180.00,"toledo");
		openInquiry(1,foto);
	}
	private Manager() {
		
	}
	
	public static class ManagerHolder {
		public static Manager manager=new Manager();
		
	}	
	
	public static Manager get() {
		return ManagerHolder.manager;
	}	
	
	public static int openInquiry(int id, Fotografia foto) {
		Inquiry inquiry=new Inquiry(id, foto);
		GeneralDao<Inquiry> dao=new GeneralDao<Inquiry>();
		dao.insert(inquiry);
		return inquiry.getIdExp();
	}

	public void pagar(int idSanction) {
		GeneralDao<Sanction> dao=new GeneralDao<Sanction>();
		Sanction sanction=dao.findById(Sanction.class, idSanction);		
		dao.update(sanction);
	}

	public void cambiarOwner(Vehicle vehicle, String newDni) {
		String license=vehicle.getLicense();
		VehicleDao daoVehicle=new VehicleDao();
		Vehicle vehicleNew=daoVehicle.findByLicense(license);
		OwnerDao daoOwner=new OwnerDao();
		Owner owner=daoOwner.findByDni(newDni);
		vehicleNew.setOwner(owner);
		daoVehicle.update(vehicle);
	}
	
	
	

}

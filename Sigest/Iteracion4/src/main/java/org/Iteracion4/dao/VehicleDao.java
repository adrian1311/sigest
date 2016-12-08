package org.Iteracion4.dao;

import org.hibernate.HibernateException;
import javax.persistence.Query;

import org.Iteracion4.domain.Driver;
import org.Iteracion4.domain.Vehicle;

public class VehicleDao extends GeneralDao<Vehicle> {
	public VehicleDao() {
		super();
	}
	
	public Vehicle findByLicense(String matricula) throws HibernateException {
		Vehicle vehiculo = null;
        try {
            startOperation();
            Query query=session.createQuery("from Vehiculo where matricula=?");
            query.setParameter(0, matricula);
            vehiculo = (Vehicle) query.getSingleResult();
            transaction.commit();
        } catch (HibernateException e) {
            throw e;
        } finally {
            HibernateFactory.close(session);
        }
        return vehiculo;
	}
}

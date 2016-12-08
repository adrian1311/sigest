package org.Iteracion4.dao;

import org.hibernate.HibernateException;
import javax.persistence.Query;

import org.Iteracion4.domain.Owner;
import org.Iteracion4.domain.Vehicle;

public class OwnerDao extends GeneralDao<Owner> {
	public OwnerDao() {
		super();
	}	
	
	public Owner findByDni(String dni) throws HibernateException {
		Owner propietario = null;
        try {
            startOperation();
            Query query=session.createQuery("cod from OwnerVehicle where license=? and ");
            query.setParameter(1, dni);
            propietario = (Owner) query.getSingleResult();
            transaction.commit();
        } catch (HibernateException e) {
            throw e;
        } finally {
            HibernateFactory.close(session);
        }
        return propietario;
	}
	
	public Owner findByLicense(String License) throws HibernateException {
		Owner propietario = null;
        try {
            startOperation();
            Query query=session.createQuery("from Vehicle where license=?");
            query.setParameter(0, License);
            Vehicle vehicle=(Vehicle) query.getSingleResult();
            propietario=vehicle.getOwner();
            transaction.commit();
        } catch (HibernateException e) {
            throw e;
        } finally {
            HibernateFactory.close(session);
        }
        return propietario;
	}
}

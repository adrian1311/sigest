package org.Iteracion4.dao;

import org.hibernate.HibernateException;
import javax.persistence.Query;

import org.Iteracion4.domain.Driver;
import org.Iteracion4.domain.Owner;
import org.Iteracion4.domain.Vehicle;

public class DriverDao extends GeneralDao<Driver> {
	public DriverDao() {
		super();
	}
	
	public Driver findByDni(String dni) throws HibernateException {
		Driver conductor = null; 
        try {
            startOperation();
            Query query=session.createQuery("from Driver where dni=?");
            query.setParameter(0, dni);
            conductor = (Driver) query.getSingleResult();
            transaction.commit();
        } catch (HibernateException e) {
            throw e;
        } finally {
            HibernateFactory.close(session);
        }
        return conductor;
	}

}

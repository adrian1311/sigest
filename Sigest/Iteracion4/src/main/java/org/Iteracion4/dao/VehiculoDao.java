package dao;

import org.hibernate.HibernateException;
import javax.persistence.Query;

import domain.Conductor;

public class VehiculoDao extends GeneralDao<Vehiculo> {
	public VehicleDao() {
		super();
	}
	
	public Vehiculo findByLicense(String matricula) throws HibernateException {
		Vehiculo vehiculo = null;
        try {
            startOperation();
            Query query=session.createQuery("from Vehiculo where matricula=?");
            query.setParameter(0, matricula);
            vehiculo = (Vehiculo) query.getSingleResult();
            transaction.commit();
        } catch (HibernateException e) {
            throw e;
        } finally {
            HibernateFactory.close(session);
        }
        return vehicle;
	}
}

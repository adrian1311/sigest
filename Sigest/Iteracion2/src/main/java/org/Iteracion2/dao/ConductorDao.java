package dao;

import org.hibernate.HibernateException;
import javax.persistence.Query;

import domain.Conductor;

public class ConductorDao {
	public ConductorDao() {
		super();
	}
	
	public Conductor findByDni(String dni) throws HibernateException {
		Conductor conductor = null;
        try {
            startOperation();
            Query query=session.createQuery("from Conductor where dni=?");
            query.setParameter(0, dni);
            driver = (Conductor) query.getSingleResult();
            transaction.commit();
        } catch (HibernateException e) {
            throw e;
        } finally {
            HibernateFactory.close(session);
        }
        return conductor;
	}

}

package org.Iteracion3.domain;
import org.Iteracion3.dao.GeneralDao;
public class Gestor {
	
	private Gestor() {
		
	}
	
	public static class ManagerHolder {
		public static Gestor manager=new Gestor();
	}	
	
	public static Gestor get() {
		return ManagerHolder.manager;
	}
	
	public int openExpediente(int id, Fotografia foto) {
		Expediente expediente=new Expediente(id, foto);
		GeneralDao<Expediente> dao=new GeneralDao<>();
		dao.insert(expediente);
		return expediente.getIdExp();
	}

	public void pagar(int idSanction) {
		GeneralDao<Sancion> dao=new GeneralDao<>();
		Sancion sancion=dao.findById(Sancion.class, idSanction);		
		dao.update(sancion);
	}
	
	
	

}

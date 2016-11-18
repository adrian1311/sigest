package org.Iteracion1.domain;
import org.Iteracion1.dao.*;
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
	
	
	
	

}

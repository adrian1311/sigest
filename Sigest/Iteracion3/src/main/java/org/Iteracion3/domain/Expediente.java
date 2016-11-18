package org.Iteracion3.domain;
import org.Iteracion3.dao.PropietarioDao;

public class Expediente {
	
private Fotografia fotografia;
private int idExp;
public Expediente() {
		
	}
	
	public Expediente(int idExp, Fotografia fotografia) {
		this();
		this.idExp=idExp;
		this.fotografia=fotografia;
	}

	public int getIdExp() {
		return idExp;
	}

	public void setIdExp(int idExp) {
		this.idExp = idExp;
	}

	public Fotografia getFotografia() {
		return fotografia;
	}

	public void setFotografia(Fotografia fotografia) {
		this.fotografia = fotografia;
	}
	
	private Propietario findPropietario(String matricula) {
		PropietarioDao propietarioDao=new PropietarioDao();
		return propietarioDao.findByMatricula(matricula);
	}
	
	

}

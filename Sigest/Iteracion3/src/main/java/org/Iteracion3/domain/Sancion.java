package org.Iteracion3.domain;
import org.Iteracion3.dao.*;

public class Sancion {
	private int id;
	private int idExp;
	private double precio;	
	private int puntos;
	
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.v = puntos;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Sancion crearSancion(String dni) {
		int puntos=calcularPuntos();
		int precio=calcularPrecio();
		Sancion sancion=new Sancion();
		ConductorDao dao=new ConductorDao();
		Conductor conductor=dao.findByDni(dni);
		sancion.setPersona(conductor);
		sancion.setPuntos(puntos);
		sancion.setPrecio(precio);
		GeneralDao<Sancion> daoSancion=new GeneralDao<>();
		daoSancion.insert(sancion);
		return sancion;
	}
	
	private int calcularPuntos() {
		double speed=Expediente.getFotografia().getVel();
		double speedMax=Expediente.getFotografia().getVelmax();

		if (speedMax==30) {
			if (speed>=31 && speed<=50) 
				return 0;
			else if (speed>=51 && speed<=60)
				return 2;
			else if (speed>=61 && speed<=70)
				return 4;
			else if (speed>=71)
				return 6;
		} else if (speedMax==40) {
			if (speed>=41 && speed<=60) 
				return 0;
			else if (speed>=61 && speed<=70)
				return 2;
			else if (speed>=71 && speed<=80)
				return 4;
			else if (speed>=81)
				return 6;
		} else if (speedMax==60) {
			if (speed>=61 && speed<=90) 
				return 0;
			else if (speed>=91 && speed<=110)
				return 2;
			else if (speed>=111 && speed<=120)
				return 4;
			else if (speed>=121)
				return 6;
		} else if (speedMax==70) {
			if (speed>=71 && speed<=100) 
				return 0;
			else if (speed>=101 && speed<=120)
				return 2;
			else if (speed>=121 && speed<=130)
				return 4;
			else if (speed>=131)
				return 6;
		} else if (speedMax==80) {
			if (speed>=81 && speed<=110) 
				return 0;
			else if (speed>=111 && speed<=130)
				return 2;
			else if (speed>=131 && speed<=140)
				return 4;
			else if (speed>=141)
				return 6;
		} else if (speedMax==90) {
			if (speed>=91 && speed<=120) 
				return 0;
			else if (speed>=121 && speed<=140)
				return 2;
			else if (speed>=141 && speed<=150)
				return 4;
			else if (speed>=151)
				return 6;
		} else if (speedMax==100) {
			if (speed>=101 && speed<=130) 
				return 0;
			else if (speed>=131 && speed<=150)
				return 2;
			else if (speed>=151 && speed<=160)
				return 4;
			else if (speed>=161)
				return 6;
		} else if (speedMax==110) {
			if (speed>=111 && speed<=140) 
				return 0;
			else if (speed>=141 && speed<=160)
				return 2;
			else if (speed>=161 && speed<=170)
				return 4;
			else if (speed>=171)
				return 6;
		} else if (speedMax==120) {
			if (speed>=121 && speed<=150) 
				return 0;
			else if (speed>=151 && speed<=170)
				return 2;
			else if (speed>=171 && speed<=180)
				return 4;
			else if (speed>=181)
				return 6;
		}
		return 0;
	}

	private int calcularPrecio() {
		double speed=Expediente.getFotografia().getVel();
		double speedMax=Expediente.getFotografia().getVelmax();
		
		if (speedMax==30) {
			if (speed>=31 && speed<=50) 
				return 100;
			else if (speed>=51 && speed<=60)
				return 300;
			else if (speed>=61 && speed<=70)
				return 400;
			else if (speed>=71 && speed<=80)
				return 500;
			else
				return 6;
		} else if (speedMax==40) {
			if (speed>=41 && speed<=60) 
				return 100;
			else if (speed>=61 && speed<=70)
				return 300;
			else if (speed>=71 && speed<=80)
				return 400;
			else if (speed>=81 && speed<=90)
				return 500;
			else
				return 600;
		} else if (speedMax==60) {
			if (speed>=61 && speed<=90) 
				return 100;
			else if (speed>=91 && speed<=110)
				return 300;
			else if (speed>=111 && speed<=120)
				return 400;
			else if (speed>=121 && speed<=130)
				return 500;
			else 
				return 600;
		} else if (speedMax==70) {
			if (speed>=71 && speed<=100) 
				return 100;
			else if (speed>=101 && speed<=120)
				return 300;
			else if (speed>=121 && speed<=130)
				return 400;
			else if (speed>=131 && speed<=140)
				return 500;
			else
				return 600;
		} else if (speedMax==80) {
			if (speed>=81 && speed<=110) 
				return 100;
			else if (speed>=111 && speed<=130)
				return 300;
			else if (speed>=131 && speed<=140)
				return 400;
			else if (speed>=141 && speed<=150)
				return 500;
			else
				return 600;
		} else if (speedMax==90) {
			if (speed>=91 && speed<=120) 
				return 100;
			else if (speed>=121 && speed<=140)
				return 300;
			else if (speed>=141 && speed<=150)
				return 400;
			else if (speed>=151 && speed<=160)
				return 500;
			else
				return 600;
		} else if (speedMax==100) {
			if (speed>=101 && speed<=130) 
				return 100;
			else if (speed>=131 && speed<=150)
				return 300;
			else if (speed>=151 && speed<=160)
				return 400;
			else if (speed>=161 && speed<=170)
				return 500;
			else
				return 600;
		} else if (speedMax==110) {
			if (speed>=111 && speed<=140) 
				return 100;
			else if (speed>=141 && speed<=160)
				return 300;
			else if (speed>=161 && speed<=170)
				return 400;
			else if (speed>=171 && speed<=180)
				return 500;
			else
				return 600;
		} else if (speedMax==120) {
			if (speed>=121 && speed<=150) 
				return 100;
			else if (speed>=151 && speed<=170)
				return 300;
			else if (speed>=171 && speed<=180)
				return 400;
			else if (speed>=181 && speed<=190)
				return 500;
			else return 600;
		}
		return 0;
	}

}

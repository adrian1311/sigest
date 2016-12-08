package org.Iteracion4.domain;

import org.Iteracion4.dao.DriverDao;
import org.Iteracion4.dao.GeneralDao;


public class Sanction {
	private int id;
	private int idExp;
	private double amount;	
	private int points;
	private Driver sanctionHolder;
	
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Sanction createSanctionFor(String dni) {
		int points=calculatePoints();
		int amount=calculateAmount();
		Sanction sanction=new Sanction();
		DriverDao dao=new DriverDao();		
		Driver driver = dao.findByDni(dni);		
		sanction.setSanctionHolder(driver);
		sanction.setPoints(points);
		sanction.setAmount(amount);
		GeneralDao<Sanction> daoSanction=new GeneralDao<Sanction>();
		daoSanction.insert(sanction);
		return sanction;
	}
	
	public void setSanctionHolder(Driver sanctionHolder) {
		this.sanctionHolder = sanctionHolder;
	}
	
	public SanctionHolder getSanctionHolder() {
		return sanctionHolder;
	}
	
	private int calculatePoints() {
		double speed=Inquiry.getFotografia().getVel();
		double speedMax=Inquiry.getFotografia().getVelmax();

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

	private int calculateAmount() {
		double speed=Inquiry.getFotografia().getVel();
		double speedMax=Inquiry.getFotografia().getVelmax();
		
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

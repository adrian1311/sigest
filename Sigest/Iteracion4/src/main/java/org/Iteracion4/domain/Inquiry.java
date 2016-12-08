package org.Iteracion4.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.Iteracion4.dao.OwnerDao;

public class Inquiry {
	
private static Fotografia fotografia;
private int idExp;

@ManyToOne(targetEntity=Owner.class)
private Owner owner;

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;

@Column(nullable=false, updatable=false)
private String location;

@Column(nullable=false, updatable=false)
private double speed;
@Column(nullable=false, updatable=false)
private double maxSpeed;
@OneToOne(fetch = FetchType.LAZY, targetEntity=Sanction.class, cascade={CascadeType.PERSIST, CascadeType.REMOVE})
private Sanction sanction;

public Inquiry() {
		
	}
	
	public Inquiry(int idExp, Fotografia fotografia) {
		this();
		this.idExp=idExp;
		Inquiry.fotografia=fotografia;
		this.owner=findOwner(fotografia.getLicense());
	}

	public int getIdExp() {
		return idExp;
	}

	public void setIdExp(int idExp) {
		this.idExp = idExp;
	}

	public static Fotografia getFotografia() {
		return fotografia;
	}
	
	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	
	public void setFotografia(Fotografia fotografia) {
		Inquiry.fotografia = fotografia;
	}
	
	private Owner findOwner(String license) {
		OwnerDao ownerDao=new OwnerDao();
		return ownerDao.findByLicense(license);
	}
	
	

}

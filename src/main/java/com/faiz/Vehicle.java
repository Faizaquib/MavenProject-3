package com.faiz;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Vehicle {
	@Id
	private int regno;
	private String vname;
	private int vprice;
	
	@ManyToOne
	private Emp emp;
	
	public Vehicle(int regno, String vname, int vprice, Emp emp) {
		super();
		this.regno = regno;
		this.vname = vname;
		this.vprice = vprice;
		this.emp = emp;
	}


	@Override
	public String toString() {
		return "Vehicle [regno=" + regno + ", vname=" + vname + ", vprice=" + vprice + ", emp=" + emp + "]";
	}


	public Vehicle(int regno, String vname, int vprice) {
		super();
		this.regno = regno;
		this.vname = vname;
		this.vprice = vprice;
	}


	public Vehicle() {
		super();
	}


	public Vehicle(int regno) {
		super();
		this.regno = regno;
	}


	public int getRegno() {
		return regno;
	}

	public void setRegno(int regno) {
		this.regno = regno;
	}

	public String getVname() {
		return vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

	public int getVprice() {
		return vprice;
	}

	public void setVprice(int vprice) {
		this.vprice = vprice;
	}

	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	
	
	
	
	

}

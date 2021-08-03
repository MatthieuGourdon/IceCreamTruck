package com.ict;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Inventory {
	@Id
	@GeneratedValue
	private Integer id;
	private Integer mintQuantity = 0;
	private Integer chocolateQuantity = 0;
	private Integer strawberryQuantity = 0;
	private Integer pistachioQuantity = 0;
	private Integer snackBarsQuantity = 0;
	
	public Inventory() {
	}
	
	public Inventory(Integer mintQuantity, Integer chocolateQuantity, Integer strawberryQuantity, Integer pistachioQuantity, Integer snackBarsQuantity) {
		super();
		this.mintQuantity = mintQuantity;
		this.chocolateQuantity = chocolateQuantity;
		this.strawberryQuantity = strawberryQuantity;
		this.pistachioQuantity = pistachioQuantity;
		this.snackBarsQuantity = snackBarsQuantity;
	}
	
	public int getMintQuantity() {
		return mintQuantity;
	}

	public void setMintQuantity(int mintQuantity) {
		this.mintQuantity = mintQuantity;
	}

	public int getChocolateQuantity() {
		return chocolateQuantity;
	}

	public void setChocolateQuantity(int chocolateQuantity) {
		this.chocolateQuantity = chocolateQuantity;
	}

	public int getStrawberryQuantity() {
		return strawberryQuantity;
	}

	public void setStrawberryQuantity(int strawberryQuantity) {
		this.strawberryQuantity = strawberryQuantity;
	}

	public int getPistachioQuantity() {
		return pistachioQuantity;
	}

	public void setPistachioQuantity(int pistachioQuantity) {
		this.pistachioQuantity = pistachioQuantity;
	}

	public int getSnackBarsQuantity() {
		return snackBarsQuantity;
	}

	public void setSnackBarsQuantity(int snackBarsQuantity) {
		this.snackBarsQuantity = snackBarsQuantity;
	}
	
	@Override
	public String toString() {
		return "Inventory [" + id + "] => mint : " + this.mintQuantity + ", chocolate : " + this.chocolateQuantity + ", strawberry : "
				+ this.strawberryQuantity + ", pistachio : " + this.pistachioQuantity + ", Snack bars : " + this.snackBarsQuantity;
	}
}

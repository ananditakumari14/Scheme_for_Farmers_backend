package com.wipro.velocity.efarming.module;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sold {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
	
	private  String date;
	
	private  String cropName;
	
	private  String quantity;
	
	private  String msp;
	
	private  String soldPrice;
	
	private  String totalPrice;

	public Sold(String date, String cropName, String quantity, String msp, String soldPrice, String totalPrice) {
		this.date = date;
		this.cropName = cropName;
		this.quantity = quantity;
		this.msp = msp;
		this.soldPrice = soldPrice;
		this.totalPrice = totalPrice;
	}

	public Sold() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCropName() {
		return cropName;
	}

	public void setCropName(String cropName) {
		this.cropName = cropName;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getMsp() {
		return msp;
	}

	public void setMsp(String msp) {
		this.msp = msp;
	}

	public String getSoldPrice() {
		return soldPrice;
	}

	public void setSoldPrice(String soldPrice) {
		this.soldPrice = soldPrice;
	}

	public String getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
	



}

package com.wipro.velocity.efarming.module;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Claim {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
	
	private  String policyNo;
	
	private  String insuranceCompany;
	
	private  String nameOfInsuree;
	
	private  String sumOfInsured;
	
	private  String dateOfLoss;
	
	private  String causeOfLoss;
	

	public Claim(String policyNo, String insuranceCompany, String nameOfInsuree, String sumOfInsured, String dateOfLoss,
			String causeOfLoss) {
		this.policyNo = policyNo;
		this.insuranceCompany = insuranceCompany;
		this.nameOfInsuree = nameOfInsuree;
		this.sumOfInsured = sumOfInsured;
		this.dateOfLoss = dateOfLoss;
		this.causeOfLoss = causeOfLoss;
	}

	public Claim() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPolicyNo() {
		return policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public String getInsuranceCompany() {
		return insuranceCompany;
	}

	public void setInsuranceCompany(String insuranceCompany) {
		this.insuranceCompany = insuranceCompany;
	}

	public String getNameOfInsuree() {
		return nameOfInsuree;
	}

	public void setNameOfInsuree(String nameOfInsuree) {
		this.nameOfInsuree = nameOfInsuree;
	}

	public String getSumOfInsured() {
		return sumOfInsured;
	}

	public void setSumOfInsured(String sumOfInsured) {
		this.sumOfInsured = sumOfInsured;
	}

	public String getDateOfLoss() {
		return dateOfLoss;
	}

	public void setDateOfLoss(String dateOfLoss) {
		this.dateOfLoss = dateOfLoss;
	}

	public String getCauseOfLoss() {
		return causeOfLoss;
	}

	public void setCauseOfLoss(String causeOfLoss) {
		this.causeOfLoss = causeOfLoss;
	}
	
	

}
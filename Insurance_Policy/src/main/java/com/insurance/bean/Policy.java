package com.insurance.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data
public class Policy {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int policyno;
	private String policyname;
	private String category;
	private String premium;
	private String maturity;
	public int getPolicyno() {
		return policyno;
	}
	public void setPolicyno(int policyno) {
		this.policyno = policyno;
	}
	public String getPolicyname() {
		return policyname;
	}
	public void setPolicyname(String policyname) {
		this.policyname = policyname;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getPremium() {
		return premium;
	}
	public void setPremium(String premium) {
		this.premium = premium;
	}
	public String getMaturity() {
		return maturity;
	}
	public void setMaturity(String maturity) {
		this.maturity = maturity;
	}
}

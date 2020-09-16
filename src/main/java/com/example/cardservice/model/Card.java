package com.example.cardservice.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Card {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	  @JsonProperty("card_no")
	  long cardNo;
	  
	  @JsonProperty("cvv")
	  int cvv;
	  
	  @JsonProperty("expiry_date")
	  Date expiryDate;
	  
	  @JsonProperty("card_type")
	  String cardType;
	  
	  @JsonProperty("customer_id")
	  int customerId;
	  
	  @JsonProperty("card_company")
	  String cardCompany;
	  
	  @JsonProperty("credit_limit")
	  double creditLimit;
	  
	  @JsonProperty("card_status")
	  boolean cardStatus;
	public long getCardNo() {
		return cardNo;
	}

	public void setCardNo(long cardNo) {
		this.cardNo = cardNo;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCardCompany() {
		return cardCompany;
	}

	public void setCardCompany(String cardCompany) {
		this.cardCompany = cardCompany;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}

	public boolean isCardStatus() {
		return cardStatus;
	}

	public void setCardStatus(boolean cardStatus) {
		this.cardStatus = cardStatus;
	}
	  
	  
}

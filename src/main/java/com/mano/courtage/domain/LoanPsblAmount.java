package com.mano.courtage.domain;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the loan_psbl_amount database table.
 * 
 */
@Entity
@Table(name="loan_psbl_amount")
@NamedQuery(name="LoanPsblAmount.findAll", query="SELECT l FROM LoanPsblAmount l")
public class LoanPsblAmount extends AbstractEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	private int amount;

	private String code;

	private String comments;

	private String currency;

	private String text;

	public LoanPsblAmount() {
	}

	public int getAmount() {
		return this.amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
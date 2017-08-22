package com.mano.courtage.domain;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the loan_psbl_payments database table.
 * 
 */
@Entity
@Table(name="loan_psbl_payments")
@NamedQuery(name="LoanPsblPayment.findAll", query="SELECT l FROM LoanPsblPayment l")
public class LoanPsblPayment extends AbstractEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="interval_days")
	private int intervalDays;

	@Column(name="interval_weeks")
	private int intervalWeeks;

	@Column(name="interval_months")
	private int intervaMonths;

	@Column(name="text")
	private String text;

	@Column(name="code")
	private String code;

	public LoanPsblPayment() {
	}

	public int getIntervalDays() {
		return this.intervalDays;
	}

	public void setIntervalDays(int intervalDays) {
		this.intervalDays = intervalDays;
	}

	public int getIntervalWeeks() {
		return this.intervalWeeks;
	}

	public void setIntervalWeeks(int intervalWeeks) {
		this.intervalWeeks = intervalWeeks;
	}

	public int getIntervaMonths() {
		return intervaMonths;
	}

	public void setIntervaMonths(int intervaMonths) {
		this.intervaMonths = intervaMonths;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "LoanPsblPayment [intervalDays=" + intervalDays + ", intervalWeeks=" + intervalWeeks + ", intervaMonths="
				+ intervaMonths + ", text=" + text + ", code=" + code + "]";
	}
	

}
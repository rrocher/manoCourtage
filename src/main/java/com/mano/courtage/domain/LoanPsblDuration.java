package com.mano.courtage.domain;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the loan_psbl_duration database table.
 * 
 */
@Entity
@Table(name="loan_psbl_duration")
@NamedQuery(name="LoanPsblDuration.findAll", query="SELECT l FROM LoanPsblDuration l")
public class LoanPsblDuration extends AbstractEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	private String code;

	@Column(name="nb_days")
	private int nbDays;

	@Column(name="nb_months")
	private int nbMonths;

	@Column(name="nb_weeks")
	private int nbWeeks;

	private String text;

	//bi-directional many-to-one association to LoanInterestRatePayment
	@JsonIgnore
	@OneToMany(mappedBy="loanPsblDuration")
	private List<LoanInterestRatePayment> loanInterestRatePayments;

	//bi-directional many-to-one association to LoanType
	@ManyToOne
	@JoinColumn(name="loan_type")
	private LoanType loanType;

	public LoanPsblDuration() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}


	public int getNbDays() {
		return this.nbDays;
	}

	public void setNbDays(int nbDays) {
		this.nbDays = nbDays;
	}

	public int getNbMonths() {
		return this.nbMonths;
	}

	public void setNbMonths(int nbMonths) {
		this.nbMonths = nbMonths;
	}

	public int getNbWeeks() {
		return this.nbWeeks;
	}

	public void setNbWeeks(int nbWeeks) {
		this.nbWeeks = nbWeeks;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public List<LoanInterestRatePayment> getLoanInterestRatePayments() {
		return this.loanInterestRatePayments;
	}

	public void setLoanInterestRatePayments(List<LoanInterestRatePayment> loanInterestRatePayments) {
		this.loanInterestRatePayments = loanInterestRatePayments;
	}

	public LoanInterestRatePayment addLoanInterestRatePayment(LoanInterestRatePayment loanInterestRatePayment) {
		getLoanInterestRatePayments().add(loanInterestRatePayment);
		loanInterestRatePayment.setLoanPsblDuration(this);

		return loanInterestRatePayment;
	}

	public LoanInterestRatePayment removeLoanInterestRatePayment(LoanInterestRatePayment loanInterestRatePayment) {
		getLoanInterestRatePayments().remove(loanInterestRatePayment);
		loanInterestRatePayment.setLoanPsblDuration(null);

		return loanInterestRatePayment;
	}

	public LoanType getLoanType() {
		return this.loanType;
	}

	public void setLoanType(LoanType loanType) {
		this.loanType = loanType;
	}

}
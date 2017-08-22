package com.mano.courtage.domain;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the loan_interest_rate_payment database table.
 * 
 */
@Entity
@Table(name="loan_interest_rate_payment")
@NamedQuery(name="LoanInterestRatePayment.findAll", query="SELECT l FROM LoanInterestRatePayment l")
public class LoanInterestRatePayment extends AbstractEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	private String code;

	@Column(name="file_fee")
	private double fileFee;

	@Column(name="interest_rate")
	private double interestRate;

	@Column(name="total_payment")
	private double totalPayment;

	@ManyToOne
	@JoinColumn(name="loan_psbl_amount")
	private LoanPsblAmount loanPsblAmount;

	//bi-directional many-to-one association to LoanPsblDuration
	@ManyToOne
	@JoinColumn(name="loan_psbl_duration")
	private LoanPsblDuration loanPsblDuration;

	@JsonIgnore
	//bi-directional many-to-one association to LoanPsblAmountPayment
	@OneToMany(mappedBy="loanInterestRatePayment")
	private List<LoanPsblAmountPayment> loanPsblAmountPayments;

	public LoanInterestRatePayment() {
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

	public double getFileFee() {
		return this.fileFee;
	}

	public void setFileFee(double fileFee) {
		this.fileFee = fileFee;
	}
	public double getInterestRate() {
		return this.interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public LoanPsblAmount getLoanPsblAmount() {
		return this.loanPsblAmount;
	}

	public void setLoanPsblAmount(LoanPsblAmount loanPsblAmount) {
		this.loanPsblAmount = loanPsblAmount;
	}

	public double getTotalPayment() {
		return this.totalPayment;
	}

	public void setTotalPayment(double totalPayment) {
		this.totalPayment = totalPayment;
	}

	public void setTsDelete(Timestamp tsDelete) {
		this.tsDelete = tsDelete;
	}


	public LoanPsblDuration getLoanPsblDuration() {
		return this.loanPsblDuration;
	}

	public void setLoanPsblDuration(LoanPsblDuration loanPsblDuration) {
		this.loanPsblDuration = loanPsblDuration;
	}

	public List<LoanPsblAmountPayment> getLoanPsblAmountPayments() {
		return this.loanPsblAmountPayments;
	}

	public void setLoanPsblAmountPayments(List<LoanPsblAmountPayment> loanPsblAmountPayments) {
		this.loanPsblAmountPayments = loanPsblAmountPayments;
	}

	public LoanPsblAmountPayment addLoanPsblAmountPayment(LoanPsblAmountPayment loanPsblAmountPayment) {
		getLoanPsblAmountPayments().add(loanPsblAmountPayment);
		loanPsblAmountPayment.setLoanInterestRatePayment(this);

		return loanPsblAmountPayment;
	}

	public LoanPsblAmountPayment removeLoanPsblAmountPayment(LoanPsblAmountPayment loanPsblAmountPayment) {
		getLoanPsblAmountPayments().remove(loanPsblAmountPayment);
		loanPsblAmountPayment.setLoanInterestRatePayment(null);

		return loanPsblAmountPayment;
	}

}
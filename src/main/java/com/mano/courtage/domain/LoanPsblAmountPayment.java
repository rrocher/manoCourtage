package com.mano.courtage.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the loan_psbl_amount_payment database table.
 * 
 */
@Entity
@Table(name="loan_psbl_amount_payment")
@NamedQuery(name="LoanPsblAmountPayment.findAll", query="SELECT l FROM LoanPsblAmountPayment l")
public class LoanPsblAmountPayment extends AbstractEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name="loan_psbl_payment")
	private LoanPsblPayment loanPsblPayment;

	@Column(name="nb_payments")
	private int nbPayments;

	private double payment;

	//bi-directional many-to-one association to LoanInterestRatePayment
	@ManyToOne
	@JoinColumn(name="loan_interest_rate_payment")
	private LoanInterestRatePayment loanInterestRatePayment;

	public LoanPsblAmountPayment() {
	}
	
	public LoanPsblPayment getLoanPsblPayment() {
		return this.loanPsblPayment;
	}

	public void setLoanPsblPayment(LoanPsblPayment loanPsblPayment) {
		this.loanPsblPayment = loanPsblPayment;
	}

	public int getNbPayments() {
		return this.nbPayments;
	}

	public void setNbPayments(int nbPayments) {
		this.nbPayments = nbPayments;
	}

	public double getPayment() {
		return this.payment;
	}

	public void setPayment(double payment) {
		this.payment = payment;
	}

	public LoanInterestRatePayment getLoanInterestRatePayment() {
		return this.loanInterestRatePayment;
	}

	public void setLoanInterestRatePayment(LoanInterestRatePayment loanInterestRatePayment) {
		this.loanInterestRatePayment = loanInterestRatePayment;
	}

}
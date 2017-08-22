package com.mano.courtage.domain;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;


/**
 * The persistent class for the loan_payments database table.
 * 
 */
@Entity
@Table(name="loan_payments")
@NamedQuery(name="LoanPayment.findAll", query="SELECT l FROM LoanPayment l")
public class LoanPayment extends AbstractEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="amount_paid")
	private double amountPaid;

	@Column(name="amount_to_pay")
	private double amountToPay;

	private String comments;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_effective")
	private Date dateEffective;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_scheduled")
	private Date dateScheduled;

	//bi-directional many-to-one association to Loan
	@ManyToOne
	@JoinColumn(name="loan")
	@JsonIgnore
	private Loan loan;

	public LoanPayment() {
	}

	public double getAmountPaid() {
		return this.amountPaid;
	}

	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}

	public double getAmountToPay() {
		return this.amountToPay;
	}

	public void setAmountToPay(double amountToPay) {
		this.amountToPay = amountToPay;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Date getDateEffective() {
		return this.dateEffective;
	}

	public void setDateEffective(Date dateEffective) {
		this.dateEffective = dateEffective;
	}

	public Date getDateScheduled() {
		return this.dateScheduled;
	}

	public void setDateScheduled(Date dateScheduled) {
		this.dateScheduled = dateScheduled;
	}

	public Loan getLoan() {
		return this.loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}

}
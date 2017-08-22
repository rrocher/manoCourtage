package com.mano.courtage.domain;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;


/**
 * The persistent class for the loan_arrangements database table.
 * 
 */
@Entity
@Table(name="loan_arrangements")
@NamedQuery(name="LoanArrangement.findAll", query="SELECT l FROM LoanArrangement l")
public class LoanArrangement extends AbstractEntity implements Serializable {
	private static final long serialVersionUID = 1L;


	@Column(name="amount_to_pay")
	private double amountToPay;

	private String comments;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_payment_scheduled")
	private Date datePaymentScheduled;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_re_scheduled")
	private Date dateReScheduled;

	@Column(name="nb_arrangements")
	private int nbArrangements;

	//bi-directional many-to-one association to Loan
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name="loan")
	private Loan loan;

	public LoanArrangement() {
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

	public Date getDatePaymentScheduled() {
		return this.datePaymentScheduled;
	}

	public void setDatePaymentScheduled(Date datePaymentScheduled) {
		this.datePaymentScheduled = datePaymentScheduled;
	}

	public Date getDateReScheduled() {
		return this.dateReScheduled;
	}

	public void setDateReScheduled(Date dateReScheduled) {
		this.dateReScheduled = dateReScheduled;
	}

	public int getNbArrangements() {
		return this.nbArrangements;
	}

	public void setNbArrangements(int nbArrangements) {
		this.nbArrangements = nbArrangements;
	}

	public Loan getLoan() {
		return this.loan;
	}

	public void setLoan(Loan loanBean) {
		this.loan = loanBean;
	}

}
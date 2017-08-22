package com.mano.courtage.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the loan database table.
 * 
 */
@Entity
@Table(name = "loan")
@NamedQuery(name = "Loan.findAll", query = "SELECT l FROM Loan l")
public class Loan extends AbstractEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	private String comments;

	// bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name = "loaner")
	private User loaner;

	// bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name = "approver")
	private User approver;

	// bi-directional many-to-one association to LoanPsblAmount
	@ManyToOne
	@JoinColumn(name="loan_amount_payment")
	private LoanPsblAmountPayment loanPsblAmountpayment;

	// bi-directional many-to-one association to LoanArrangement
	@OneToMany(mappedBy = "loan")
	private List<LoanArrangement> loanArrangements;

	// bi-directional many-to-one association to LoanPayment
	@OneToMany(mappedBy = "loan")
	private List<LoanPayment> loanPayments;

	@Enumerated(EnumType.STRING)
	private STATE state;

	@Column(name = "state_details")
	private String stateDetails;
	

	public Loan() {
	}


	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
	
	public User getLoaner() {
		return this.loaner;
	}

	public void setLoaner(User loaner) {
		this.loaner = loaner;
	}

	public User getApprover() {
		return this.approver;
	}

	public void setApprover(User approver) {
		this.approver = approver;
	}
	public LoanPsblAmountPayment getLoanPsblAmountPayment() {
		return this.loanPsblAmountpayment;
	}

	public void setLoanPsblAmountPayment(LoanPsblAmountPayment loanPsblAmountpayment) {
		this.loanPsblAmountpayment = loanPsblAmountpayment;
	}

	public List<LoanArrangement> getLoanArrangements() {
		return this.loanArrangements;
	}

	public void setLoanArrangements(List<LoanArrangement> loanArrangements) {
		this.loanArrangements = loanArrangements;
	}

	public LoanArrangement addLoanArrangement(LoanArrangement loanArrangement) {
		getLoanArrangements().add(loanArrangement);
		loanArrangement.setLoan(this);

		return loanArrangement;
	}

	public LoanArrangement removeLoanArrangement(LoanArrangement loanArrangement) {
		getLoanArrangements().remove(loanArrangement);
		loanArrangement.setLoan(null);

		return loanArrangement;
	}

	public List<LoanPayment> getLoanPayments() {
		return this.loanPayments;
	}

	public void setLoanPayments(List<LoanPayment> loanPayments) {
		this.loanPayments = loanPayments;
	}

	public LoanPayment addLoanPayment(LoanPayment loanPayment) {
		getLoanPayments().add(loanPayment);
		loanPayment.setLoan(this);

		return loanPayment;
	}

	public LoanPayment removeLoanPayment(LoanPayment loanPayment) {
		getLoanPayments().remove(loanPayment);
		loanPayment.setLoan(null);

		return loanPayment;
	}


	public STATE getState() {
		return state;
	}


	public void setState(STATE state) {
		this.state = state;
	}


	public String getStateDetails() {
		return stateDetails;
	}


	public void setStateDetails(String stateDetails) {
		this.stateDetails = stateDetails;
	}


	public LoanPsblAmountPayment getLoanPsblAmountpayment() {
		return loanPsblAmountpayment;
	}


	public void setLoanPsblAmountpayment(LoanPsblAmountPayment loanPsblAmountpayment) {
		this.loanPsblAmountpayment = loanPsblAmountpayment;
	}
	
	

}
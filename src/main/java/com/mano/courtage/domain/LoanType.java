package com.mano.courtage.domain;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the loan_type database table.
 * 
 */
@Entity
@Table(name="loan_type")
@NamedQuery(name="LoanType.findAll", query="SELECT l FROM LoanType l")
public class LoanType extends AbstractEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Enumerated(EnumType.STRING)
	private CODE code;

	private String text;
	
	public enum CODE {
		NEXTPAY("NEXTPAY"), 
		STEP_BY_STEP("STEP_BY_STEP");

		private final String name;

		private CODE(String s) {
			name = s;
		}

		public boolean equalsName(String otherName) {
			// (otherName == null) check is not needed because name.equals(null) returns
			// false
			return name.equals(otherName);
		}

		public String toString() {
			return this.name;
		}

	}

	//bi-directional many-to-one association to LoanPsblDuration
	@OneToMany(mappedBy="loanType")
	@JsonIgnore
	private List<LoanPsblDuration> loanPsblDurations;

	public LoanType() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public CODE getCode() {
		return this.code;
	}

	public void setCode(CODE code) {
		this.code = code;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setTsDelete(Timestamp tsDelete) {
		this.tsDelete = tsDelete;
	}

	public void setTsInsert(Timestamp tsInsert) {
		this.tsInsert = tsInsert;
	}

	public void setTsUpdate(Timestamp tsUpdate) {
		this.tsUpdate = tsUpdate;
	}

	public List<LoanPsblDuration> getLoanPsblDurations() {
		return this.loanPsblDurations;
	}

	public void setLoanPsblDurations(List<LoanPsblDuration> loanPsblDurations) {
		this.loanPsblDurations = loanPsblDurations;
	}

	public LoanPsblDuration addLoanPsblDuration(LoanPsblDuration loanPsblDuration) {
		getLoanPsblDurations().add(loanPsblDuration);
		loanPsblDuration.setLoanType(this);

		return loanPsblDuration;
	}

	public LoanPsblDuration removeLoanPsblDuration(LoanPsblDuration loanPsblDuration) {
		getLoanPsblDurations().remove(loanPsblDuration);
		loanPsblDuration.setLoanType(null);

		return loanPsblDuration;
	}

}
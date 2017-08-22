package com.mano.courtage.dto;

import com.mano.courtage.domain.LoanPsblAmount;
import com.mano.courtage.domain.LoanPsblDuration;
import com.mano.courtage.domain.LoanPsblPayment;
import com.mano.courtage.domain.LoanType;

public class LoanDTO {
	private LoanPsblAmount loanPsblAmount;
	private UserDTO loaner;
	private UserWorkDTO work;
	private LoanPsblPayment loanPsblPayment;
	private LoanPsblDuration loanPsblDuration;
	private LoanType loanType;
	private String comments;
	
	public static class Builder {
		private LoanPsblAmount loanPsblAmount;
		private UserDTO loaner;
		private UserWorkDTO work;
		private LoanPsblPayment loanPsblPayment;
		private LoanPsblDuration loanPsblDuration;
		private LoanType loanType;
		private String comments;

        public Builder(LoanType loanType, UserDTO loaner, UserWorkDTO work) {
            this.loanType = loanType;
            this.loaner = loaner;
            this.work    = work;
        }

        public Builder loanPsblAmount(LoanPsblAmount val)
            { loanPsblAmount = val;      return this; }
        public Builder loanPsblPayment(LoanPsblPayment val)
            { loanPsblPayment = val;           return this; }
        public Builder loanPsblDuration(LoanPsblDuration val)
            { loanPsblDuration = val;  return this; }
        public Builder comments(String val)
        { comments = val;        return this; }

        public LoanDTO build() {
            return new LoanDTO(this);
        }
    }
	
	public LoanPsblAmount getLoanPsblAmount() {
		return loanPsblAmount;
	}
	public void setLoanPsblAmount(LoanPsblAmount loanPsblAmount) {
		this.loanPsblAmount = loanPsblAmount;
	}
	public UserDTO getLoaner() {
		return loaner;
	}
	public void setLoaner(UserDTO loaner) {
		this.loaner = loaner;
	}
	public UserWorkDTO getWork() {
		return work;
	}
	public void setWork(UserWorkDTO work) {
		this.work = work;
	}
	public LoanPsblPayment getLoanPsblPayment() {
		return loanPsblPayment;
	}
	public void setLoanPsblPayment(LoanPsblPayment loanPsblPayment) {
		this.loanPsblPayment = loanPsblPayment;
	}
	
	public LoanDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoanDTO(Builder builder) {
        this.loanType = builder.loanType;
        this.loaner = builder.loaner;
        this.work    = builder.work;
        this.loanPsblAmount = builder.loanPsblAmount;
        this.comments = builder.comments;
        this.loanPsblPayment    = builder.loanPsblPayment;
        this.loanPsblDuration    = builder.loanPsblDuration;
	}
	
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public LoanPsblDuration getLoanPsblDuration() {
		return loanPsblDuration;
	}
	public void setLoanPsblDuration(LoanPsblDuration loanPsblDuration) {
		this.loanPsblDuration = loanPsblDuration;
	}
	public LoanType getLoanType() {
		return loanType;
	}
	public void setLoanType(LoanType loanType) {
		this.loanType = loanType;
	}
	@Override
	public String toString() {
		return "LoanDTO [loanPsblAmount=" + loanPsblAmount + ", loaner=" + loaner + ", work=" + work
				+ ", loanPsblPayment=" + loanPsblPayment + ", loanPsblDuration=" + loanPsblDuration + ", loanType="
				+ loanType + ", comments=" + comments + "]";
	}
	

}

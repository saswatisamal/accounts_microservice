package com.in30minutes.model;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;



@Entity
public class Accounts {
@Id
@SequenceGenerator(name = "mySeqGen", sequenceName = "mySeq", initialValue = 1876895678, allocationSize = 1)
@GeneratedValue(strategy=GenerationType.SEQUENCE ,generator="mySeqGen")
private long accountNumber;
@Column(name="customer_id")
private int customerId;
@Column(name="account_type")
private String accountType;
@Column(name="branch_address")
private String branchAddress;
@Column(name="create_dt")
private LocalDate createDt;
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public long getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(long accountNumber) {
	this.accountNumber = accountNumber;
}
public String getAccountType() {
	return accountType;
}
public void setAccountType(String accountType) {
	this.accountType = accountType;
}
public String getBranchAddress() {
	return branchAddress;
}
public void setBranchAddress(String branchAddress) {
	this.branchAddress = branchAddress;
}
public LocalDate getCreateDt() {
	return createDt;
}
public void setCreateDt(LocalDate createDt) {
	this.createDt = createDt;
}

	

}

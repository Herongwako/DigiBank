package model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "transaction")
@SessionScoped
public class Transaction {
	private String name;
	private String sourcePassport;
	private String destinationPassport;
	private String destinationCountry;
	private long accountNumber;
	private float amount;
	private int transactionCode;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSourcePassport() {
		return sourcePassport;
	}
	public void setSourcePassport(String sourcePassport) {
		this.sourcePassport = sourcePassport;
	}
	public String getDestinationPassport() {
		return destinationPassport;
	}
	public void setDestinationPassport(String destinationPassport) {
		this.destinationPassport = destinationPassport;
	}
	public String getDestinationCountry() {
		return destinationCountry;
	}
	public void setDestinationCountry(String destinationCountry) {
		this.destinationCountry = destinationCountry;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public int getTransactionCode() {
		return transactionCode;
	}
	public void setTransactionCode(int transactionCode) {
		this.transactionCode = transactionCode;
	}
	
	public TransactionEntity getEntity() {
		TransactionEntity transactioneentity = new TransactionEntity();
		transactioneentity.setName(name);
		transactioneentity.setAccountNumber(accountNumber);
		transactioneentity.setAmount(amount);
		transactioneentity.setDestinationCountry(destinationCountry);
		transactioneentity.setDestinationPassport(destinationPassport);
		transactioneentity.setSourcePassport(sourcePassport);
		transactioneentity.setTransactionCode(transactionCode);

		return transactioneentity;
	}

}

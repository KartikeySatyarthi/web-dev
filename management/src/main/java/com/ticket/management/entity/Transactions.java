package com.ticket.management.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="transaction")
public class Transactions {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="transaction_id")
	private int transactionId;
	
	@Column(name="time_of_payment")
	private String timeOfPayment;
	
	@Column(name="status")
	private String status;
	
	@Column(name="amount")
	private int amount;
	
	@Column(name="number_of_tickets")
	private int numberOfTickets;
	
	@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="customer_id")
	private Customer customer;
	
	public Transactions() {}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public String getTimeOfPayment() {
		return timeOfPayment;
	}

	public void setTimeOfPayment(String timeOfPayment) {
		this.timeOfPayment = timeOfPayment;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}



	public int getNumberOfTickets() {
		return numberOfTickets;
	}

	public void setNumberOfTickets(int numberOfTickets) {
		this.numberOfTickets = numberOfTickets;
	}

	public Transactions(String timeOfPayment, String status, int amount, int numberOfTickets) {
		this.timeOfPayment = timeOfPayment;
		this.status = status;
		this.amount = amount;
		this.numberOfTickets = numberOfTickets;
	}
	
	
}

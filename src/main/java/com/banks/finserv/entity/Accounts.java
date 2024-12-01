package com.banks.finserv.entity;

import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Accounts {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int acctid;
	private int userId;
	private String accNumber;
	private double balance;
	private LocalDate createdAt;
	private LocalDate updatedAt;
	private boolean isActive;
	
	
	public int getAcctid() {
		return acctid;
	}
	public void setAcctid(int acctid) {
		this.acctid = acctid;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public LocalDate getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}
	public LocalDate getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(LocalDate updatedAt) {
		this.updatedAt = updatedAt;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	@Override
	public int hashCode() {
		return Objects.hash(accNumber, acctid, balance, createdAt, isActive, updatedAt, userId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Accounts other = (Accounts) obj;
		return Objects.equals(accNumber, other.accNumber) && acctid == other.acctid
				&& Double.doubleToLongBits(balance) == Double.doubleToLongBits(other.balance)
				&& Objects.equals(createdAt, other.createdAt) && isActive == other.isActive
				&& Objects.equals(updatedAt, other.updatedAt) && userId == other.userId;
	}
	
	
	

}

package com.banks.finserv.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SavingGoals {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int goalId;
	
	private int accountId;
	
	private String name;
	
	private double targetAmount;
	
	private LocalDate targetDate;
	
	private double current_amount;

	
	
	public int getGoalId() {
		return goalId;
	}

	public void setGoalId(int goalId) {
		this.goalId = goalId;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTargetAmount() {
		return targetAmount;
	}

	public void setTargetAmount(double targetAmount) {
		this.targetAmount = targetAmount;
	}

	public LocalDate getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(LocalDate targetDate) {
		this.targetDate = targetDate;
	}

	public double getCurrent_amount() {
		return current_amount;
	}

	public void setCurrent_amount(double current_amount) {
		this.current_amount = current_amount;
	}
	
	

}

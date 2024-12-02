package com.banks.finserv.repository;

import org.springframework.data.repository.CrudRepository;

import com.banks.finserv.entity.SavingGoals;

public interface GoalsRepository extends CrudRepository<SavingGoals, Integer> {

}

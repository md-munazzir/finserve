package com.banks.finserv.repository;

import org.springframework.data.repository.CrudRepository;

import com.banks.finserv.entity.Transactions;

public interface TransRepository extends CrudRepository<Transactions, Integer> {

}

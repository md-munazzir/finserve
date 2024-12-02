package com.banks.finserv.repository;

import org.springframework.data.repository.CrudRepository;

import com.banks.finserv.entity.Investments;

public interface InvestmentsRepository extends CrudRepository<Investments, Integer> {

}

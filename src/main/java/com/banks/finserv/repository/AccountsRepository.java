package com.banks.finserv.repository;

import org.springframework.data.repository.CrudRepository;

import com.banks.finserv.entity.Accounts;

public interface AccountsRepository extends CrudRepository<Accounts, Integer> {

}

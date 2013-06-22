package com.moneymatters.neo4j.repository;

import com.moneymatters.domain.Account;
import org.springframework.data.neo4j.core.GraphDatabase;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Component;

/**
 * MoneyMatters = where money does matter!
 * By: H&W
 * Date: 6/22/13
 * Time: 10:57 AM
 * Class Name: AccountRepository
 */
@Component
public interface AccountRepository extends GraphRepository<Account> {}

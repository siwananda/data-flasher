package com.moneymatters.mongo.repository;

import com.moneymatters.domain.Account;
import com.moneymatters.mongo.domain.AccountImpl;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * MoneyMatters = where money does matter!
 * By: H&W
 * Date: 6/22/13
 * Time: 7:12 PM
 * Class Name: AccountRepository
 */
@Repository
public interface AccountRepository extends MongoRepository<Account, Long> {
}

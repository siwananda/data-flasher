package com.moneymatters.model.neo4j.repository;

import com.moneymatters.model.neo4j.UserImpl;
import org.springframework.data.neo4j.repository.GraphRepository;

/**
 * MoneyMatters = where money does matter!
 * By: H&W
 * Date: 6/21/13
 * Time: 3:42 PM
 * Class Name: UserRepository
 */
public interface UserRepository extends GraphRepository<UserImpl> {}

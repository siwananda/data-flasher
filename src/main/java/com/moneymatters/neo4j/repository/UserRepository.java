package com.moneymatters.neo4j.repository;

import com.moneymatters.neo4j.UserImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Component;

/**
 * MoneyMatters = where money does matter!
 * By: H&W
 * Date: 6/21/13
 * Time: 3:42 PM
 * Class Name: UserRepository
 */
@Component
public interface UserRepository extends GraphRepository<UserImpl> {}

package com.moneymatters.mongo.repository;

import com.moneymatters.domain.User;
import com.moneymatters.mongo.domain.UserImpl;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * MoneyMatters = where money does matter!
 * By: H&W
 * Date: 6/18/13
 * Time: 10:22 PM
 * Class Name: UserRepository
 */
@Repository
public interface UserRepository extends MongoRepository<User, Long> {
    User findByEmail(String email);
}

package com.moneymatters.model.mongo.repository;

import com.moneymatters.model.User;
import com.moneymatters.model.impl.UserImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * MoneyMatters = where money does matter!
 * By: H&W
 * Date: 6/18/13
 * Time: 10:22 PM
 * Class Name: UserRepository
 */
@Repository
public class UserRepository {
    static final Logger logger = LoggerFactory.getLogger(UserRepository.class);

    @Autowired
    MongoTemplate mongoTemplate;

    public void logAllUsers() {
        List<User> results = mongoTemplate.findAll(User.class);
        logger.info("Total amount of persons: {}", results.size());
        logger.info("Results: {}", results);
        System.out.println("Total amount of persons: {}" + results.size());
        System.out.println("Results: {}" + results);
    }

    public void insertUser(User user) {
        mongoTemplate.insert(user, "user");
    }


    public void createUserCollection() {
        if (!mongoTemplate.collectionExists(User.class)) {
            mongoTemplate.createCollection(User.class);
        }
    }

    public void dropUserCollection() {
        if (mongoTemplate.collectionExists(User.class)) {
            mongoTemplate.dropCollection(User.class);
        }
    }
}

package com.moneymatters.model.mongo.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * MoneyMatters = where money does matter!
 * By: H&W
 * Date: 6/19/13
 * Time: 10:07 AM
 * Class Name: MainRepository
 */
@Repository
public class MainRepository<T> {
    static final Logger logger = LoggerFactory.getLogger(MainRepository.class);

    @Autowired
    MongoTemplate mongoTemplate;

    public void logAllRecords(Class<T> clazz) {
        List<T> results = mongoTemplate.findAll(clazz);
        logger.info("Total amount of "+clazz+": {}", results.size());
        logger.info("Results: {}", results);
        System.out.println("Total amount of "+clazz+": {}" + results.size());
        System.out.println("Results: {}" + results);
    }

    public void insertRecord(T cvalue) {
        Class<?>[] theInterfaces = cvalue.getClass().getInterfaces();
        mongoTemplate.insert(cvalue, theInterfaces[0].getSimpleName());
    }


    public void createTCollection(Class<T> clazz) {
        if (!mongoTemplate.collectionExists(clazz)) {
            mongoTemplate.createCollection(clazz);
        }
    }

    public void dropTCollection(Class<T> clazz) {
        if (mongoTemplate.collectionExists(clazz)) {
            mongoTemplate.dropCollection(clazz);
        }
    }

    public void testQuery(){
    }
}

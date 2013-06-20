package com.moneymatters.model;

import com.moneymatters.model.mongo.repository.MainRepository;
import com.moneymatters.model.mongo.repository.UserRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sun.jdbc.odbc.ee.PoolProperties;

/**
 * MoneyMatters = where money does matter!
 * By: H&W
 * Date: 6/18/13
 * Time: 9:33 PM
 * Class Name: MongoDbTest
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
public class MongoDbTest {
    @Test
    @Ignore
    public void mainTest() throws Exception {

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        UserRepository userRepository = context.getBean(UserRepository.class);
        userRepository.dropUserCollection();
        userRepository.createUserCollection();

        /*repository.dropCollection(X.class);
        repository.createCollection(X.class);
        repository.insert(collectionClass, Object);
        repository.find(collectionClass, Object);*/


        for(int i=0; i<20; i++) {
            User u = context.getBean(User.class);
            u.setName("kuontol");
            userRepository.insertUser(u);
        }

        userRepository.logAllUsers();
    }

    @Test
    public void genericsTest() throws Exception {

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        MainRepository genericRepo = context.getBean(MainRepository.class);
        genericRepo.dropTCollection(User.class);
        genericRepo.createTCollection(User.class);

        /*repository.dropCollection(X.class);
        repository.createCollection(X.class);
        repository.insert(collectionClass, Object);
        repository.find(collectionClass, Object);*/


        for(int i=0; i<20; i++) {
            User u = context.getBean(User.class);
            u.setName("kuontol");
            genericRepo.insertRecord(u);
        }

        genericRepo.logAllRecords(User.class);
    }
}

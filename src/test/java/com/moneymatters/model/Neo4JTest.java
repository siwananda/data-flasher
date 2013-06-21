package com.moneymatters.model;

import com.moneymatters.model.neo4j.UserImpl;
import com.moneymatters.model.neo4j.repository.UserRepository;
import com.moneymatters.model.neo4j.repository.UserRepositoryImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.neo4j.support.Neo4jTemplate;
import org.springframework.data.neo4j.support.node.Neo4jHelper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.AfterTransaction;
import org.springframework.test.context.transaction.BeforeTransaction;
import org.springframework.transaction.annotation.Transactional;

/**
 * MoneyMatters = where money does matter!
 * By: H&W
 * Date: 6/21/13
 * Time: 3:43 PM
 * Class Name: Neo4JTest
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-neo4j-config.xml")
@Transactional
public class Neo4JTest {

    @Autowired
    UserRepositoryImpl userRepository;

    @Autowired
    Neo4jTemplate template;

    @BeforeTransaction
    public void cleanupgraph(){
        Neo4jHelper.cleanDb(template);
    }

    @Test
    public void mainTest() throws Exception {
        //ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring-neo4j-config.xml");


       /* @Autowired PersonRepository repo;
        emil = repo.findByPropertyValue("name", "emil");
        long numberOfPeople = repo.count();*/
        //UserRepositoryImpl userRepository = context.getBean(UserRepositoryImpl.class);

        userRepository.createUser("John", "3251");


    }

    @AfterTransaction
    public void closeConn(){
    }

}

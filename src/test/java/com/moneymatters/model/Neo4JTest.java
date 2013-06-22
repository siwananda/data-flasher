package com.moneymatters.model;

import com.moneymatters.domain.User;
import com.moneymatters.neo4j.domain.UserImpl;
import com.moneymatters.neo4j.manager.UserManager;
import com.moneymatters.neo4j.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.neo4j.support.Neo4jTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
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
    UserManager userManager;

    @Test(expected=DataIntegrityViolationException.class)
    public void mainTest() throws Exception {
        //ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring-neo4j-config.xml");


       /* @Autowired PersonRepository repo;
        emil = repo.findByPropertyValue("name", "emil");
        long numberOfPeople = repo.count();*/
        //UserRepositoryImpl userRepository = context.getBean(UserRepositoryImpl.class);

        userManager.createUser("John", "johnBosco@email.com");
        userManager.createUser("Kakung", "kakungBisco@email.com");

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring-neo4j-config.xml");
        UserRepository userRepo = context.getBean(UserRepository.class);
        User u = userRepo.findByEmail("kakungBisco@email.com");
        u.setEmail("johnBosco@email.com");
        userRepo.save((UserImpl)u);


    }

}

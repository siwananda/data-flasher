package com.moneymatters.model;

import com.moneymatters.domain.Account;
import com.moneymatters.domain.User;
import com.moneymatters.mongo.manager.AccountManager;
import com.moneymatters.neo4j.domain.UserImpl;
import com.moneymatters.neo4j.manager.UserManager;
import com.moneymatters.neo4j.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * MoneyMatters = where money does matter!
 * By: H&W
 * Date: 6/23/13
 * Time: 12:13 AM
 * Class Name: combinedTest
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:spring_combined_config.xml"})
public class combinedTest {

    @Test(expected=DataIntegrityViolationException.class)
    public void neo4jTest() throws Exception {
        //ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring-neo4j-config.xml");


       /* @Autowired PersonRepository repo;
        emil = repo.findByPropertyValue("name", "emil");
        long numberOfPeople = repo.count();*/
        //UserRepositoryImpl userRepository = context.getBean(UserRepositoryImpl.class);
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.getEnvironment().setActiveProfiles("neo4j");
        context.load("classpath:spring_combined_config.xml");
        context.refresh();
        UserManager userManager = context.getBean(UserManager.class);
        userManager.createUser("John", "johnBosco@email.com");
        userManager.createUser("Kakung", "kakungBisco@email.com");


        UserRepository userRepo = context.getBean(UserRepository.class);
        User u = userRepo.findByEmail("kakungBisco@email.com");
        u.setEmail("johnBosco@email.com");
        userRepo.save((UserImpl)u);


    }


    @Test
    public void mongoTest() throws Exception {
        //ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring-neo4j-config.xml");


       /* @Autowired PersonRepository repo;
        emil = repo.findByPropertyValue("name", "emil");
        long numberOfPeople = repo.count();*/
        //UserRepositoryImpl userRepository = context.getBean(UserRepositoryImpl.class);
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.getEnvironment().setActiveProfiles("mongo");
        context.load("classpath:spring_combined_config.xml");
        context.refresh();
        com.moneymatters.mongo.manager.UserManager userManager = context.getBean(com.moneymatters.mongo.manager.UserManager.class);
        userManager.createUser("John", "johnBosco@email.com");
        userManager.createUser("Kakung", "kakungBisco@email.com");


        com.moneymatters.mongo.repository.UserRepository userRepo = context.getBean(com.moneymatters.mongo.repository.UserRepository.class);
        User u = userRepo.findByEmail("kakungBisco@email.com");
        u.setEmail("johnBosco@email.com");
        userRepo.save((com.moneymatters.mongo.domain.UserImpl)u);
    }

    @Test
    public void mongoAccountTest() throws Exception {
        //ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring-neo4j-config.xml");


       /* @Autowired PersonRepository repo;
        emil = repo.findByPropertyValue("name", "emil");
        long numberOfPeople = repo.count();*/
        //UserRepositoryImpl userRepository = context.getBean(UserRepositoryImpl.class);
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.getEnvironment().setActiveProfiles("combined");
        context.load("classpath:spring_combined_config.xml");
        context.refresh();
        AccountManager accountManager = context.getBean(AccountManager.class);accountManager.createAccount("12345", "johnBosco@email.com");
        accountManager.createAccount("67890", "kakungBisco@email.com");
    }

    @Test
    public void mongoUserAccountTest() throws Exception {
        //ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring-neo4j-config.xml");


       /* @Autowired PersonRepository repo;
        emil = repo.findByPropertyValue("name", "emil");
        long numberOfPeople = repo.count();*/
        //UserRepositoryImpl userRepository = context.getBean(UserRepositoryImpl.class);
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.getEnvironment().setActiveProfiles("combined");
        context.load("classpath:spring_combined_config.xml");
        context.refresh();
        AccountManager accountManager = context.getBean(AccountManager.class);
        Account account = accountManager.createAccount("12345", "johnBosco@email.com");
        com.moneymatters.mongo.manager.UserManager userManager = context.getBean(com.moneymatters.mongo.manager.UserManager.class);
        User user = userManager.findUser("johnBosco@email.com");
        userManager.addAccount(user.getEmail(), account);
    }




}

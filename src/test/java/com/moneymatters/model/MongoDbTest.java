package com.moneymatters.model;

import com.moneymatters.domain.User;
import com.moneymatters.domain.UserInterface;
import com.moneymatters.mongo.domain.UserImpl;
import com.moneymatters.mongo.repository.MainRepository;
import com.moneymatters.mongo.repository.UserRepository;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * MoneyMatters = where money does matter!
 * By: H&W
 * Date: 6/18/13
 * Time: 9:33 PM
 * Class Name: MongoDbTest
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mongo-config.xml")
public class MongoDbTest {

    @Test
    public void mainTest() throws Exception {

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring-mongo-config.xml");

        UserRepository userRepository = context.getBean(UserRepository.class);

       /* User userInterface = new UserImpl();
        userInterface.setFirstName("kuontil");
        userRepository.save((UserImpl) userInterface);*/

        /*for(int i=0; i<20; i++) {
            User u = context.getBean(UserImpl.class);
            u.setFirstName("kuontol"+i);
            u.setEmail("gogon_"+i+"@email.com");
            userRepository.save((UserImpl) u);
        }*/

        User u = context.getBean(UserImpl.class);
        u.setFirstName("dogong");
        u.setEmail("gogon_0@email.com");
        userRepository.save((UserImpl) u);

        User u1 = context.getBean(UserImpl.class);
        u1.setFirstName("kuontol");
        u1.setEmail("gogon_0@email.com");
        userRepository.save((UserImpl) u1);

        Assert.assertNotSame(u, u1);

        User u2 = context.getBean(UserImpl.class);
        u2.setFirstName("Cendrawasih");
        u2.setEmail("cendra@email.com");
        userRepository.save((UserImpl) u2);
        Assert.assertNotSame(u2, u1);


        User u3 = userRepository.findByEmail("cendra@email.com");
        Assert.assertNotSame(u3, u2);
        u3.setFirstName("wuanjuenk");
        u3.setEmail("gogon_0@email.com");
        userRepository.save((UserImpl) u3);
    }

    @Test
    @Ignore
    public void genericsTest() throws Exception {

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring-mongo-config.xml");

        MainRepository genericRepo = context.getBean(MainRepository.class);
        genericRepo.dropTCollection(User.class);
        genericRepo.createTCollection(User.class);

        /*repository.dropCollection(X.class);
        repository.createCollection(X.class);
        repository.insert(collectionClass, Object);
        repository.find(collectionClass, Object);*/


        for(int i=0; i<20; i++) {
            User u = context.getBean(User.class);
            u.setFirstName("kuontol");
            genericRepo.insertRecord(u);
        }

        genericRepo.logAllRecords(User.class);
    }
}

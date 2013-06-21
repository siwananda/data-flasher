package com.moneymatters.neo4j.manager;

import com.moneymatters.domain.User;
import com.moneymatters.neo4j.UserImpl;
import com.moneymatters.neo4j.repository.UserRepository;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * MoneyMatters = where money does matter!
 * By: H&W
 * Date: 6/21/13
 * Time: 3:48 PM
 * Class Name: UserRepositoryImpl
 */
@Service
public class UserManager implements ApplicationContextAware{

    @Autowired
    private UserRepository userRepository;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public Collection<UserImpl> makeSomeUser() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public UserImpl createUser(String name, String id) {
        User user = new UserImpl();
        user.setName(name);
        user.setId(id);
        userRepository.save((UserImpl)user);
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}

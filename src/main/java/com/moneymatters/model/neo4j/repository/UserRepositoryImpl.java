package com.moneymatters.model.neo4j.repository;

import com.moneymatters.model.User;
import com.moneymatters.model.neo4j.UserImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
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
public class UserRepositoryImpl {

    @Autowired
    private UserRepository userRepository;

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

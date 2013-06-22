package com.moneymatters.mongo.domain;

import java.util.List;

import com.moneymatters.domain.Account;
import com.moneymatters.domain.Budget;
import com.moneymatters.domain.User;
import com.moneymatters.domain.UserInterface;
import org.springframework.context.annotation.Scope;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.stereotype.Component;

/**
 * MoneyMatters = where money does matter!
 * By: H&W
 * Date: 6/16/13
 * Time: 1:37 AM
 * Class Name: UserInterface
 */
@Component
@Scope(value = "prototype")
public class UserImpl extends User implements UserInterface {
    @Id
    private String id;

    public String getId() {
        return id; //To change body of implemented methods use File | Settings | File Templates.
    }
    public void setId(String id) {
        this.id=id;
    }

    @Indexed(unique = true)
    String email;
    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email= email;
    }
}

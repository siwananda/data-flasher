package com.moneymatters.neo4j.domain;

import com.moneymatters.domain.User;
import com.moneymatters.domain.UserInterface;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.Indexed;
import org.springframework.data.neo4j.annotation.NodeEntity;

/**
 * MoneyMatters = where money does matter!
 * By: H&W
 * Date: 6/21/13
 * Time: 3:36 PM
 * Class Name: UserInterface
 */
@NodeEntity
public class UserImpl extends User implements UserInterface {

    @GraphId
    private Long id;

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
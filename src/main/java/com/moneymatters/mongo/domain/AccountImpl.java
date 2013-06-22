package com.moneymatters.mongo.domain;

import com.moneymatters.domain.Account;
import org.springframework.context.annotation.Scope;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.stereotype.Component;

/**
 * MoneyMatters = where money does matter!
 * By: H&W
 * Date: 6/22/13
 * Time: 7:13 PM
 * Class Name: AccountImpl
 */
@Component
@Scope(value = "prototype")
public class AccountImpl extends Account {
    @Id
    private String id;

    @Indexed(unique = true)
    String accountNumber;
    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}

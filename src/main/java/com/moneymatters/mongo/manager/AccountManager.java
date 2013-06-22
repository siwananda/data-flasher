package com.moneymatters.mongo.manager;

import com.moneymatters.domain.Account;
import com.moneymatters.mongo.domain.AccountImpl;
import com.moneymatters.mongo.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * MoneyMatters = where money does matter!
 * By: H&W
 * Date: 6/23/13
 * Time: 1:03 AM
 * Class Name: AccountManager
 */
@Service
public class AccountManager {

    @Autowired
    AccountRepository accountRepository;

    public Account createAccount(String accountNumber, String accountName) {
        Account account = new AccountImpl();
        account.setAccountNumber(accountNumber);
        account.setAccountName(accountName);
        accountRepository.save(account);

        return account;  //To change body of implemented methods use File | Settings | File Templates.
    }


}

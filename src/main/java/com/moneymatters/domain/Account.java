package com.moneymatters.domain;

/**
 * MoneyMatters = where money does matter!
 * By: H&W
 * Date: 6/15/13
 * Time: 4:26 PM
 * Class Name: Account
 */
public class Account {

    String accountNumber;

    String accountName;
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
}

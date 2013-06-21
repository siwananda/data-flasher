package com.moneymatters.mongo;

import java.util.List;

import com.moneymatters.domain.Account;
import com.moneymatters.domain.BaseModel;
import com.moneymatters.domain.Budget;
import com.moneymatters.domain.User;

/**
 * MoneyMatters = where money does matter!
 * By: H&W
 * Date: 6/16/13
 * Time: 1:37 AM
 * Class Name: UserImpl
 */
public class UserImpl extends BaseModel implements User {
    String fullName;
    String userName;
    String firstName;
    String lastName;
    boolean premiumMember;

    int age;

    List<Account> accountList;
    List<Budget>  budgetList;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isPremiumMember() {
        return premiumMember;
    }

    public void setPremiumMember(boolean premiumMember) {
        this.premiumMember = premiumMember;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }

    public List<Budget> getBudgetList() {
        return budgetList;
    }

    public void setBudgetList(List<Budget> budgetList) {
        this.budgetList = budgetList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

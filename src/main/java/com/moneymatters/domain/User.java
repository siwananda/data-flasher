package com.moneymatters.domain;

import java.util.List;

/**
 * MoneyMatters = where money does matter!
 * By: H&W
 * Date: 6/17/13
 * Time: 10:53 AM
 * Class Name: UserInf
 */
public class User {
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

    String email;
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email= email;
    }
}

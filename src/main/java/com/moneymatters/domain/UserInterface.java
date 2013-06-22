package com.moneymatters.domain;

import java.util.List;

/**
 * MoneyMatters = where money does matter!
 * By: H&W
 * Date: 6/22/13
 * Time: 11:02 PM
 * Class Name: UserInterface
 */
public interface UserInterface {
    public String getEmail();
    public void setEmail(String name);
    public String getFullName();
    public void setFullName(String fullName);
    public String getUserName();
    public void setUserName(String userName);
    public String getFirstName();
    public void setFirstName(String firstName);
    public String getLastName();
    public void setLastName(String lastName);
    public boolean isPremiumMember();
    public void setPremiumMember(boolean premiumMember);
    public List<Account> getAccountList();
    public void setAccountList(List<Account> accountList);
    public List<Budget> getBudgetList();
    public void setBudgetList(List<Budget> budgetList);
}


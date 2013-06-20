package com.moneymatters.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * MoneyMatters = where money does matter!
 * By: H&W
 * Date: 6/17/13
 * Time: 10:53 AM
 * Class Name: UserInf
 */
public interface User {
    public String getId();
    public String getName();
    public void setId(String id);
    public void setName(String name);
}

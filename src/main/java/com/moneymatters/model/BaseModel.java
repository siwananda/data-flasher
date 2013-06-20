package com.moneymatters.model;

import org.springframework.data.annotation.Id;

/**
 * MoneyMatters = where money does matter!
 * By: H&W
 * Date: 6/16/13
 * Time: 1:19 AM
 * Class Name: BaseModel
 */
public class BaseModel {
    public String id;
    public String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

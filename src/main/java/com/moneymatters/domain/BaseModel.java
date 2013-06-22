package com.moneymatters.domain;

import org.springframework.data.annotation.Id;

/**
 * MoneyMatters = where money does matter!
 * By: H&W
 * Date: 6/16/13
 * Time: 1:19 AM
 * Class Name: BaseModel
 */
public class BaseModel {
    public Long id;
    public String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

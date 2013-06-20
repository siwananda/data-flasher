package com.moneymatters.model;

import java.util.Calendar;

/**
 * MoneyMatters = where money does matter!
 * By: H&W
 * Date: 6/15/13
 * Time: 5:55 PM
 * Class Name: BudgetItem
 */
public class BudgetItem extends BaseModel {
    Category category;
    Long amount;
    Calendar date;
}

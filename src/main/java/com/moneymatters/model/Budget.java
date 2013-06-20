package com.moneymatters.model;

import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.List;

/**
 * MoneyMatters = where money does matter!
 * By: H&W
 * Date: 6/15/13
 * Time: 5:55 PM
 * Class Name: Budget
 */
@Component
public class Budget extends BaseModel{
    List<BudgetItem> budgetItemList;
    Calendar date;
}

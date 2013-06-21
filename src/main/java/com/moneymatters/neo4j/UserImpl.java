package com.moneymatters.neo4j;

import com.moneymatters.domain.User;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.Indexed;
import org.springframework.data.neo4j.annotation.NodeEntity;

/**
 * MoneyMatters = where money does matter!
 * By: H&W
 * Date: 6/21/13
 * Time: 3:36 PM
 * Class Name: UserImpl
 */
@NodeEntity
public class UserImpl implements User {

    @GraphId
    private Long nodeId;
    private String id;

    @Indexed( indexName = "name" )
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
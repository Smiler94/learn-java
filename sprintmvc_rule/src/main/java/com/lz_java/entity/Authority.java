package com.lz_java.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Authority {
    @Id
    private String id;

    @Field
    private String name;

    private boolean has;

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

    public boolean isHas() {
        return has;
    }

    public void setHas(boolean has) {
        this.has = has;
    }
}

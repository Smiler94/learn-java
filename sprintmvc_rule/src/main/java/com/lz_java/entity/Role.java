package com.lz_java.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document
public class Role {
    @Id
    private String id;

    @Field
    private String name;

    @Field
    private List<String> auths;

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

    public List<String> getAuths() {
        return auths;
    }

    public void setAuths(List<String> auths) {
        this.auths = auths;
    }

    public boolean isHas() {
        return has;
    }

    public void setHas(boolean has) {
        this.has = has;
    }
}

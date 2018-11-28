package com.daffaalam.example.simpleasynctasks.model;

import com.google.gson.annotations.SerializedName;

public class CreatedBy {

    @SerializedName("gravatar_hash")
    private String gravatarHash;

    @SerializedName("name")
    private String name;

    @SerializedName("id")
    private String id;

    @SerializedName("username")
    private String username;

    public void setGravatarHash(String gravatarHash) {
        this.gravatarHash = gravatarHash;
    }

    public String getGravatarHash() {
        return gravatarHash;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
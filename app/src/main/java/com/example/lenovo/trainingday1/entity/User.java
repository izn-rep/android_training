package com.example.lenovo.trainingday1.entity;

import com.google.gson.annotations.SerializedName;

/**
 * Created by LENOVO on 9/3/2016.
 */
public class User {
    @SerializedName("success")
    private boolean success;
    @SerializedName("uid")
    private String uid;
    @SerializedName("name")
    private String name;
    @SerializedName("email")
    private String email;
    @SerializedName("error_message")
    private String errorMessage;

    public boolean isSuccess() {
        return success;
    }

    public String getUid() {
        return uid;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}

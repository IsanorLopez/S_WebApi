package com.isanor.webapi.models.dto;

import com.isanor.webapi.models.User;

public class UserDto {

    private String title;
    private User user;

    public String getTitle() {
        return title;
    }

    public User getUser() {
        return user;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

package com.buzilov.patterns.behavioral.visitor.model;

import java.util.ArrayList;
import java.util.List;

public class CommunityGroup {
    private List<User> groupUsers = new ArrayList<>();

    public CommunityGroup() {
    }

    public List<User> getGroupUsers() {
        return groupUsers;
    }

    public void setGroupUsers(List<User> groupUsers) {
        this.groupUsers = groupUsers;
    }
}

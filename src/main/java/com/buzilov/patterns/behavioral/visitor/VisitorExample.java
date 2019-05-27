package com.buzilov.patterns.behavioral.visitor;

import com.buzilov.patterns.behavioral.visitor.model.*;

import java.util.Arrays;

public class VisitorExample {
    public static void main(String[] args) {
        CommunityGroup communityGroup = new CommunityGroup();
        communityGroup.getGroupUsers().addAll(Arrays.asList(
                new SimpleUser("vasya simple", "123"),
                new Admin("petya admin", "456"),
                new ContentManager("kolya content manager", "789")
        ));

        UsersVisitor visitor = new UsersTopicUpdatedVisitor();

        for (User user : communityGroup.getGroupUsers()) {
            user.accept(visitor);
        }
    }
}

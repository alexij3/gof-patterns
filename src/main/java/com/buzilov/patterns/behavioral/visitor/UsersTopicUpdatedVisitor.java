package com.buzilov.patterns.behavioral.visitor;

import com.buzilov.patterns.behavioral.visitor.model.Admin;
import com.buzilov.patterns.behavioral.visitor.model.ContentManager;
import com.buzilov.patterns.behavioral.visitor.model.SimpleUser;

public class UsersTopicUpdatedVisitor implements UsersVisitor {
    @Override
    public void visitSimpleUser(SimpleUser user) {
        System.out.printf("[Message for: %s]: A topic in your community group was updated.%n",
                user.getUsername());
    }

    @Override
    public void visitAdmin(Admin user) {
        System.out.printf("[Message for: %s]: A topic in your community group was updated. Go there and do some admin stuff.%n",
                user.getUsername());
    }

    @Override
    public void visitContentManager(ContentManager user) {
        System.out.printf("[Message for: %s]: A topic in your community group was updated. Go there and do some content manager stuff.%n",
                user.getUsername());
    }
}

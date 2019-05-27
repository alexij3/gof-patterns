package com.buzilov.patterns.behavioral.visitor;

import com.buzilov.patterns.behavioral.visitor.model.Admin;
import com.buzilov.patterns.behavioral.visitor.model.ContentManager;
import com.buzilov.patterns.behavioral.visitor.model.SimpleUser;

public interface UsersVisitor {
    void visitSimpleUser(SimpleUser user);
    void visitAdmin(Admin user);
    void visitContentManager(ContentManager user);
}

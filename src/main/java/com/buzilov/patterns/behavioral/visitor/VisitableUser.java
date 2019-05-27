package com.buzilov.patterns.behavioral.visitor;

public interface VisitableUser {
    void accept(UsersVisitor visitor);
}

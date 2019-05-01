package com.buzilov.patterns.behavioral.chain.repository;

import com.buzilov.patterns.behavioral.chain.model.SimpleUser;
import com.buzilov.patterns.behavioral.chain.model.User;

import java.util.HashMap;

public class UserRepository {
    public static final HashMap<Integer, User> users = new HashMap<>();
}

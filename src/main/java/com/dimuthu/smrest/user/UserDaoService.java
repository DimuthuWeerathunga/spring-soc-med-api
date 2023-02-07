package com.dimuthu.smrest.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1, "Adam", LocalDate.now().minusYears(30)));
        users.add(new User(1, "Eve", LocalDate.now().minusYears(35)));
        users.add(new User(1, "James", LocalDate.now().minusYears(20)));
    }

    public List<User> findAll(){
        return users;
    }

}

package com.dimuthu.smrest.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();

    private static int usersCount = 3;

    static {
        users.add(new User(1, "Adam", LocalDate.now().minusYears(30)));
        users.add(new User(1, "Eve", LocalDate.now().minusYears(35)));
        users.add(new User(1, "James", LocalDate.now().minusYears(20)));
    }

    public List<User> findAll(){
        return users;
    }

    public User findOne(Integer id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        User user = users.stream().filter(predicate).findFirst().get();
        return user;
    }

    public User saveUser(User user){
        user.setId(++usersCount);
        users.add(user);
        return user;
    }
}

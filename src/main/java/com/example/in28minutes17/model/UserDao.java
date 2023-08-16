package com.example.in28minutes17.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDao {
    private static List<User> users  = new ArrayList<>();
    private static int userCount;

    static {
        users.add(new User(++userCount,"Jim",23));
        users.add(new User(++userCount,"Dwight",21));
        users.add(new User(++userCount,"Michael",34));
        users.add(new User(++userCount,"Oscar",43));
    }

    public static List<User> getAllUsers(){
        return users;
    }

    public User save(User user){
        user.setId(++userCount);
        users.add(user);
        return user;
    }
    public  User getUserByID(int id){
        Predicate<? super User> predicate= user -> user.getId()==id;
        return users.stream().filter(predicate).findFirst().get();
    }

    public void deleteUser(int id){
        Predicate<? super User> predicate= user -> user.getId()==id;
        users.removeIf(predicate);
    }
}

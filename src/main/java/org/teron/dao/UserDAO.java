package org.teron.dao;

import org.springframework.stereotype.Component;
import org.teron.models.User;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDAO {

    public static int USER_COUNT;

    private List<User> users;

    {
        users = new ArrayList<>();

        users.add(new User(++USER_COUNT, "Petr", "petr@mail.ru","123456"));
        users.add(new User(++USER_COUNT, "chelik", "chk@mail.ru","qwerty123"));
        users.add(new User(++USER_COUNT, "dantessss", "edmond@mail.ru","edm159"));
    }

    public User show(int id){
        return users.stream().filter(user -> user.getId() == id).findAny().orElse(null);
    }
    public User show(String name){
        return users.stream().filter(user -> user.getName() == name).findAny().orElse(null);
    }

    public void save(User user){
        user.setId(++USER_COUNT);
        users.add(user);
    }

}

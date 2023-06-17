package jkcodebase.jwt.example.service;

import jkcodebase.jwt.example.model.User;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(),"Ahmed","ahmed@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Naseem","naseem@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Saeed","saeed@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Haris","haris@gmail.com"));
    }

    public List<User> getUsers(){
        return this.store;
    }
}

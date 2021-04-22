package com.example.demo.Repositories;

import com.example.demo.Enteties.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    public User findByUsername(String username);
}

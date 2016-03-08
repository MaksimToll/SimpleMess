package com.simplemess.repository;

import com.simplemess.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRespository extends CrudRepository<User, Long> {
    List<User> findByName(String name);
}

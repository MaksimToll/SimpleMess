package com.simplemess.repository;

import com.simplemess.enums.UserRole;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by mtol on 22.03.2016.
 */
public interface UserRoleRepository extends CrudRepository<UserRole, Integer> {
}

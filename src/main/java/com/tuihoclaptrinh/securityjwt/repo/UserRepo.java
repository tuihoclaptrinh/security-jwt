package com.tuihoclaptrinh.securityjwt.repo;

import com.tuihoclaptrinh.securityjwt.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Tuan Anh New Bie Dev
 * @version : 1.0 | UserRepo
 * @since : 10:47 PM | 10/15/2022
 */
public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

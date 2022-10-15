package com.tuihoclaptrinh.securityjwt.repo;

import com.tuihoclaptrinh.securityjwt.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Tuan Anh New Bie Dev
 * @version : 1.0 | RoleRepo
 * @since : 10:50 PM | 10/15/2022
 */
public interface RoleRepo extends JpaRepository<Role, Long> {
    Role findByName(String name);
}

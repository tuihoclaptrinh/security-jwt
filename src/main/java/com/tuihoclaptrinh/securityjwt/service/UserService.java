package com.tuihoclaptrinh.securityjwt.service;

import com.tuihoclaptrinh.securityjwt.domain.Role;
import com.tuihoclaptrinh.securityjwt.domain.User;

import java.util.List;

/**
 * @author : Tuan Anh New Bie Dev
 * @version : 1.0 | UserService
 * @since : 10:53 PM | 10/15/2022
 */
public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username,String roleName);
    User getUser(String username);
    List<User> getUsers();
}

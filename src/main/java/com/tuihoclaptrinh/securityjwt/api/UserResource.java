package com.tuihoclaptrinh.securityjwt.api;

import com.tuihoclaptrinh.securityjwt.domain.User;
import com.tuihoclaptrinh.securityjwt.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : Tuan Anh New Bie Dev
 * @version : 1.0 | UserResource
 * @since : 11:02 PM | 10/15/2022
 */

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserResource {
    private final UserService userService;

    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsers() {
        return ResponseEntity.ok().body(userService.getUsers());
    }



}

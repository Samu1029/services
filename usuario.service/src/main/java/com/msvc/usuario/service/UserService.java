package com.msvc.usuario.service;

import com.msvc.usuario.entity.User;

import java.util.List;

public interface UserService {

    User SaveUser(User user);

    List<User> getAllUser();

    User getUser(String userId);
}

package com.msvc.usuario.service.impl;

import com.msvc.usuario.entity.User;
import com.msvc.usuario.exceptions.ResourceNotFoundException;
import com.msvc.usuario.repository.UserRepository;
import com.msvc.usuario.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class userServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User SaveUser(User user) {
        String randomUserId = UUID.randomUUID().toString();
        user.setUsuarioId(randomUserId);
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String userId) {
        return userRepository.findById(userId).orElseThrow(()
                -> new ResourceNotFoundException("Usuario no encontrado con el ID: "+ userId));
    }
}

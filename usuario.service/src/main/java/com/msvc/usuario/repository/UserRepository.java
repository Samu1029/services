package com.msvc.usuario.repository;

import com.msvc.usuario.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String>{
}

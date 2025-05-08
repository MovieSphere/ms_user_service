package com.upao.infraestructura.ms_user_service.repositories;

import com.upao.infraestructura.ms_user_service.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}

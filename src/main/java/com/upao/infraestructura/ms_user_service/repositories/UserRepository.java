package com.upao.infraestructura.ms_user_service.repositories;

import com.upao.infraestructura.ms_user_service.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}

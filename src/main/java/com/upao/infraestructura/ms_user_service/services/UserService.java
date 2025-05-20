package com.upao.infraestructura.ms_user_service.services;

import com.upao.infraestructura.ms_user_service.models.User;
import com.upao.infraestructura.ms_user_service.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public List<User> findAll() {
        return repo.findAll();
    }

    public User save(User user) {
        return repo.save(user);
    }

    public void delete(Integer id) {
        repo.deleteById(id);
    }
}

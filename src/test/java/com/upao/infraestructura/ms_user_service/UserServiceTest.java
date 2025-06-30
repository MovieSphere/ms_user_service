package com.upao.infraestructura.ms_user_service.services;

import com.upao.infraestructura.ms_user_service.models.User;
import com.upao.infraestructura.ms_user_service.repositories.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    //Test 1: Buscar usuario existente
    @Test
    void findById_userExists_returnsUser() {
        User user = new User(1L, "user", "pass", "USER");
        when(userRepository.findById(1L)).thenReturn(Optional.of(user));

        Optional<User> result = userService.findById(1L);

        assertTrue(result.isPresent());
        assertEquals("user", result.get().getUsername());
    }

    //Test 2: Buscar usuario inexistente
    @Test
    void findById_userNotFound_returnsEmpty() {
        when(userRepository.findById(2L)).thenReturn(Optional.empty());

        Optional<User> result = userService.findById(2L);

        assertFalse(result.isPresent());
    }

    //Test 3: Guardar usuario
    @Test
    void save_validUser_savesUser() {
        User user = new User(null, "newUser", "pass", "USER");
        when(userRepository.save(any(User.class))).thenReturn(user);

        User saved = userService.save(user);

        assertEquals("newUser", saved.getUsername());
        verify(userRepository, times(1)).save(user);
    }
}
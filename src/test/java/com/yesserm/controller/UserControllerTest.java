package com.yesserm.controller;

import com.yesserm.model.User;
import com.yesserm.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserControllerTest {
    @Test
    public void testNombreUser(){
        User user = new User(null, "yesser","123","yesser@mail.com");
        String nombreEsperado = "yesser";
        assertEquals(nombreEsperado, user.getUsername());
    }

}
package com.cooklab.demo.controllers;

import com.cooklab.demo.Controller.HelloController;
import org.junit.jupiter.api.Test;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;

import static org.junit.jupiter.api.Assertions.*;

public class HelloControllersUnitTest {

    @Test
    void sayHello() {
        HelloController helloController = new HelloController();
        Model model = new BindingAwareModelMap();
        String result  = helloController.sayHello("World",model);
        assertAll(
                () -> assertEquals("World", model.asMap().get("user")),
                () -> assertEquals("hello", result)
        );
    }
}

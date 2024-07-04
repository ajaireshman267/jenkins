package com.example.demo.ajai;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class Controller {

        @GetMapping("/show")
        public String show() {
            return "welcome to jenkin session";
        }
    }


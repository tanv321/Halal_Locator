package com.halallocator.halallocatorbackend;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class MainController {

    @GetMapping("localhost:8080")
    public String home() {
        return "Welcome to the Spring Boot Application!";
    }
    @GetMapping("/")
    public String home2() {
        return "Welcome to the Spring Boot Application!";
    }
}

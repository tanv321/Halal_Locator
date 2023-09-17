package com.halallocator.halallocatorbackend;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class MainController {

    
    @GetMapping("/")
    public String home2() {
        return "Welcome to the Spring Boot Application!";
    }
    @GetMapping("/test/page")
    public String homePage(){
        return "This is the test page";
    }

}

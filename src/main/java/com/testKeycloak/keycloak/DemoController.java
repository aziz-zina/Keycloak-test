package com.testKeycloak.keycloak;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")
public class DemoController {

    @GetMapping
    @PreAuthorize("hasRole('client_user')")
    public String hello(){
        return "Hello World!";
    }

    @GetMapping("/hello-admin")
    @PreAuthorize("hasRole('client_admin')")
    public String helloAdmin(){
        return "Hello Admin!";
    }
}

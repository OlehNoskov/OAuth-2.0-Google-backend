package com.pdp.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/ping")
public class SecurityController {

    @GetMapping()
    public String ping() {
        return "pong";
    }
}

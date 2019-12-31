package com.alm.highfi.springsecurityauthserver.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @Value("${app.version}")
    private String appVersion;

    @GetMapping("/")
    public String getStatus() {
        return appVersion;
    }

    @GetMapping("/private")
    public String privateArea() {
        return "Private area";
    }
}

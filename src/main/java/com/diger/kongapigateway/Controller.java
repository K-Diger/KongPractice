package com.diger.kongapigateway;

import java.time.LocalDateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Controller {

    private static final Logger log = LoggerFactory.getLogger(Controller.class);

    @GetMapping
    public String getUsersMockTT() {
        System.out.println(LocalDateTime.now());
        log.info(LocalDateTime.now().toString());
        return "TEST!";
    }

    @GetMapping("/api/v1/users")
    public String getUsersMock() {
        System.out.println(LocalDateTime.now());
        log.info(LocalDateTime.now().toString());
        return "유저마이크로서비스 GET";
    }

    @GetMapping("/users")
    public String getUsers() {
        System.out.println(LocalDateTime.now());
        log.info(LocalDateTime.now().toString());
        return "유저마이크로서비스 GET";
    }

    @PostMapping("/users")
    public String postUsers() {
        return "유저마이크로서비스 POST";
    }

    @GetMapping("/products")
    public String getProducts() {
        return "상품마이크로서비스 GET";
    }

    @PostMapping("/products")
    public String postProducts() {
        return "상품마이크로서비스 POST";
    }
}

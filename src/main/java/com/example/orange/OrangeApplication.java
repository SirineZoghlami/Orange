package com.example.orange;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.TimeZone;

@EnableJpaRepositories("com.example.orange.repository")
@EntityScan("com.example.orange.entities")
@SpringBootApplication
@Slf4j
@CrossOrigin(origins = "*")
public class OrangeApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrangeApplication.class, args);
    }

    @PostConstruct
    public void init() {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC+1"));
    }

}































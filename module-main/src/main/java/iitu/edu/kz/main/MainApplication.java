package iitu.edu.kz.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "iitu.edu.kz.repository")
@ComponentScan(basePackages = {
        "iitu.edu.kz.controller",
        "iitu.edu.kz.service",
        "iitu.edu.kz.dto",
        "iitu.edu.kz.main",
        "iitu.edu.kz.repository"
})
@EntityScan(basePackages = "iitu.edu.kz.entity")
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
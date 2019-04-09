package dev.gustavodias.cooperforte;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class CooperforteApplication {

    public static void main(String[] args) {
        SpringApplication.run(CooperforteApplication.class, args);
        System.out.print(new BCryptPasswordEncoder().encode("12345"));
    }

}

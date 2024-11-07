package org.example.umcspringworkbook4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class UmcSpringWorkbook4Application {

    public static void main(String[] args) {
        SpringApplication.run(UmcSpringWorkbook4Application.class, args);
    }

}

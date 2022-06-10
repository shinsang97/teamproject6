package com.sparta.teamproject6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class TeamprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeamprojectApplication.class, args);
    }

}


//이거 잘 되는거 맞나???
package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
                        Student skyes = new Student("Skyes","skyes@gmail.com",LocalDate.of(2000, Month.AUGUST, 7));

                        Student sykes = new Student("Sykes","sykes@gmail.com",LocalDate.of(2002, Month.AUGUST, 7));

                        repository.saveAll(List.of(skyes, sykes));
        };
    }

}

package com.usa.ciclo4.reto1;

import com.usa.ciclo4.reto1.app.repositories.crud.CloneCrudRepository;
import com.usa.ciclo4.reto1.app.repositories.crud.UserCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = ("com.usa.ciclo4.reto1.app.model"))
@SpringBootApplication
public class Reto1Application {

    @Autowired
    private CloneCrudRepository cloneRepository;

    @Autowired
    private UserCrudRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(Reto1Application.class, args);
    }

    public void run(String... args) throws Exception {

        cloneRepository.deleteAll();
        userRepository.deleteAll();

    }

}

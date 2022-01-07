package com.freann.jpa.demo.clr;

import com.freann.jpa.demo.entity.User;
import com.freann.jpa.demo.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Jack", "Admin");
        userRepository.save(user);
        logger.info("new user created from repository using com.freann.jpa.demo.entity manager: " + user);

        Optional<User> userById = userRepository.findById(1L);
        logger.info("found user by ID: " + userById);

        List<User> allFoundUsers = userRepository.findAll();
        logger.info("found all users: " + allFoundUsers);
    }
}

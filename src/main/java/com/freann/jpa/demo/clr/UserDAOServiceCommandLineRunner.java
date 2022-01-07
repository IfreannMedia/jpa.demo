package com.freann.jpa.demo.clr;

import com.freann.jpa.demo.dao.UserDAOService;
import com.freann.jpa.demo.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class UserDAOServiceCommandLineRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(UserDAOServiceCommandLineRunner.class);

    @Autowired
    private UserDAOService userDAOService;

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Jack", "Admin");
        long insert = userDAOService.insert(user);
        logger.info("new user created using entity manager: " + user);
    }
}

package com.hansonwang99.servicec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceCContorller {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/servicec")
    public String servicec() {
        try {
            Thread.sleep( 3000 );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Now, we reach the terminal call: servicec !";
    }

    @GetMapping("/mysqltest")
    public String mysqlTest() {
        String name = jdbcTemplate.queryForObject( "SELECT name FROM user WHERE id = 1", String.class );
        return "Welcome " + name;
    }
}

package it.zetlark.springbootjsonlog;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class SpringBootJsonLogApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJsonLogApplication.class, args);

        log.info("Testing");
    }

}

package com.itheima.demoo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@Slf4j
@SpringBootApplication
@ServletComponentScan
public class DemooApplication {


    public static void main(String[] args) {

        SpringApplication.run(DemooApplication.class, args);
        log.info("success");
    }
}

package com.src.dudufei;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LoggerTest {

    //private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);
    //匹配     logger.info();
    @GetMapping(value = "/haha")
    public String haha(){
        String name = "asd";
        log.info("name:{}",name);
        log.error("hahahahahahahaahahahhahahahahahahaha");
        log.info("asdasdasasd");
        return "hahahahaha";
    }
}

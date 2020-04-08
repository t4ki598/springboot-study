package com.ldr;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot04LoggingApplicationTests {

    Logger logger = LoggerFactory.getLogger(getClass());
    @Test
    void contextLoads() {
        //日志的级别
        //由低到高：trace<debug<info<warn<error
        //可以调整日志的输出级别，日志就只会在这个级别的以后的高级别生效
        logger.trace("1.这是trace日志...");
        logger.debug("2.这是debug日志...");
        //springboot默认使用的info级别的
        logger.info("3.这是info日志...");
        logger.warn("4.这是warn日志...");
        logger.error("5.这是error日志...");
    }
}

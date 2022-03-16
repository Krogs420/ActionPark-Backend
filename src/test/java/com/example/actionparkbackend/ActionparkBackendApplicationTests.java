package com.example.actionparkbackend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ActionparkBackendApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void testIchi() {
        Assertions.assertEquals(2,1+1);
    }
}

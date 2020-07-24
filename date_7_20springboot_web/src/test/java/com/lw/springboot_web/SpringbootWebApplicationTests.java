package com.lw.springboot_web;

import com.lw.springboot_web.pojo.Department;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootWebApplicationTests {

    @Qualifier
    private Department department;

    @Test
    void contextLoads() {
    }

}

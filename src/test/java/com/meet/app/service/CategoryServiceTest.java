package com.meet.app.service;

import com.meet.app.dto.CategoryDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CategoryServiceTest {

    @Autowired
    private CategoryService service;

    @Test
    public void read(){

        CategoryDTO categoryDTO = service.categoryRead(1L);

        System.out.println("categoryDTO : " + categoryDTO);
    }

    @Test
    public void count(){

        service.categoryCount(1L);
    }

    @Test
    public void count2(){

        service.categoryCount(1L);
    }
}

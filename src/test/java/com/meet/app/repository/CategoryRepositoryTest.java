package com.meet.app.repository;

import com.meet.app.entity.Category;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
public class CategoryRepositoryTest {

    @Autowired
    private CategoryRepository repository;

    @Test
    public void register(){

        Category category = Category.builder()
                        .categoryName("자유주제")
                                .build();

        repository.save(category);
    }

    @Test
    public void read(){

        Optional<Category> byId = repository.findById(1L);

        System.out.println("1 : " + byId);
    }
}

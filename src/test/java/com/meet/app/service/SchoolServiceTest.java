package com.meet.app.service;

import com.meet.app.dto.SchoolDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class SchoolServiceTest {

    @Autowired
    private SchoolService service;

    @Test
    public void register(){

        SchoolDTO dto1 = SchoolDTO.builder()
                .name("건국대학교(글로컬캠퍼스)")
                .build();

        SchoolDTO dto2 = SchoolDTO.builder()
                .name("순천대학교(본교)")
                .build();
        service.register(dto1);
        service.register(dto2);
    }

    @Test
    public void read(){

        SchoolDTO read = service.read(1);

        System.out.println("read : " + read);
    }

    @Test
    public void getList(){

        List<SchoolDTO> lists = service.getList();

        int i=1;

        for(SchoolDTO list : lists){

            System.out.println(i++ + " : " + list);
        }
    }

}

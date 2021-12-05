package com.meet.app.service;

import com.meet.app.dto.MemberDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.stream.IntStream;

@SpringBootTest
public class MemberServiceTest {

    @Autowired
    private MemberService service;

    @Test
    public void register(){

        IntStream.rangeClosed(1,3).forEach(i -> {

            MemberDTO memberDTO = MemberDTO.builder()
                    .memberID("User" + i)
                    .nickname("다희짱!!.." + i)
                    .department("시각영상디자인학과")
                    .stuNum("2017430" + i)
                    .password("1234")
                    .name("정다희" + i)
                    .isMen(false)
                    .birth("98010" + i)
                    .schoolID(1)
                    .build();

            service.register(memberDTO);
        });

    }

    @Test
    public void getList(){

        List<MemberDTO> list = service.getList();

        list.forEach(memberDTO -> {
            System.out.println("memberDTO : " + memberDTO);
        });
    }
}

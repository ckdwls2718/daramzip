package com.meet.app.service;

import com.meet.app.dto.RoomInfoDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.IntStream;

@SpringBootTest
public class RoomInfoServiceTest {

    @Autowired
    private RoomInfoService service;

    @Test
    public void register(){

        IntStream.rangeClosed(1,10).forEach(i -> {
            LocalDate localDate = LocalDate.of(2021,12,i);

            RoomInfoDTO roomInfoDTO = RoomInfoDTO.builder()
                    .title("사진 찰칵" + i)
                    .periodic(true)
                    .endDate(localDate)
                    .maxPeople(4)
                    .place("순천")
                    .categoryID(1L)
                    .memberID("User2")
                    .build();

            service.roomRegister(roomInfoDTO);
        });
    }

    @Test
    public void getList(){

        List<RoomInfoDTO> dtoList = service.roomList("User1");

        dtoList.forEach(dto -> {

            System.out.println("RoomInfoDTO : " + dto);
        });

    }

    @Test
    public void getRead(){

        RoomInfoDTO room_infoDTO = service.roomRead(1L);

        System.out.println("room : " + room_infoDTO);
    }

//    @Test
//    public void inRoom(){
//
//        boolean user2 = service.inRoom(2L, "User2");
//
//        System.out.println(user2);
//    }

//    @Test
//    public void getListByMember(){
//
//        List<RoomInfoDTO> roomInfoDTOS = service.myNowRoomList("User2");
//
//        for(RoomInfoDTO roomInfoDTO : roomInfoDTOS){
//
//            System.out.println("roomInfoDTO : " + roomInfoDTO);
//        }
//    }

    @Test
    public void delete(){

        service.deleteRoom(21L);
    }

    @Test
    public void hotRoomTest(){

        List<RoomInfoDTO> roomInfoDTOS = service.hotRoomList("User1");

        roomInfoDTOS.forEach(result ->{

            System.out.println("dto : " + result);
        });
    }
}

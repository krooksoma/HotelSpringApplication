package com.defaria.springapp1.controllers;

import com.defaria.springapp1.data.RoomRepository;
import com.defaria.springapp1.models.Room;
import com.defaria.springapp1.services.RoomService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/rooms")
public class RoomsController {
    private final RoomService roomService;

    public RoomsController(RoomService roomService) {
        this.roomService = roomService;
    }

    //     private static final List<Room> rooms = new ArrayList<>();
//
//    static{
//        for(int i = 0; i < 10; i++){
//            rooms.add(new Room(i, "room name" +i, "type" + i, "Q"));
//        }
//    }

    @GetMapping
    public String getAllRoom(Model model){
        model.addAttribute("rooms", roomService.getAllRooms());
        return "rooms";
    }
}

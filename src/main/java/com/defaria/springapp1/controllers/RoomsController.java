package com.defaria.springapp1.controllers;

import com.defaria.springapp1.models.Room;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/rooms")
public class RoomsController {
    private static final List<Room> rooms = new ArrayList<>();

    static{
        for(int i = 0; i < 10; i++){
            rooms.add(new Room(i, "room name" +i, "type" + i, "Q"));
        }
    }

    @GetMapping
    public String getAllRoom(Model model){
        model.addAttribute("rooms", rooms);
        return "rooms";
    }
}

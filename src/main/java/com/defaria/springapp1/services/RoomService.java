package com.defaria.springapp1.services;

import com.defaria.springapp1.data.RoomRepository;
import com.defaria.springapp1.models.Room;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomService {
    private final RoomRepository roomRepository;
//injecting via Constructor
    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }


    //    private final List<Room> rooms = new ArrayList<>();
//    static{
//        for(int i=0;i<10;i++){
//            rooms.add(new Room(i, "Room " + i, "R"+i, "Q"));
//        }
//    }
//returns a json file
    public List<Room> getAllRooms(){

        return roomRepository.findAll();
    }
}

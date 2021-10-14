package com.defaria.springapp1.data;

import com.defaria.springapp1.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}

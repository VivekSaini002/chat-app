package com.chatApp.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.chatApp.entities.Room;

public interface RoomRepository extends MongoRepository<Room, String> {
	
	Room findByRoomId(String roomId);

}

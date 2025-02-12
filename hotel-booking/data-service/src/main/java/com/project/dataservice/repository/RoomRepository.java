package com.project.dataservice.repository;

import com.project.dataservice.entity.Hotel;
import com.project.dataservice.entity.Room;
import com.project.dataservice.entity.RoomType;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {

    boolean existsByHotelAndTypeAndCountAndMaxPerson(Hotel hotel, RoomType type, int count, int maxPerson);

    List<Room> findByHotelId(Long HotelId);

    @Modifying
    @Transactional
    @Query("UPDATE Room r SET r.price = :price WHERE r.id = :roomId")
    int updateRoomPrice(Long roomId, BigDecimal price);

    @Modifying
    @Transactional
    @Query("DELETE FROM Room r WHERE r.id = :roomId")
    int deleteRoomById(Long roomId);
}
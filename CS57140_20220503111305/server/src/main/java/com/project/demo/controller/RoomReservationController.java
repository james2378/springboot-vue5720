package com.project.demo.controller;

import com.project.demo.entity.RoomReservation;
import com.project.demo.service.RoomReservationService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 *房间预定：(RoomReservation)表控制层
 *
 */
@RestController
@RequestMapping("/room_reservation")
public class RoomReservationController extends BaseController<RoomReservation,RoomReservationService> {

    /**
     *房间预定对象
     */
    @Autowired
    public RoomReservationController(RoomReservationService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        String sql = "SELECT MAX(room_reservation_id) AS max FROM "+"room_reservation";
        Query select = service.runCountSql(sql);
        Integer max = (Integer) select.getSingleResult();
        sql = ("SELECT count(*) count FROM `hotel_reservation` INNER JOIN `room_reservation` ON hotel_reservation.hotel_name=room_reservation.hotel_name WHERE hotel_reservation.number_of_rooms &#60; room_reservation.scheduled_quantity AND room_reservation.room_reservation_id="+max).replaceAll("&#60;","<");
        select = service.runCountSql(sql);
        Integer count = Integer.valueOf(String.valueOf(select.getSingleResult()));
        if(count>0){
            sql = "delete from "+"room_reservation"+" WHERE "+"room_reservation_id"+" ="+max;
            select = service.runCountSql(sql);
            select.executeUpdate();
            return error(30000,"房间不足!");
        }
        sql = "UPDATE `hotel_reservation` INNER JOIN `room_reservation` ON hotel_reservation.hotel_name=room_reservation.hotel_name SET hotel_reservation.number_of_rooms = hotel_reservation.number_of_rooms - room_reservation.scheduled_quantity WHERE room_reservation.room_reservation_id="+max;
        select = service.runCountSql(sql);
        select.executeUpdate();
        return success(1);
    }

}

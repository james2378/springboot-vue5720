package com.project.demo.controller;

import com.project.demo.entity.RoomCancellation;
import com.project.demo.service.RoomCancellationService;
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
 *房间取消：(RoomCancellation)表控制层
 *
 */
@RestController
@RequestMapping("/room_cancellation")
public class RoomCancellationController extends BaseController<RoomCancellation,RoomCancellationService> {

    /**
     *房间取消对象
     */
    @Autowired
    public RoomCancellationController(RoomCancellationService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        String sql = "SELECT MAX(room_cancellation_id) AS max FROM "+"room_cancellation";
        Query select = service.runCountSql(sql);
        Integer max = (Integer) select.getSingleResult();
        sql = "UPDATE `hotel_reservation` INNER JOIN `room_cancellation` ON hotel_reservation.hotel_name=room_cancellation.hotel_name SET hotel_reservation.number_of_rooms = hotel_reservation.number_of_rooms + room_cancellation.scheduled_quantity WHERE room_cancellation.room_cancellation_id="+max;
        select = service.runCountSql(sql);
        select.executeUpdate();
        return success(1);
    }

}

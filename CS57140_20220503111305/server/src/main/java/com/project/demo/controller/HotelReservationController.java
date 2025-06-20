package com.project.demo.controller;

import com.project.demo.entity.HotelReservation;
import com.project.demo.service.HotelReservationService;
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
 *酒店预定：(HotelReservation)表控制层
 *
 */
@RestController
@RequestMapping("/hotel_reservation")
public class HotelReservationController extends BaseController<HotelReservation,HotelReservationService> {

    /**
     *酒店预定对象
     */
    @Autowired
    public HotelReservationController(HotelReservationService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        Map<String, String> maphotel_name = new HashMap<>();
        maphotel_name.put("hotel_name",String.valueOf(paramMap.get("hotel_name")));
        List listhotel_name = service.select(maphotel_name, new HashMap<>()).getResultList();
        if (listhotel_name.size()>0){
            return error(30000, "字段酒店名称内容不能重复");
        }
        this.addMap(paramMap);
        return success(1);
    }

}

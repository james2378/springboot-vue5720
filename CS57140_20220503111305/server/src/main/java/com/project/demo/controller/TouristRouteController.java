package com.project.demo.controller;

import com.project.demo.entity.TouristRoute;
import com.project.demo.service.TouristRouteService;
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
 *旅游路线：(TouristRoute)表控制层
 *
 */
@RestController
@RequestMapping("/tourist_route")
public class TouristRouteController extends BaseController<TouristRoute,TouristRouteService> {

    /**
     *旅游路线对象
     */
    @Autowired
    public TouristRouteController(TouristRouteService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        return success(1);
    }

}

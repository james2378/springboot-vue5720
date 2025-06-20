package com.project.demo.controller;

import com.project.demo.entity.ScenicSpotTicketPurchase;
import com.project.demo.service.ScenicSpotTicketPurchaseService;
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
 *景点购票：(ScenicSpotTicketPurchase)表控制层
 *
 */
@RestController
@RequestMapping("/scenic_spot_ticket_purchase")
public class ScenicSpotTicketPurchaseController extends BaseController<ScenicSpotTicketPurchase,ScenicSpotTicketPurchaseService> {

    /**
     *景点购票对象
     */
    @Autowired
    public ScenicSpotTicketPurchaseController(ScenicSpotTicketPurchaseService service) {
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

package com.project.demo.controller;

import com.project.demo.entity.TicketInformation;
import com.project.demo.service.TicketInformationService;
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
 *购票信息：(TicketInformation)表控制层
 *
 */
@RestController
@RequestMapping("/ticket_information")
public class TicketInformationController extends BaseController<TicketInformation,TicketInformationService> {

    /**
     *购票信息对象
     */
    @Autowired
    public TicketInformationController(TicketInformationService service) {
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

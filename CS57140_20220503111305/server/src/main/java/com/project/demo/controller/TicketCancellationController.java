package com.project.demo.controller;

import com.project.demo.entity.TicketCancellation;
import com.project.demo.service.TicketCancellationService;
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
 *购票取消：(TicketCancellation)表控制层
 *
 */
@RestController
@RequestMapping("/ticket_cancellation")
public class TicketCancellationController extends BaseController<TicketCancellation,TicketCancellationService> {

    /**
     *购票取消对象
     */
    @Autowired
    public TicketCancellationController(TicketCancellationService service) {
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

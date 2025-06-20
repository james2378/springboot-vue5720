package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *验票信息：(TicketCheckInformation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "TicketCheckInformation")
public class TicketCheckInformation implements Serializable {

    //TicketCheckInformation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticket_check_information_id")
    private Integer ticket_check_information_id;
    // 景点名称
    @Basic
    private String name_of_scenic_spot;
    // 景点类型
    @Basic
    private String scenic_spot_type;
    // 景点地址
    @Basic
    private String scenic_spot_address;
    // 工作人员
    @Basic
    private Integer working_personnel;
    // 购票用户
    @Basic
    private Integer ticket_user;
    // 用户姓名
    @Basic
    private String user_name;
    // 用户电话
    @Basic
    private String subscriber_telephone;
    // 健康码
    @Basic
    private String health_code;
    // 行程码
    @Basic
    private String travel_code;
    // 验票时间
    @Basic
    private Timestamp ticket_checking_time;
    // 审核状态
    @Basic
    private String examine_state;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}

package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *购票信息：(TicketInformation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "TicketInformation")
public class TicketInformation implements Serializable {

    //TicketInformation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticket_information_id")
    private Integer ticket_information_id;
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
    // 门票价格
    @Basic
    private String ticket_price;
    // 开放时间
    @Basic
    private String opening_hours;
    // 景点图片
    @Basic
    private String scenic_spot_pictures;
    // 购票用户
    @Basic
    private Integer ticket_user;
    // 用户姓名
    @Basic
    private String user_name;
    // 用户电话
    @Basic
    private String subscriber_telephone;
    // 购票数量
    @Basic
    private Integer ticket_quantity;
    // 支付金额
    @Basic
    private String payment_amount;
    // 支付状态
    @Basic
    private String pay_state;

    // 支付类型: 微信、支付宝、网银
    @Basic
    private String pay_type;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}

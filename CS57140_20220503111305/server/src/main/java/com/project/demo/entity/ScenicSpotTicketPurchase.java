package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *景点购票：(ScenicSpotTicketPurchase)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "ScenicSpotTicketPurchase")
public class ScenicSpotTicketPurchase implements Serializable {

    //ScenicSpotTicketPurchase编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "scenic_spot_ticket_purchase_id")
    private Integer scenic_spot_ticket_purchase_id;
    // 景点名称
    @Basic
    private String name_of_scenic_spot;
    // 景点类型
    @Basic
    private String scenic_spot_type;
    // 景点地址
    @Basic
    private String scenic_spot_address;
    // 门票价格
    @Basic
    private Integer ticket_price;
    // 工作人员
    @Basic
    private Integer working_personnel;
    // 开放时间
    @Basic
    private String opening_hours;
    // 景点图片
    @Basic
    private String scenic_spot_pictures;
    // 购票须知
    @Basic
    private String ticket_purchase_instructions;
    // 景点介绍
    @Basic
    private String introduction_to_scenic_spots;
    // 点击数
    @Basic
    private Integer hits;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}

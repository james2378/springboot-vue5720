package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *旅游路线：(TouristRoute)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "TouristRoute")
public class TouristRoute implements Serializable {

    //TouristRoute编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tourist_route_id")
    private Integer tourist_route_id;
    // 路线名称
    @Basic
    private String route_name;
    // 路线类型
    @Basic
    private String route_type;
    // 路线起点
    @Basic
    private String route_starting_point;
    // 路线终点
    @Basic
    private String route_end;
    // 封面图
    @Basic
    private String cover_picture;
    // 申请人
    @Basic
    private Integer applicant;
    // 路线详情
    @Basic
    private String route_details;
    // 点击数
    @Basic
    private Integer hits;
    // 点赞数
    @Basic
    private Integer praise_len;
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

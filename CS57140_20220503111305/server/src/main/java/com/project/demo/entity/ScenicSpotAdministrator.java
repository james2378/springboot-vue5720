package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *景点管理员：(ScenicSpotAdministrator)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "ScenicSpotAdministrator")
public class ScenicSpotAdministrator implements Serializable {

    //ScenicSpotAdministrator编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "scenic_spot_administrator_id")
    private Integer scenic_spot_administrator_id;
    // 景点名称
    @Basic
    private String name_of_scenic_spot;
    // 景点地址
    @Basic
    private String scenic_spot_address;
    // 申请人
    @Basic
    private String applicant;
    // 相关证件
    @Basic
    private String relevant_certificates;
    // 审核状态
    @Basic
    private String examine_state;
    // 用户编号
    @Id
    @Column(name = "user_id")
    private Integer userId;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}

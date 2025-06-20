package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *酒店预定：(HotelReservation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "HotelReservation")
public class HotelReservation implements Serializable {

    //HotelReservation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hotel_reservation_id")
    private Integer hotel_reservation_id;
    // 酒店名称
    @Basic
    private String hotel_name;
    // 酒店地址
    @Basic
    private String hotel_address;
    // 联系电话
    @Basic
    private String contact_number;
    // 房间类型
    @Basic
    private String room_type;
    // 床位类型
    @Basic
    private String bed_type;
    // 房间数量
    @Basic
    private Integer number_of_rooms;
    // 房间价格
    @Basic
    private Integer room_price;
    // 房间图片
    @Basic
    private String room_picture;
    // 房间详情
    @Basic
    private String room_details;
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

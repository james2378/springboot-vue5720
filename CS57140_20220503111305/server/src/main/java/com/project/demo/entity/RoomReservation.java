package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *房间预定：(RoomReservation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "RoomReservation")
public class RoomReservation implements Serializable {

    //RoomReservation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_reservation_id")
    private Integer room_reservation_id;
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
    private String number_of_rooms;
    // 房间价格
    @Basic
    private String room_price;
    // 房间图片
    @Basic
    private String room_picture;
    // 预定用户
    @Basic
    private Integer scheduled_user;
    // 用户姓名
    @Basic
    private String user_name;
    // 用户电话
    @Basic
    private String subscriber_telephone;
    // 预定数量
    @Basic
    private Integer scheduled_quantity;
    // 支付金额
    @Basic
    private String payment_amount;
    // 预定时间
    @Basic
    private Timestamp scheduled_time;
    // 入住状态
    @Basic
    private String check_in_status;
    // 预定备注
    @Basic
    private String reservation_remarks;
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

package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *房间取消：(RoomCancellation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "RoomCancellation")
public class RoomCancellation implements Serializable {

    //RoomCancellation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_cancellation_id")
    private Integer room_cancellation_id;
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
    private String scheduled_quantity;
    // 支付金额
    @Basic
    private String payment_amount;
    // 预定时间
    @Basic
    private Timestamp scheduled_time;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}

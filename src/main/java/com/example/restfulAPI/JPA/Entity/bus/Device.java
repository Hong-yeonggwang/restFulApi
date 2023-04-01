package com.example.restfulAPI.JPA.Entity.bus;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "DEVICE")
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="DEVICESEQ")
    private Long deviceSeq;

    @Column(name = "DEVICEHASHKEY")
    private String deviceHashKey;

    @Column(name = "DEVICENAME")
    private String deviceName;

    @CreatedDate
    @Column(name = "UPDATETIME")
    private Timestamp updateTime;

}

package com.example.restfulAPI.JPA.Entity.bus;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "BUSTYPE")
public class BusType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BUSTYPESEQ")
    private Long busTypeSeq;

    @Column(name = "BUSTYPE")
    private String busType;

    @Column(name = "BUSTYPESTATE")
    private String busTypeState;
}

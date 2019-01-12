package com.swlodyga.JavaTemp.model;


import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;


//--------Klasa Temperatures jest odwzorowaniem tabeli użytkownicy w bazie-------

@Entity
@Table(name = "temperatures")
public class Temperatures {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @PrePersist
    void preInsert() {
        if (this.date == null)
            this.date = new Date();
    }
    private Date date;
    @Column(nullable = false)
    private int temp;
    @Column(name = "deviceId", nullable = false)
    private int deviceId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }
}

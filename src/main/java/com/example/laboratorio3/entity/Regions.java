package com.example.laboratorio3.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name="regions")
public class Regions {
    @Id
    @Column(name = "region_id")
    private BigDecimal regionid;
    private String region_name;

    public BigDecimal getRegionid() {
        return regionid;
    }

    public void setRegionid(BigDecimal regionid) {
        this.regionid = regionid;
    }

    public String getRegion_name() {
        return region_name;
    }

    public void setRegion_name(String region_name) {
        this.region_name = region_name;
    }
}

package com.example.laboratorio3.repository;

import com.example.laboratorio3.entity.Regions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
@Repository
public interface RegionsRepository extends JpaRepository<Regions, BigDecimal> {
}

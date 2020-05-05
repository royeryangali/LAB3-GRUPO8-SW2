package com.example.laboratorio3.repository;

import com.example.laboratorio3.entity.Countries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountriesRepository extends JpaRepository<Countries, String> {
}

package com.example.laboratorio3.repository;

import com.example.laboratorio3.entity.Job_history;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Job_historyRepository extends JpaRepository<Job_history, Integer> {
}

package com.example.schedule.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.schedule.entity.ScheduleEntity;

public interface ScheduleRepository extends JpaRepository<ScheduleEntity, Long> {
    // 기본 CRUD 메소드 제공
}

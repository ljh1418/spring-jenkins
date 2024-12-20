package com.example.schedule.service;

import java.time.LocalDateTime;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.schedule.entity.ScheduleEntity;
import com.example.schedule.repository.ScheduleRepository;

@Service
public class ScheduleService {
	private final ScheduleRepository scheduleRepository;

    @Autowired
    public ScheduleService(ScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;
    }

    @Transactional
    public ScheduleEntity createSchedule(ScheduleEntity scheduleEntity) {

        System.out.println("Received scheduleEntity: " +  scheduleEntity);
        
        
    	
        // 현재 날짜와 시간을 생성 시각으로 설정
        if (scheduleEntity.getCreatedAt() == null) {
        	scheduleEntity.setCreatedAt(LocalDateTime.now());
        }
        
        if (scheduleEntity.getUpdatedAt() == null) {
        	scheduleEntity.setUpdatedAt(LocalDateTime.now());
        }
        
        //시작날짜
        if (scheduleEntity.getStartDate()== null) {
        	scheduleEntity.setStartDate(LocalDateTime.now());
        }
        
        //종료날짜
        if (scheduleEntity.getEndDate()== null) {
        	scheduleEntity.setEndDate(LocalDateTime.now());
        }
        
        
        scheduleEntity.setStatus("A");
        scheduleEntity.setDescription("test1");
        scheduleEntity.setIsRecurring(false);
        
        System.out.println("Received scheduleEntity:425313123 " +  scheduleEntity);
        
        return scheduleRepository.save(scheduleEntity);
    }
}

package com.example.schedule.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.schedule.entity.ScheduleEntity;
import com.example.schedule.service.ScheduleService;

@RestController
@RequestMapping("/api/schedules")
public class ScheduleController {
	
	private final ScheduleService scheduleService;
	
	@Autowired
    public ScheduleController(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }
	 
	 
    // 스케줄 등록 API
    @PostMapping
    public ResponseEntity<ScheduleEntity> createSchedule(@RequestBody ScheduleEntity scheduleEntity) {
    	
        
        // 서비스 계층을 통해 스케줄 저장
        ScheduleEntity savedSchedule = scheduleService.createSchedule(scheduleEntity);
        System.out.println("실패ㅗ한다..." + savedSchedule);

        // 응답으로 저장된 스케줄 반환
        return new ResponseEntity<>(savedSchedule, HttpStatus.CREATED);
    }	 
	
}

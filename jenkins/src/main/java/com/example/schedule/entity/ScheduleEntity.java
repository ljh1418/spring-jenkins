package com.example.schedule.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TB_SCHEDULE")  // 테이블 이름을 지정 (대소문자 구분이 있을 수 있으므로, 실제 테이블 이름과 일치)
public class ScheduleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT에 해당
    private Long id;

    @Column(nullable = false)
    private String title;  // 일정 제목

    private String description;  // 일정 설명

    @Column(name = "start_date", nullable = false)
    private LocalDateTime startDate;  // 일정 시작 시간
    
    @Column(name = "end_date", nullable = false)
    private LocalDateTime endDate;  // 일정 종료 시간

    @Column(name = "status", nullable = false)
    private String status;  // 일정 상태 (예: 진행중, 완료, 취소 등)

//    private Long userId;  // 사용자 ID (후에 외래 키 설정 예정)

    @Column(name = "is_recurring", columnDefinition = "BOOLEAN DEFAULT FALSE")
    private Boolean isRecurring;  // 반복 일정 여부

//    @ManyToOne(fetch = FetchType.LAZY)  // 부모 일정 (자기 참조 관계)
//    @JoinColumn(name = "parent_schedule_id")
//    private ScheduleEntity parentSchedule;  // 반복 일정의 부모 일정

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;  // 생성 일시

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;  // 수정 일시
    


	@Override
	public String toString() {
	    return "ScheduleEntity{" +
	           "id=" + id +
	           ", title='" + title + '\'' +
	           ", description='" + description + '\'' +
	           ", startDate=" + startDate +
	           ", endDate=" + endDate +
	           ", status='" + status + '\'' +
//	           ", userId=" + userId +
	           ", isRecurring=" + isRecurring +
//	           ", parentSchedule=" + (parentSchedule != null ? parentSchedule.getId() : null) +  // 부모 일정의 ID를 출력
	           ", createdAt=" + createdAt +
	           ", updatedAt=" + updatedAt +
	           '}';
	}
    
}
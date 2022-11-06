package com.carrerit.iplstats.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.jpa.repository.Modifying;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Data
public abstract class AuditorLog {
    @CreatedBy
    @Column(name = "created_by",nullable = false,updatable = false)
    protected String createdBy;
    @LastModifiedBy
    @Column(name="modified_by")
    protected String modifiedBy;
    @CreatedDate
    @Column(name="created_at",nullable = false,updatable = false)
    protected LocalDateTime createdAt;
    @LastModifiedDate
    @Column(name="modified_at")
    protected LocalDateTime modifiedAt;

}

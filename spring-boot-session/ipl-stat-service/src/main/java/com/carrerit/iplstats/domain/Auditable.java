package com.carrerit.iplstats.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
public abstract class Auditable {

  @CreatedBy
  @Column(name = "created_by", nullable = false, updatable = false)
  protected String createdBy;
  @LastModifiedBy
  @Column(name = "modified_by")
  protected String modifiedBy;
  @CreatedDate
  @Column(name = "created_date", nullable = false, updatable = false)
  protected LocalDateTime createdDate;
  @LastModifiedDate
  @Column(name = "modified_date")
  protected LocalDateTime modifiedDate;


}

package com.carrerit.iplstats.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AuditorLogDto {
  protected String createdBy;
  protected String modifiedBy;
  protected LocalDateTime createdAt;
  protected LocalDateTime modifiedAt;
}

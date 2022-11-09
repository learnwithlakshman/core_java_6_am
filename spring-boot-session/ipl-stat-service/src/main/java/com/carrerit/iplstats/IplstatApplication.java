package com.carrerit.iplstats;

import com.carrerit.iplstats.domain.Player;
import com.carrerit.iplstats.repo.PlayerRepo;
import com.carrerit.iplstats.service.EmailService;
import com.carrerit.iplstats.service.PlayerService;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

@SpringBootApplication
@Slf4j
public class IplstatApplication implements CommandLineRunner {

  @Value("${app.message}")
  private String message;
  @Autowired
  private PlayerRepo playerRepo;

  public static void main(String[] args) {
    SpringApplication.run(IplstatApplication.class, args);
  }

  @Override
  public void run(String... args) {

  }




}

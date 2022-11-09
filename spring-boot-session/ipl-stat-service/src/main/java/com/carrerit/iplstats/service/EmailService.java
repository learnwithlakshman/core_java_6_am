package com.carrerit.iplstats.service;

import java.io.File;

public interface EmailService {

      void sendEmail(String to,String subject,String body);
      void sendEmail(String to, String subject, String body, String filePath);
}

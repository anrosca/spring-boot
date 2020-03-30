package com.endava.weather.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ReportGeneratedEventListener {

    @EventListener(ReportGeneratedEvent.class)
    public void onReportGenerated(ReportGeneratedEvent event) {
      log.info("Generated report: {}", event.getReport().getFileName());
      log.info("**********************************************************");
    }
}

package com.endava.weather.service;

import com.endava.weather.report.Report;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEvent;

@RequiredArgsConstructor
@Getter
public class ReportGeneratedEvent{
    private final Report report;
}

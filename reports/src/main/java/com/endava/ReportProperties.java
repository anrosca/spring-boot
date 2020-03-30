package com.endava;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Min;

@ConfigurationProperties("report")
//@Component
@Data
@Validated
public class ReportProperties {

    /**
    * Enable AOP logging (true or false)
    */
    private boolean aopLoggingEnabled;

    /**
    * List reports younger than this months, numeric, greater than 2
    */
    @Min(2)
    private Integer listReportsYoungerThanThisMonths;
}

package aspect;

import lombok.RequiredArgsConstructor;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Aspect
//@Profile("aop-logging")
@RequiredArgsConstructor
//@ConditionalOnProperty(name = "report.aop-logging-enabled", havingValue = "true")
//@ConditionalOnRandom
public class ExecutionTimeLoggingAspect {


//    private final ReportProperties reportProperties;

//    @Setter
//    @Getter
//    private volatile boolean enabled;

    @Around("execution(* com.endava.weather.service.ReportGenerationService.generateReportFor(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        if (true) {
            System.out.println("Starting generating report: " + LocalDateTime.now());
            try {
                Object report =  joinPoint.proceed();
                System.out.println("Report was generated: " + LocalDateTime.now());
//                System.out.println("Successfully generated report: " + report.getFileName());
                return report;
            } catch (Throwable e) {
                System.out.println("Exception thrown: " + e);
                return null;
            }
        } else {
            return joinPoint.proceed();
        }
    }
}

package com.endava.weather.actuator;//package com.endava.weather.actuator;
//
//import com.endava.weather.aspect.ExecutionTimeLoggingAspect;
//import lombok.RequiredArgsConstructor;
//import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
//import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
//import org.springframework.boot.actuate.endpoint.annotation.Selector;
//import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
//import org.springframework.stereotype.Component;
//
//@Component
//@Endpoint(id = "aop-logging")
//@RequiredArgsConstructor
//public class AopLoggingEndpoint {
//
//    private final ExecutionTimeLoggingAspect loggingAspect;
//
//    @ReadOperation
//    public boolean isEnabled() {
//        return loggingAspect.isEnabled();
//    }
//
//    @WriteOperation
//    public void setStatus(@Selector boolean enabled) {
//        loggingAspect.setEnabled(enabled);
//    }
//}

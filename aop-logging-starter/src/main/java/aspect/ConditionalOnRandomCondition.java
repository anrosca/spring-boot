package aspect;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.concurrent.ThreadLocalRandom;

@Slf4j
public class ConditionalOnRandomCondition implements Condition {

    private static final boolean random = ThreadLocalRandom.current().nextBoolean();

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        log.info("Evaluating ConditionalOnRandomCondition: {}", random);
        return random;
    }
}

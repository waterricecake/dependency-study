package org.example.dependencystudy.a;

import lombok.RequiredArgsConstructor;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@RequiredArgsConstructor
public class AAspect {

    private final ARepository aRepository;

    @Around("@annotation(org.example.dependencystudy.b.AspectAnnotation)")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        Object[] args = joinPoint.getArgs();
        Long id = (Long) args[0];
        String val  = (String) args[1];
        A a = aRepository.findByBId(id).get();
        a.setVal(val);
        aRepository.save(a);
        joinPoint.proceed();
    }
}

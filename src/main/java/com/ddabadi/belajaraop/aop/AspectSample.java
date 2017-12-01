package com.ddabadi.belajaraop.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: deddy
 * Date: 12/1/17
 * Time: 8:58 PM
 * To change this template use File | Settings | File Templates.
 */

@Aspect
public class AspectSample {

    @Pointcut("within(com.ddabadi.belajaraop.trans.BarangService) ")
    public void appPoincut(){

    }

    @Pointcut("within(com.ddabadi.belajaraop.trans.BarangService) || within(com.ddabadi.belajaraop.Resource.*) ")
    public void appPoincutBarangServiceAndResource(){

    }

    @Pointcut("within(@org.springframework.web.bind.annotation.RestController *)")
    public void springRestPoincut(){

    }

    @Around("appPoincut() || springRestPoincut() ")
    public Object aspectAdvice(ProceedingJoinPoint proceedingJoinPoint){
        Object hasil = null;
        try {
            hasil = proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return hasil;
    }

    @Before("@annotation(com.ddabadi.belajaraop.aop.LoggInfo)")
    public void logInfoBefore(){
        System.out.println("AOP by LoggInfo");
    }



}

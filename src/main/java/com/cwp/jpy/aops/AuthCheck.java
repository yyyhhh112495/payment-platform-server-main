package com.cwp.jpy.aops;
import org.apache.ibatis.reflection.ArrayUtil;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class AuthCheck {

    private static final Logger log = LoggerFactory.getLogger(AuthCheck.class);
    @Before("@annotation(AuthCheck)")
    public void authbefore(com.cwp.jpy.annos.AuthCheck AuthCheck){
        String name = AuthCheck.value();
        log.info("---get in method {} ",name);
    }

    @Around("@annotation(AuthCheck)")
    public Object authAround (ProceedingJoinPoint proceedingJoinPoint, com.cwp.jpy.annos.AuthCheck AuthCheck){
        String name = AuthCheck.value();
        long start = System.currentTimeMillis();
        Object [] args = proceedingJoinPoint.getArgs();

        log.info("-------jsoninPoint---args:{},---args.size----{}", ArrayUtil.toString(args),args.length);
        Object ret = null;
        try {
            ret =  proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        } finally {
            long end = System.currentTimeMillis();
            log.info("method-----"+name+" cost seconds are: "+(end-start)/1000);
        }
        return ret;
    }
}

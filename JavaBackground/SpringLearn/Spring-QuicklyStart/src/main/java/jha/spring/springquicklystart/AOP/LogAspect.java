package jha.spring.springquicklystart.AOP;

import com.alibaba.fastjson2.JSON;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jha.spring.springquicklystart.pojo.Logs;
import jha.spring.springquicklystart.service.LogServerInterface;
import jha.spring.springquicklystart.utils.JWTUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Map;

@Component
@Aspect
public class LogAspect {
    @Autowired
    public HttpServletRequest httpRequest;
    @Autowired
    public LogServerInterface logServer;

    @Around("@annotation(jha.spring.springquicklystart.anno.MyLog)")
    public Object Log(ProceedingJoinPoint joinPoint) throws Throwable {
        //获取信息
        String token = httpRequest.getHeader("token");
        Map<String, ?> stringMap = JWTUtils.DecodeJWT(token);
        String username = stringMap.get("user").toString();//获取操作人员，登录的操作人

        LocalDateTime now = LocalDateTime.now(); //获取操作时间

        String className = joinPoint.getTarget().getClass().getName();//获取类名

        String methodName = joinPoint.getSignature().getName();//获取方法名

        Object[] args = joinPoint.getArgs();
        String param = Arrays.toString(args);       //获取方法参数
        long begin = System.currentTimeMillis();

        Object proceed = joinPoint.proceed();
        long end = System.currentTimeMillis();
        String ref = JSON.toJSONString(proceed);//获取返回值
        long time = end - begin;//获取执行耗时

        Logs logs = new Logs(null, username, now, className, methodName, param, ref, time);

        logServer.InsertLog(logs);//插入日志

        return proceed;

    }
}

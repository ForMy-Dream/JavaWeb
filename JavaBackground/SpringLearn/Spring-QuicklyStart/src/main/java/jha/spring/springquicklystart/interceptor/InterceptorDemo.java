package jha.spring.springquicklystart.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
@Component
public class InterceptorDemo implements HandlerInterceptor {
    /*
    目标资源方法执行前执行，即Control方法执行前调用，返回true就放行，反之不放行
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("在Control之前方法：perHandlerInterceptor");
        return true;//放行
    }
    /*
    目标资源方法执行后执行，即Control方法执行完成后执行
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("在Control执行完之后方法：postHandleInterceptor");
    }
    /*
    视图渲染完毕后执行，最后执行
    */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("在视图渲染完之后方法：afterCompletionInterceptor");
    }
}

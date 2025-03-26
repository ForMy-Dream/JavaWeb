package jha.spring.springquicklystart.interceptor;

import com.alibaba.fastjson2.JSON;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import jha.spring.springquicklystart.pojo.Request;
import jha.spring.springquicklystart.utils.JWTUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
@Component
public class AuthInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String token = request.getHeader("token");
        if(token==null) {
            Request unauthorized = Request.err("Unauthorized");
            String msg = JSON.toJSONString(unauthorized);
            response.getWriter().write(msg);
            response.getWriter().flush();
            response.getWriter().close();
            return false;
        }
        else {
            try {
                JWTUtils.DecodeJWT(token);
            } catch (Exception e) {
                Request unauthorized = Request.err("Unauthorized");
                String msg = JSON.toJSONString(unauthorized);
                response.getWriter().write(msg);
                response.getWriter().flush();
                response.getWriter().close();
                return false;
            }

        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}

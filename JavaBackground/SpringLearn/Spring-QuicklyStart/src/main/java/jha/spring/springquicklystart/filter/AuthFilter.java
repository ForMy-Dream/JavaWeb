package jha.spring.springquicklystart.filter;

import com.alibaba.fastjson2.JSON;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jha.spring.springquicklystart.pojo.Request;
import jha.spring.springquicklystart.utils.JWTUtils;

import java.io.IOException;
@WebFilter(urlPatterns = "/*")
public class AuthFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        /*
        1、获取请求地址
        2、判断地址是否是Login请求、是则放行，否则进行校验
        3、校验，token是否为空，token是否正常解析，正常就放行
         */
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        if (request.getRequestURI().equals("/Login")) {
            filterChain.doFilter(request, response);
        }else{
            String token = request.getHeader("token");
            if(token==null){
                Request unauthorized = Request.err("Unauthorized");
                String msg = JSON.toJSONString(unauthorized);
                response.getWriter().write(msg);
            }
            else {
                try {
                    JWTUtils.DecodeJWT(token);
                    filterChain.doFilter(request, response);
                }catch (Exception e){
                    Request unauthorized = Request.err("Unauthorized");
                    String msg = JSON.toJSONString(unauthorized);
                    response.getWriter().write(msg);
                }
            }
        }
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}

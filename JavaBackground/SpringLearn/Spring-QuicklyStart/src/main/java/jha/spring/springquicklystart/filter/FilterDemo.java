package jha.spring.springquicklystart.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;


import java.io.IOException;
@WebFilter(urlPatterns = "/*")//设置拦截所有
public class FilterDemo implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {//初始化方法，Web服务器启动时，创建Filter时调用，只调用一次
        System.out.println("Filter 初始化！！！");
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //拦截到请求时，调用该方法，可调用多次
        System.out.println("Filter 拦截到请求！！！！");
        filterChain.doFilter(servletRequest, servletResponse);//放行，方法继续执行
        System.out.println("放行之后的逻辑！");
    }

    @Override
    public void destroy() {//销毁方法，服务器关闭时调用，只调用一次
        System.out.println("Filter 销毁！！！");
        Filter.super.destroy();
    }
}

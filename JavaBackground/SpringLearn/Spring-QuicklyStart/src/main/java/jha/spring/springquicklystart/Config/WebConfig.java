package jha.spring.springquicklystart.Config;

import jha.spring.springquicklystart.interceptor.AuthInterceptor;
import jha.spring.springquicklystart.interceptor.InterceptorDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class WebConfig  implements WebMvcConfigurer {
    @Autowired

    private AuthInterceptor authInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authInterceptor)
                .addPathPatterns("/**")//拦截任意路径
                .excludePathPatterns("/Login");//不拦截/Login
    }
}

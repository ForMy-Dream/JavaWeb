package jha.spring.springquicklystart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan//启用Servlet组件
@SpringBootApplication
public class SpringQuicklyStartApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringQuicklyStartApplication.class, args);
    }

}

package jha.spring.springquicklystart.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "minio") // 配置前缀
public class MinioConfig {

        private String endpoint;
        private String accessKey;
        private String secretKey;
        private String bucketName;

}

package jha.spring.springquicklystart.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Data
@Component
public class minioConfigDemo {

    @Value("${minio.endpoint}")
    String endpoint;
    @Value("${minio.access-key}")
    String accessKey;
    @Value("${minio.secret-key}")
    String secretKey;
    @Value("${minio.bucket-name}")
    String bucketName;

}

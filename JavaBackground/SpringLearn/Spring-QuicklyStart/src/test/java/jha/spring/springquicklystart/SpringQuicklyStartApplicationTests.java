package jha.spring.springquicklystart;

import io.minio.GetPresignedObjectUrlArgs;
import io.minio.MinioClient;
import io.minio.UploadObjectArgs;
import io.minio.errors.*;
import io.minio.http.Method;
import jha.spring.springquicklystart.Mapper.EmpMapper2;
import jha.spring.springquicklystart.dao.EmpMapper;
import jha.spring.springquicklystart.pojo.Emps;
import jha.spring.springquicklystart.pojo.PUser;
import jha.spring.springquicklystart.pojo.Users;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@SpringBootTest
class SpringQuicklyStartApplicationTests {
    @Autowired
    private EmpMapper2 mapper;
    @Test
    void test() {
        List<Emps> list = mapper.getUser();
        for (Emps users : list) {
            System.out.println(users);
        }
    }
@Test
    void testDeleteEmpByIds(){
        List<Integer> ids=new ArrayList<>() ;
        ids.add(21);
        ids.add(22);
        ids.add(23);

        System.out.println(mapper.deleteByIds(ids));
    }

    @Test
    public void test2(){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d ah:mm:ss");
        DateTimeFormatter finalFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String st="2025-1-17 下午3:02:21";
        System.out.println("解析后的时间："+finalFormatter.format (LocalDateTime.parse(st, formatter)));
        }

    @Test
    public void uploadTest(){
        MultipartFile file=null;
        String objectName="1.pdf";
        MinioClient minioClient = MinioClient.builder()
                .endpoint("http://169.254.64.130:9000/")
                .credentials("admin", "jha220717")
                .build();
        try {
            /*minioClient.putObject(
                    io.minio.PutObjectArgs.builder()
                            .bucket("jha-test")
                            .object(objectName)
                            .stream(file.getInputStream(), file.getSize(), -1)
                            .contentType(file.getContentType())
                            .build());*/
            //本机测试使用
            minioClient.uploadObject(
                    UploadObjectArgs.builder()
                            .bucket("jha-test")
                            .object(objectName)
                            .filename("D:/Users/Desktop/1.pdf")
                            .build());
            System.out.println("文件上传成功！");
        } catch (Exception e) {
            System.err.println("文件上传失败: " + e.getMessage());
        }
    }
    @Test
    public void previewUrlTest(){
        MinioClient minioClient = MinioClient.builder()
                .endpoint("http://169.254.64.130:9000/")
                .credentials("admin", "jha220717")
                .build();
        try {
            String presignedObjectUrl = minioClient.getPresignedObjectUrl(
                    GetPresignedObjectUrlArgs.builder()
                            .method(Method.GET) // 请求方法
                            .bucket("jha-test") // 存储桶名称
                            .object("19_公告_page-0001.jpg") // 文件名称
                            .expiry(20, TimeUnit.MINUTES) // 有效期
                            .build());
            System.out.println(presignedObjectUrl);
        } catch (Exception e) {
            System.out.printf("预览失败");
        }
    }
}

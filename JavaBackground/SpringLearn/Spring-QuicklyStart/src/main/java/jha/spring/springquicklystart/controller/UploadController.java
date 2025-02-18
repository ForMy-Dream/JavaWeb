package jha.spring.springquicklystart.controller;


import io.minio.MinioClient;
import io.minio.UploadObjectArgs;
import jha.spring.springquicklystart.pojo.Request;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Slf4j
@CrossOrigin
@RestController
public class UploadController {

    @RequestMapping("/upload")
    public Request upload(String name,Integer age, MultipartFile file) {
        String filename = file.getOriginalFilename();
        String newName = UUID.randomUUID().toString();
        String newFileName = newName+filename.substring(filename.lastIndexOf("."));
        try {
           // file.transferTo(new File("D:\\JAVA\\resource\\uploadFile\\" + filename));//保存下来的文件名为源文件名
            // file.transferTo(new File("D:\\JAVA\\resource\\uploadFile\\" + newFileName));//保存下来的文件名为源文件名


            MinioClient minioClient = MinioClient.builder()
                    .endpoint("http://169.254.64.130:9000/")
                    .credentials("admin", "jha220717")
                    .build();

            minioClient.putObject(
                    io.minio.PutObjectArgs.builder()
                            .bucket("jha-test")
                            .object(filename)
                            .stream(file.getInputStream(), file.getSize(), -1)
                            .contentType(file.getContentType())
                            .build());
               /* //本机测试使用
                minioClient.uploadObject(
                        UploadObjectArgs.builder()
                                .bucket("jha-test")
                                .object(objectName)
                                .filename("D:/Users/Desktop/1.pdf")
                                .build());*/
                System.out.println("文件上传成功！");

        } catch (Exception e) {
        System.err.println("文件上传失败: " + e.getMessage());}
        return Request.success("文件保存成功");
    }
}

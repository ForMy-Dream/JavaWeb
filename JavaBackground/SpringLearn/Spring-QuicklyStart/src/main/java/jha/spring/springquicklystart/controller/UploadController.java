package jha.spring.springquicklystart.controller;


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
            file.transferTo(new File("D:\\JAVA\\resource\\uploadFile\\" + newFileName));//保存下来的文件名为源文件名
        } catch (IOException e) {
            log.error("文件保存出错");
        }
        return Request.success("文件保存成功");
    }
}

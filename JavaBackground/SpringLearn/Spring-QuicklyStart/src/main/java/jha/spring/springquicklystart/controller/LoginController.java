package jha.spring.springquicklystart.controller;

import jha.spring.springquicklystart.pojo.Emps;
import jha.spring.springquicklystart.pojo.Request;
import jha.spring.springquicklystart.service.impl.empsServerImpl;
import jha.spring.springquicklystart.utils.JWTUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
public class LoginController {
    @Autowired
    private empsServerImpl emps;
    @RequestMapping("/Login")
    public Request LoginController(@RequestBody Emps emp) {
        log.info(emp.toString());
        Emps r= emps.checkUserAndPassword(emp);
        if(r!=null){//登录成功，返回token
            HashMap<String, String> user = new HashMap<>();
            user.put(emp.getUsername(), emp.getPassword());
            String token = JWTUtils.EncoderJWT(user);
            return Request.success(token);
        }else{
            return Request.err("用户名或密码错误");
        }
    }
}

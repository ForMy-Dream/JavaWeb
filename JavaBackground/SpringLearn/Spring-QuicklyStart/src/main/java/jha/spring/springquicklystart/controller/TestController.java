package jha.spring.springquicklystart.controller;

import jakarta.servlet.http.HttpServletRequest;
import jha.spring.springquicklystart.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@RestController
public class TestController {
    @RequestMapping("/old")
    public String getDate1(HttpServletRequest request){
        String name = request.getParameter("name");
        String ageStr = request.getParameter("age");
        Integer age=Integer.parseInt(ageStr);
        return name+"今年"+age+"岁！";
    }
    @RequestMapping("/auto")
    public String getDate2(String name,Integer age){

        return name+"今年"+age+"岁！";
    }
    @RequestMapping("/diff")
    public String getDate3(@RequestParam(name = "name") String username, Integer age){

        return username+"今年"+age+"岁！";
    }

    @RequestMapping("/noParam")
    public String getDate4(@RequestParam(name = "name" ,required=false) String username, Integer age){

        return username+"今年"+age+"岁！";
    }

    @RequestMapping("/simplePojo")
    public String getPojo(User user){

        return user.toString();
    }
    @RequestMapping("/array")
    public String getArray(String[] hobby){

        return Arrays.toString(hobby);
    }
    @RequestMapping("/list")
    public String getArray(@RequestParam(name = "hobbys") List<String> hobby){

        return hobby.toString();
    }
    @RequestMapping("/date")
    /*public String getDateTime(@DateTimeFormat(pattern ="yyyy-MM-dd HH:mm:ss")LocalDateTime date){*/
    public String getDateTime(@DateTimeFormat(pattern ="yyyy年MM月dd日 HH时mm分ss秒")LocalDateTime date){
        return date.toString();
    }
    @RequestMapping("/json")
    public String getJson(@RequestBody User user){

        return user.toString();
    }
    @RequestMapping("/jsonList")
    public String getJson(@RequestBody List<User> user){

        return user.toString();
    }
    @RequestMapping("/path/{id}/{name}")
    public String getPathData(@PathVariable Integer id,@PathVariable String name){

        return "id为："+id+"，名字为："+name;
    }

}

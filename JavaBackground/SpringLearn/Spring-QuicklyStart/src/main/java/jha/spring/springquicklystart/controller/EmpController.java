package jha.spring.springquicklystart.controller;

import jakarta.annotation.Resource;
import jha.spring.springquicklystart.pojo.Emp;
import jha.spring.springquicklystart.pojo.Request;
import jha.spring.springquicklystart.service.empServiceInterface;
import jha.spring.springquicklystart.service.impl.empServiceImpl;
import jha.spring.springquicklystart.utils.XmlParseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URL;
import java.util.List;

@RestController
public class EmpController {
//    private empServiceImpl service=new empServiceImpl();
    //@Autowired

    @Resource(name = "empServiceImplB")
    private empServiceInterface service;
    @RequestMapping("/listEmp")
    public Request getEmp(){
        List<Emp> empService = service.getEmpService();
        return Request.success(empService);
    }
}

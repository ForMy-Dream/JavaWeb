package jha.spring.springquicklystart.controller;

import jakarta.annotation.Resource;
import jha.spring.springquicklystart.pojo.Emp;
import jha.spring.springquicklystart.pojo.Emps;
import jha.spring.springquicklystart.pojo.Request;
import jha.spring.springquicklystart.service.empServiceInterface;
import jha.spring.springquicklystart.service.impl.empServiceImpl;
import jha.spring.springquicklystart.utils.XmlParseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URL;
import java.util.List;

@RestController
public class EmpController {
//    private empServiceImpl service=new empServiceImpl();
    //@Autowired

    @Resource(name = "empsServerImpl")
    private empServiceInterface service;
    @RequestMapping("/listEmp")
    public Request getEmp(){
        List<Emp> empService = service.getEmpService();
        return Request.success(empService);
    }

    @RequestMapping("/emps")
    public Request getEmps(){
        List<Emps> empService = service.getEmp();
        return Request.success(empService);
    }

    @RequestMapping("/deleteEmps")
    public Request deleteEmps(Integer id){
        Integer empService = service.deleteEmp(id);
        return Request.success(empService);
    }

    @RequestMapping("/insertEmps")
    public Request insertEmps(@RequestBody Emps emp){
        Integer empService = service.insertEmP(emp);
        return Request.success(empService);
    }
}

package jha.spring.springquicklystart.controller;

import jakarta.annotation.Resource;
import jha.spring.springquicklystart.Mapper.EmpMapper2;
import jha.spring.springquicklystart.pojo.Emp;
import jha.spring.springquicklystart.pojo.Emps;
import jha.spring.springquicklystart.pojo.Request;
import jha.spring.springquicklystart.service.empServiceInterface;
import jha.spring.springquicklystart.service.impl.empServiceImpl;
import jha.spring.springquicklystart.utils.XmlParseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.URL;
import java.time.LocalDateTime;
import java.util.List;

@RestController
public class EmpController {
//    private empServiceImpl service=new empServiceImpl();
    //@Autowired

    @Resource(name = "empsServerImpl")
    private empServiceInterface service;
    @Autowired
    private EmpMapper2 empMapper2;
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
        System.out.println(emp.getId());
        return Request.success("新增的行数："+empService+"，主键为："+emp.getId());
    }


    @RequestMapping("/getEmpsByID")
    public Request getEmpByID(Integer id){
        Emps empService = service.getEmpByID(id);
        return Request.success(empService);
    }

    @RequestMapping("/getEmpsBySearch")
    public Request getEmpBySearch(String username, Integer gender, LocalDateTime start, LocalDateTime end){
        Emps empService = service.getEmpBySearch(username, gender, start, end);
        return Request.success(empService);
    }

    @RequestMapping("/getEmpsBySearch2")
    public Request getEmpBySearch2(String username, Integer gender, LocalDateTime start, LocalDateTime end){
        List<Emps> empService = empMapper2.getEmpBySearch(username, gender, start, end);
        return Request.success(empService);
    }

    @RequestMapping("/updateEmps")
    public Request updateEmps(@RequestBody Emps emp){
        Integer empService = empMapper2.updateEmp(emp);
        return Request.success(empService);
    }

    @RequestMapping("/deleteEmpsByIds")
    public Request deleteEmps(@RequestParam(name = "ids") List<Integer> ids){
        Integer empService = empMapper2.deleteByIds(ids);
        return Request.success(empService);
    }
}

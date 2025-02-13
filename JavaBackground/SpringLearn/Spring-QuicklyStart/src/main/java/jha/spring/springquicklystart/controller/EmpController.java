package jha.spring.springquicklystart.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import jakarta.annotation.Resource;
import jha.spring.springquicklystart.Mapper.EmpMapper2;
import jha.spring.springquicklystart.pojo.Emp;
import jha.spring.springquicklystart.pojo.Emps;
import jha.spring.springquicklystart.pojo.PageBean;
import jha.spring.springquicklystart.pojo.Request;
import jha.spring.springquicklystart.service.empServiceInterface;
import jha.spring.springquicklystart.service.impl.empServiceImpl;
import jha.spring.springquicklystart.utils.XmlParseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.net.URL;
import java.time.LocalDateTime;
import java.util.List;
@CrossOrigin
//@RequestMapping("/api")
@RestController
public class EmpController {
//    private empServiceImpl service=new empServiceImpl();
    //@Autowired

    @Resource(name = "empsServerImpl")
    private empServiceInterface service;
    @Autowired
    private EmpMapper2 empMapper2;
    //获取所有人员信息
    @RequestMapping("/listEmp")
    public Request getEmp(){
        List<Emp> empService = service.getEmpService();
        return Request.success(empService);
    }
    //获取所有人员信息
    @RequestMapping("/listEmps")
    public Request getEmpList(){
        List<Emps> empService = empMapper2.getUser();
        return Request.success(empService);
    }
    //获取所有人员信息
    @RequestMapping("/emps")
    public Request getEmps(){
        List<Emps> empService = service.getEmp();
        return Request.success(empService);
    }
    //删除人员信息（单个删除）
    @RequestMapping("/deleteEmps")
    public Request deleteEmps(Integer id){
        Integer empService = service.deleteEmp(id);
        return Request.success(empService);
    }
    //新增人员信息
    @RequestMapping("/insertEmps")
    public Request insertEmps(@RequestBody Emps emp){
        Integer empService = service.insertEmP(emp);
        System.out.println(emp.getId());
        return Request.success("新增的行数："+empService+"，主键为："+emp.getId());
    }
    //获取人员信息（单个）
    @RequestMapping("/getEmpsByID")
    public Request getEmpByID(Integer id){
        Emps empService = service.getEmpByID(id);
        return Request.success(empService);
    }
    //获取人员信息（条件搜索）
    @RequestMapping("/getEmpsBySearch")
    public Request getEmpBySearch(String username, Integer gender, LocalDateTime start, LocalDateTime end){
        Emps empService = service.getEmpBySearch(username, gender, start, end);
        return Request.success(empService);
    }
    //获取人员信息（条件搜索）
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

    @RequestMapping("/GetEmpByLimit")
    public Request getEmpByLimit(@RequestParam(defaultValue = "1") Integer pageNo,@RequestParam(defaultValue = "5") Integer pageCount){
        PageBean page=new PageBean();
        page.setTotal(empMapper2.getEmpCount());
        page.setRow(empMapper2.getEmpLimit(pageNo,pageCount));
        return Request.success(page);
    }

    @RequestMapping("/GetEmpByLimitPageHelper")
    public Request GetEmpByLimitPageHelper(@RequestParam(defaultValue = "1") Integer pageNo,@RequestParam(defaultValue = "5") Integer pageCount){
        //1、设置分页参数
        PageHelper.startPage(pageNo,pageCount);
        //2、执行查询
        List<Emps> user = empMapper2.getUser();
        Page<Emps> p= (Page<Emps>) user;
        //3、封装PageBean

        PageBean page=new PageBean((int) p.getTotal(),p.getResult());

        return Request.success(page);
    }

}

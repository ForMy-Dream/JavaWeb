package jha.spring.springquicklystart.service.impl;

import jha.spring.springquicklystart.dao.empInterface;
import jha.spring.springquicklystart.pojo.Emp;
import jha.spring.springquicklystart.pojo.Emps;
import jha.spring.springquicklystart.service.empServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class empServiceImplB implements empServiceInterface {
    //private empImpl empData=new empImpl();

    @Autowired//依赖注入
    private empInterface empImpl;
    @Override
    public List<Emp> getEmpService() {
        List<Emp> empList = empImpl.getEmpList();
        for (Emp emp : empList) {
            emp.setGender(emp.getGender().equals("1") ? "男的":"女的");

        }
        return empList;
    }

    @Override
    public List<Emps> getEmp() {
        return null;
    }

    @Override
    public Integer deleteEmp(Integer id) {
        return null;
    }

    @Override
    public Integer insertEmP(Emps emp) {
        return null;
    }

    @Override
    public Emps getEmpByID(Integer id) {
        return null;
    }

    @Override
    public Emps getEmpBySearch(String username, Integer gender, LocalDateTime start, LocalDateTime end) {
        return null;
    }


}

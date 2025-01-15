package jha.spring.springquicklystart.service.impl;

import jha.spring.springquicklystart.dao.EmpMapper;
import jha.spring.springquicklystart.pojo.Emp;
import jha.spring.springquicklystart.pojo.Emps;
import jha.spring.springquicklystart.service.empServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Primary
@Service
public class empsServerImpl implements empServiceInterface {

    @Autowired
    private EmpMapper mapper;


    @Override
    public List<Emp> getEmpService() {
        return null;
    }

    @Override
    public List<Emps> getEmp() {
        return mapper.getEmp();
    }

    @Override
    public Integer deleteEmp(Integer id) {
        return mapper.deleteEmp(id);
    }

    @Override
    public Integer insertEmP(Emps emps) {
        return mapper.insertEmp(emps);
    }

    @Override
    public Emps getEmpByID(Integer id) {
        return mapper.getEmpById(id);
    }

    @Override
    public Emps getEmpBySearch(String username, Integer gender, LocalDateTime start, LocalDateTime end) {
        return mapper.getEmpBySearch(username, gender, start, end);
    }
}

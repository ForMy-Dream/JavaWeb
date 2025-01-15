package jha.spring.springquicklystart.service;

import jha.spring.springquicklystart.pojo.Emp;
import jha.spring.springquicklystart.pojo.Emps;

import java.time.LocalDateTime;
import java.util.List;

public interface empServiceInterface {
    public List<Emp> getEmpService();
    public List<Emps> getEmp();
   public Integer deleteEmp(Integer id);
   public Integer insertEmP(Emps emp);

   public Emps getEmpByID(Integer id);
    public Emps getEmpBySearch(String username, Integer gender, LocalDateTime start, LocalDateTime end);
}

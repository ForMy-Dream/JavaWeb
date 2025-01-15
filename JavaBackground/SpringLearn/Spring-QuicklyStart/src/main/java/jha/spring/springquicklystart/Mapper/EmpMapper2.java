package jha.spring.springquicklystart.Mapper;

import jha.spring.springquicklystart.pojo.Emp;
import jha.spring.springquicklystart.pojo.Emps;
import jha.spring.springquicklystart.pojo.PUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDateTime;
import java.util.List;

@Mapper
public interface EmpMapper2 {

    public List<Emps> getUser();

    public List<Emps> getEmpBySearch(@Param("name") String username, Integer gender, LocalDateTime start,LocalDateTime end);

    public Integer updateEmp(Emps emps);

    public Integer deleteByIds(List<Integer> ids);


}

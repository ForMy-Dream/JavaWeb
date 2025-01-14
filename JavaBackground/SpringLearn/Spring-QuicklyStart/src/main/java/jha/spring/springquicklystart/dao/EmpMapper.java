package jha.spring.springquicklystart.dao;

import jha.spring.springquicklystart.pojo.Emps;
import jha.spring.springquicklystart.pojo.PUser;
import jha.spring.springquicklystart.pojo.Users;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface EmpMapper {
    @Select("select * from  users")
    public List<PUser> getUser();
    @Select("select * from emp")
    public List<Emps> getEmp();
    @Delete("delete emp where id=#{id}")
    public Integer deleteEmp(Integer id);

    @Insert("insert into emp (username,password,gender, image,job,entrydate,dept_id,create_time, update_time,is_using)" +
            "values(#{username}, #{password}, #{gender}, #{image},#{job}, #{entrydate}, #{deptId}, #{createTime}, #{updateTime}, #{isUsing})")
    public Integer insertEmp(Emps emps);
}

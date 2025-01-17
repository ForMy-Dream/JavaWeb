package jha.spring.springquicklystart.dao;

import jha.spring.springquicklystart.pojo.Emps;
import jha.spring.springquicklystart.pojo.PUser;
import jha.spring.springquicklystart.pojo.Users;
import org.apache.ibatis.annotations.*;

import java.time.LocalDateTime;
import java.util.List;
@Mapper
public interface EmpMapper {
    @Select("select * from  users")
    public List<PUser> getUser();

    @Select("select * from emp")
    public List<Emps> getEmp();
    @Delete("delete emp where id=#{id}")
    public Integer deleteEmp(Integer id);


    @Options(keyProperty = "id", useGeneratedKeys = true, keyColumn = "id")
    @Insert("INSERT INTO emp (username, password, gender, image, job, entrydate, dept_id, create_time, update_time, is_using) " +
            "VALUES (#{username}, #{password}, #{gender}, #{image}, #{job}, #{entrydate}, #{deptId}, #{createTime}, #{updateTime}, #{isUsing})")
    Integer insertEmp(Emps emps);


    /*
    sql起别名
     @Select("select id,username,password,gender, image,job,entrydate,dept_id as deptId,create_time createTime, update_time updateTime,is_using isUsing from emp where id=#{id}")
     */




/*
  @Results和 @Result注解
  @Select("select * from emp where id=#{id}")
    @Results({
            @Result(column = "dept_id",property = "deptId"),
            @Result(column = "create_time",property = "createTime"),
            @Result(column = "update_time",property = "updateTime"),
            @Result(column = "is_using",property = "isUsing")
    })*/
    @Select("select * from emp where id=#{id}")
    public Emps getEmpById(Integer id);

    @Select("select * from emp where username like '%'||#{name}||'%' and gender =#{gender} and entrydate between #{start} and #{end}" )
    public Emps getEmpBySearch(@Param("name") String username, Integer gender, LocalDateTime start,LocalDateTime end);

}

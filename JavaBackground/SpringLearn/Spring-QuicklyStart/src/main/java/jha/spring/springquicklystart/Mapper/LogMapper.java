package jha.spring.springquicklystart.Mapper;

import jha.spring.springquicklystart.pojo.Logs;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LogMapper {
    @Insert("insert into Logs (operuser,operDateTime,operClass,operMethod,methodParam,methodReturn,operCost) values " +
            "(#{operUser},#{operDateTime},#{operClass},#{operMethod},#{methodParam},#{methodReturn},#{operCost})")
   public Integer InsertLog(Logs log);
}

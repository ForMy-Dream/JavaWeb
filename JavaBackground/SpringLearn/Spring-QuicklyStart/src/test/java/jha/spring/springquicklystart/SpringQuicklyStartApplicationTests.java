package jha.spring.springquicklystart;

import jha.spring.springquicklystart.Mapper.EmpMapper2;
import jha.spring.springquicklystart.dao.EmpMapper;
import jha.spring.springquicklystart.pojo.Emps;
import jha.spring.springquicklystart.pojo.PUser;
import jha.spring.springquicklystart.pojo.Users;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
@SpringBootTest
class SpringQuicklyStartApplicationTests {
    @Autowired
    private EmpMapper2 mapper;
    @Test
    void test() {
        List<Emps> list = mapper.getUser();
        for (Emps users : list) {
            System.out.println(users);
        }
    }
@Test
    void testDeleteEmpByIds(){
        List<Integer> ids=new ArrayList<>() ;
        ids.add(21);
        ids.add(22);
        ids.add(23);

        System.out.println(mapper.deleteByIds(ids));
    }

    @Test
    public void test2(){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d ah:mm:ss");
        DateTimeFormatter finalFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String st="2025-1-17 下午3:02:21";
        System.out.println("解析后的时间："+finalFormatter.format (LocalDateTime.parse(st, formatter)));
        }


}

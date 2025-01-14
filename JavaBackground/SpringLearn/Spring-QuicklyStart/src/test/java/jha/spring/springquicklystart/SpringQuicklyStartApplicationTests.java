package jha.spring.springquicklystart;

import jha.spring.springquicklystart.dao.EmpMapper;
import jha.spring.springquicklystart.pojo.PUser;
import jha.spring.springquicklystart.pojo.Users;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
@SpringBootTest
class SpringQuicklyStartApplicationTests {
    @Autowired
    private EmpMapper mapper;
    @Test
    void test() {
        List<PUser> list = mapper.getUser();
        for (PUser users : list) {
            System.out.println(users);
        }
    }


}

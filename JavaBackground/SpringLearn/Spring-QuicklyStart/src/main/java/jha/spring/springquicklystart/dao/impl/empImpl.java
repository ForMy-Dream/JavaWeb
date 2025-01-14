package jha.spring.springquicklystart.dao.impl;

import jha.spring.springquicklystart.dao.empInterface;
import jha.spring.springquicklystart.pojo.Emp;
import jha.spring.springquicklystart.utils.XmlParseUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class empImpl implements empInterface {
    @Override
    public List<Emp> getEmpList()  {
        List<Emp> xmlData = null;
        try {
            //String resource = this.getClass().getClassLoader().getResource("emp.xml").getFile();
            String resource="src/main/resources/emp.xml";
            System.out.println(resource);
            xmlData = XmlParseUtils.getXmlData(resource);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return xmlData;
    }
}

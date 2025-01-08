package jha.spring.springquicklystart.utils;

import jha.spring.springquicklystart.pojo.Emp;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.xml.sax.SAXException;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class XmlParseUtils {
    /*
    将xml解析成List<T>
     */
    public static List<Emp> getXmlData(String  path) throws Exception {
        SAXReader reader = new SAXReader();
        Document doc = reader.read(new File( path));
        Element rootElement = doc.getRootElement();
        List<Emp> empList=new ArrayList<>();
        List<Element> elements = rootElement.elements();//获取父节点下的所有的子节点
        for (Element element : elements) {
            String name = element.element("name").getText();
            //获取 age 属性
            Integer age =Integer.parseInt( element.element("age").getText());
            //获取 image 属性
            String image = element.element("image").getText();
            //获取 gender 属性
            String gender = element.element("gender").getText();
            //获取 job 属性
            Integer job = Integer.parseInt( element.element("job").getText());
            Emp emp = new Emp(name, age, image, gender, job);
            empList.add(emp);
        }
        return empList;
    }
}

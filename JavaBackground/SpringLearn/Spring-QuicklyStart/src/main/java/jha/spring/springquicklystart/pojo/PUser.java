package jha.spring.springquicklystart.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class PUser {
    private Integer id;
    private String name;
    private Short age;
    private Short gender;
    private String phone;
}

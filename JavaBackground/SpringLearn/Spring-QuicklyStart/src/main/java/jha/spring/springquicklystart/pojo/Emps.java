package jha.spring.springquicklystart.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emps {
    private Integer id;
    private String username;
    private String password;
    private Integer gender;
    private String image;
    private Integer job;
    private LocalDateTime entrydate;
    private Integer deptId;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private Integer isUsing;

}

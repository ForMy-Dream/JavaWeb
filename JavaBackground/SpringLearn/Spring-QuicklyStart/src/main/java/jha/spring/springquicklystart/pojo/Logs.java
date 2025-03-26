package jha.spring.springquicklystart.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Logs {
    private Integer ID;
    private String operUser;
    private LocalDateTime operDateTime;
    private String operClass;
    private String operMethod;
    private String methodParam;
    private String methodReturn;
    private Long operCost;
}

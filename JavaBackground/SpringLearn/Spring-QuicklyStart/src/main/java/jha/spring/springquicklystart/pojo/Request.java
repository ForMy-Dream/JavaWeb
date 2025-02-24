package jha.spring.springquicklystart.pojo;

public class Request {
    private Integer code;
    private String msg;
    private Object data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Request() {
    }

    public Request(Integer code, String msg, Object date) {
        this.code = code;
        this.msg = msg;
        this.data = date;
    }
    public static Request success(){
        return new Request(200,"成功",null);
    }

    public static Request success(Object data){
        return new Request(200,"成功",data);
    }
    public static Request err(Object data){
        return new Request(500,"失败",data);
    }
}

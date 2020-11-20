package com.tedu.pojo;

/**
 * @ProjectName: page
 * @Package: com.tedu.pojo
 * @ClassName: Result
 * @Author: Chase
 * @Description:
 * @Date: 2020/11/19 10:49
 * @Version: 1.0
 */
public class Result {
    Integer state;
    String msg;
    Object data;

    public Result(Integer state, String msg) {
        this.state = state;
        this.msg = msg;
    }

    public Result(Integer state, String msg, Object data) {
        this.state = state;
        this.msg = msg;
        this.data = data;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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

    @Override
    public String toString() {
        return "Result{" +
                "state=" + state +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}

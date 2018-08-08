package com.exercise.hello;

/**
 * 这个是Bean类，用于在spring boot中使用的
 *
 * @author
 *
 */
public class HelloService {

    // 私有属性，与下面的set和get方法一起，用于注入
    private String msg;

    /**
     * 打招呼的类，用于在spring boot中调用
     *
     * @return
     */
    public String sayHello() {
        return "hello " + msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
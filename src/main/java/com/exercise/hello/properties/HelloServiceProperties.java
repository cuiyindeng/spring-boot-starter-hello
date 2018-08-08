package com.exercise.hello.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 这个是类型安全属性的获取，用于配置自动注入bean的参数
 *
 * @author
 *
 */
@ConfigurationProperties(prefix = "hello")
public class HelloServiceProperties {

    // 默认的配置的值
    private final static String MSG = "World";

    // 由于在configuationProperties中配置了前缀，所以可以在application.properties中使用hello.msg配置该值。
    private String msg = MSG;

    // 这里的get和set方法，是方便外部注入参数值用的，需要注意的是这里和HelloService不同，并没有让properties中的参数直接注入到HelloService中
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
package com.exercise.hello;

import com.exercise.hello.config.HelloServiceAutoconfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Created by dannycui on 2018/11/2.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(HelloServiceAutoconfiguration.class)
public @interface EnableHelloStarter {
}

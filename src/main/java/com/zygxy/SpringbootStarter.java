package com.zygxy;/**
 * Created by abc83 on 2017/4/23.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @author yangrui
 * @create 2017-04-23 16:49
 **/
@SpringBootApplication
public class SpringbootStarter extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringbootStarter.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootStarter.class, args);
    }
}

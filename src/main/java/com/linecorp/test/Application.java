/**
 * @(#)Application $version 2017. 7. 25.
 * <p>
 * Copyright 2017 Line Plus Corp. All rights Reserved.
 * Line Plus PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.linecorp.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Yonghun.kim@linecorp.com
 */
@ComponentScan
@EnableAutoConfiguration
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

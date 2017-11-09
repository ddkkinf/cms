/**
 * @(#)Application $version 2017. 7. 25.
 * <p>
 * Copyright 2017 Line Plus Corp. All rights Reserved.
 * Line Plus PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package dev.argent.cms;

import dev.argent.cms.config.ApplicationSetting;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Yonghun.kim@linecorp.com
 */
@ComponentScan(basePackages = "dev.argent.cms")
@SpringBootApplication
@EnableConfigurationProperties(ApplicationSetting.class)
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

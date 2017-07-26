/**
 * @(#)SampleController $version 2017. 7. 25.
 * <p>
 * Copyright 2017 Line Plus Corp. All rights Reserved.
 * Line Plus PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.linecorp.test.com.linecorp.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yonghun.kim@linecorp.com
 */
@RestController
public class SampleController {

    @RequestMapping("/sample")
    String sample() {
        return "Hello World!";
    }
}

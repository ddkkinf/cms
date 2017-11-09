/**
 * @(#)SampleController $version 2017. 7. 25.
 * <p>
 * Copyright 2017 Line Plus Corp. All rights Reserved.
 * Line Plus PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.linecorp.cms.controller;

import com.linecorp.cms.config.ApplicationSetting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yonghun.kim@linecorp.com
 */
@RestController
public class SampleController {
    @Autowired
    ApplicationSetting applicationSetting;

    @GetMapping("/")
    String sample() {
        return applicationSetting.getDeployPhase();
    }
}

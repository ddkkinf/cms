/**
 * @(#)SampleController $version 2017. 7. 25.
 * <p>
 * Copyright 2017 Line Plus Corp. All rights Reserved.
 * Line Plus PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package dev.argent.cms.controller;

import dev.argent.cms.config.ApplicationSetting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Yonghun.kim@linecorp.com
 */
@Controller
public class IndexController {
    @Autowired
    ApplicationSetting applicationSetting;

    @GetMapping("/index")
    public ModelAndView index() {
        return new ModelAndView().addObject("deployPhase", applicationSetting.getDeployPhase());
    }
}

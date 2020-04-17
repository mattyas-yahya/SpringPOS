package com.matt.templateQ.TemplateSpringBoot2.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class KonfigurasiWeb extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/service_request").setViewName("/service_request");
        registry.addViewController("/").setViewName("/");
        registry.addViewController("/header_moveout").setViewName("/header_moveout");
        registry.addViewController("/monitor").setViewName("/monitor");

        registry.addViewController("/index/index").setViewName("/index/index");
        registry.addViewController("/work_order/**").setViewName("/work_order/**");
        registry.addViewController("/report").setViewName("/report");
    }

    

}

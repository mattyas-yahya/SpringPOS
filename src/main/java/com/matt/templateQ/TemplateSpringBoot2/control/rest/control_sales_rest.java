package com.matt.templateQ.TemplateSpringBoot2.control.rest;


import com.matt.templateQ.TemplateSpringBoot2.model.sales_rep;
import com.matt.templateQ.TemplateSpringBoot2.repo.repo_sales_rep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController

public class control_sales_rest
{
    @Autowired
    repo_sales_rep rsr;
    @RequestMapping(path = "/GetSales", method = RequestMethod.GET)
    public List<sales_rep> getAll()
    {
        return (List) rsr.findAll();
    }
}

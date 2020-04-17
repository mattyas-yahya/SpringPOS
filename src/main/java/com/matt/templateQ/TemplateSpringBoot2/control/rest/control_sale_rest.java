package com.matt.templateQ.TemplateSpringBoot2.control.rest;


import com.matt.templateQ.TemplateSpringBoot2.model.sale;
import com.matt.templateQ.TemplateSpringBoot2.repo.repo_sale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.support.SessionStatus;

import java.util.List;

@RestController
public class control_sale_rest
{
@Autowired
repo_sale resa;
    SessionStatus status;
    @RequestMapping(path="/SaleAll", method= RequestMethod.GET)
    public List<sale> getAll()
    {
        return (List)this.resa.findAll();

    }
}

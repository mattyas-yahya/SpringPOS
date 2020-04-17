package com.matt.templateQ.TemplateSpringBoot2.control.rest;


import com.matt.templateQ.TemplateSpringBoot2.model.oportunity;
import com.matt.templateQ.TemplateSpringBoot2.repo.repo_oportunity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class control_oportunity_rest
{
@Autowired
repo_oportunity reop;
    @RequestMapping(path="/oportunityAll", method= RequestMethod.GET)
    public List<oportunity> getAll()
    {

        return (List)this.reop.findAll();
    }
}

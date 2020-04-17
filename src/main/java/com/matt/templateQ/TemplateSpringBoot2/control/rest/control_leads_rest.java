package com.matt.templateQ.TemplateSpringBoot2.control.rest;


import com.matt.templateQ.TemplateSpringBoot2.model.lead;
import com.matt.templateQ.TemplateSpringBoot2.repo.repo_lead;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController

public class control_leads_rest
{
@Autowired
repo_lead rel;
    @RequestMapping(path="/LeadsAll", method= RequestMethod.GET)
    public List<lead> getAll()
    {

        return (List)this.rel.findAll();
    }
}

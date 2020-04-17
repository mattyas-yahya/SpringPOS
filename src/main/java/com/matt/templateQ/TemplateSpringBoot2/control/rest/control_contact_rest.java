package com.matt.templateQ.TemplateSpringBoot2.control.rest;


import com.matt.templateQ.TemplateSpringBoot2.model.contact;
import com.matt.templateQ.TemplateSpringBoot2.repo.repo_contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class control_contact_rest
{
    @Autowired
    repo_contact react;

    @RequestMapping(path="/ContactAll", method= RequestMethod.GET)
    public List<contact> getAll()
    {
        return (List)this.react.findAll();
    }
}

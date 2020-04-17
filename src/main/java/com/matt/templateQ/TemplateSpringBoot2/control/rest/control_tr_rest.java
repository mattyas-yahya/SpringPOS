package com.matt.templateQ.TemplateSpringBoot2.control.rest;

import com.matt.templateQ.TemplateSpringBoot2.model.trans;
import com.matt.templateQ.TemplateSpringBoot2.repo.repo_transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class control_tr_rest
{
    @Autowired
    repo_transaction retr;
    @RequestMapping(path="/TransAll", method= RequestMethod.GET)
    public List<trans> getAll()
    {

        return (List)this.retr.findAll();
    }
}

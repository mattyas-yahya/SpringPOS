package com.matt.templateQ.TemplateSpringBoot2.control.rest;

import com.matt.templateQ.TemplateSpringBoot2.model.cases;
import com.matt.templateQ.TemplateSpringBoot2.repo.repo_case;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class control_case_rest
{
@Autowired
repo_case recas;
    @RequestMapping(path="/CaseAll", method= RequestMethod.GET)
    public List<cases> getAll()
    {

        return (List)this.recas.findAll();
    }
}

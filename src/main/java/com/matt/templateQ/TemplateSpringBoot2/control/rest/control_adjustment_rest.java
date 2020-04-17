package com.matt.templateQ.TemplateSpringBoot2.control.rest;


import com.matt.templateQ.TemplateSpringBoot2.model.transfer;
import com.matt.templateQ.TemplateSpringBoot2.repo.repo_adjustment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class control_adjustment_rest
{
@Autowired
repo_adjustment readj;
    @RequestMapping(path="/AdjustmentAll", method= RequestMethod.GET)
    public List<transfer> getAll()
    {
        return (List)this.readj.adjustment_barang();
    }
}

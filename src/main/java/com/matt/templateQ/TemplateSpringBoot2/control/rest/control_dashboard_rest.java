package com.matt.templateQ.TemplateSpringBoot2.control.rest;

import com.matt.templateQ.TemplateSpringBoot2.model.Barang;
import com.matt.templateQ.TemplateSpringBoot2.repo.repo_barang;
import com.matt.templateQ.TemplateSpringBoot2.repo.repo_barang_dto;
import com.matt.templateQ.TemplateSpringBoot2.repo.repo_contact;
import com.matt.templateQ.TemplateSpringBoot2.repo.repo_sales_rep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
@RestController

public class control_dashboard_rest
{
    @Autowired
    repo_contact rc;
    @Autowired
    repo_sales_rep rs;
    @Autowired
    repo_barang rb;
    @Autowired
    repo_barang_dto rbd;

    @RequestMapping(path="/max", method= RequestMethod.GET)
    public List getAll(Model model)
    {
      return (List)rb.barang_max();
    }
}

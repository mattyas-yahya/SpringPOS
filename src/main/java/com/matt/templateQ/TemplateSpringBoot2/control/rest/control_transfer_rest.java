package com.matt.templateQ.TemplateSpringBoot2.control.rest;


import com.matt.templateQ.TemplateSpringBoot2.model.transfer;
import com.matt.templateQ.TemplateSpringBoot2.repo.repo_transfer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class control_transfer_rest
{
@Autowired
repo_transfer retro;
    @RequestMapping(path="/TransferAll", method= RequestMethod.GET)
    public List<transfer> getAll()
    {
        return (List)this.retro.transfer_barang();
    }
}

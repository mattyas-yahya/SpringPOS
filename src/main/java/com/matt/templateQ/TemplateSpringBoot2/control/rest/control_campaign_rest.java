package com.matt.templateQ.TemplateSpringBoot2.control.rest;


import com.matt.templateQ.TemplateSpringBoot2.model.campaign;
import com.matt.templateQ.TemplateSpringBoot2.repo.repo_campaign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class control_campaign_rest
{
    @Autowired
    repo_campaign recam;

    @RequestMapping(path="/CampaignAll", method= RequestMethod.GET)
    public List<campaign> getAll()
    {

        return (List)this.recam.findAll();
    }
}

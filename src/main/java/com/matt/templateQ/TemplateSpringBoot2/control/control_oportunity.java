package com.matt.templateQ.TemplateSpringBoot2.control;

import com.matt.templateQ.TemplateSpringBoot2.model.oportunity;
import com.matt.templateQ.TemplateSpringBoot2.repo.repo_oportunity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class control_oportunity
{
@Autowired
repo_oportunity reop;

    @RequestMapping(value={"/oportunity"})
    public String oportunity()
    {
        return "oportunity/oportunity";
    }

    @GetMapping({"/oportunity"})
    public String oportunity_form(Model model)
    {
        model.addAttribute("oportunity", new oportunity());
        return "oportunity/oportunity";
    }

    @RequestMapping(value={"opo_komit"},  method = RequestMethod.POST, params={"opo_action=opo_simpan"})
    public String simpan(oportunity opo)
    {
        long x=10;
        this.reop.save(opo);
        return "redirect:/oportunity";
    }

    @RequestMapping(value={"opo_komit"}, method=RequestMethod.POST, params={"opo_action=opo_hapus"})
    public String hapus(@RequestParam("id_oportunity") String ido, Model model, oportunity opo)
    {
        model.addAttribute("oportunity", this.reop.findById(ido));
        this.reop.deleteById(ido);
        return "redirect:/oportunity";
    }
}

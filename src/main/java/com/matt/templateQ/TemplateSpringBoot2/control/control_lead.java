package com.matt.templateQ.TemplateSpringBoot2.control;

import com.matt.templateQ.TemplateSpringBoot2.model.lead;
import com.matt.templateQ.TemplateSpringBoot2.repo.repo_contact;
import com.matt.templateQ.TemplateSpringBoot2.repo.repo_lead;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class control_lead
{
@Autowired
repo_lead rel;
@Autowired
repo_contact rc;




    @RequestMapping(value={"/lead"})
    public String lead()
    {
        return "lead/lead";
    }

    @GetMapping({"/lead"})
    public String lead_form(Model model)
    {
model.addAttribute("lead", new lead());
        return "lead/lead";
    }



    @RequestMapping(value={"le_komit"},  method = RequestMethod.POST, params={"le_action=le_simpan"})
    public String simpan(lead le)
    {
        this.rel.save(le);
        return "redirect:/lead";
    }

    @RequestMapping(value={"le_komit"}, method=RequestMethod.POST, params={"le_action=le_hapus"})
    public String hapus(@RequestParam("id_leads") String idl, Model model, lead le)
    {
        model.addAttribute("lead", this.rel.findById(idl));
        this.rel.deleteById(idl);
        return "redirect:/lead";
    }
}

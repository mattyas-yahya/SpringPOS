package com.matt.templateQ.TemplateSpringBoot2.control;


import com.matt.templateQ.TemplateSpringBoot2.model.contact;
import com.matt.templateQ.TemplateSpringBoot2.repo.repo_contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class control_contact
{
@Autowired
repo_contact react;

    @RequestMapping(value={"/contact"})
    public String contact()
    {
        return "contact/contact";
    }

    @GetMapping({"/contact"})
    public String contact_form(Model model)
    {
        model.addAttribute("contact", new contact());
        return "contact/contact";
    }

        @RequestMapping(value={"co_komit"},  method = RequestMethod.POST, params={"co_action=co_simpan"})
    public String simpan(contact co)
    {
        this.react.save(co);
        return "redirect:/contact";
    }

    @RequestMapping(value={"co_komit"}, method=RequestMethod.POST, params={"co_action=co_hapus"})
    public String hapus(@RequestParam("id_contact") String idc, Model model, contact co)
    {
        model.addAttribute("contact", this.react.findById(idc));
        this.react.delete(co);
        return "redirect:/contact";
    }
}

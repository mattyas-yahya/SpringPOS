package com.matt.templateQ.TemplateSpringBoot2.control;


import com.matt.templateQ.TemplateSpringBoot2.model.cases;
import com.matt.templateQ.TemplateSpringBoot2.repo.repo_case;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class control_case
{
    @Autowired
    repo_case recas;
    @RequestMapping(value={"/cases"})
    public String cases()
    {
        return "cases/cases";
    }

    @GetMapping({"/cases"})
    public String cases_form(Model model)
    {
        model.addAttribute("cases", new cases());
        return "cases/cases";
    }

    @RequestMapping(value={"cas_komit"},  method = RequestMethod.POST, params={"cas_action=cas_simpan"})
    public String simpan(cases css)
    {
        this.recas.save(css);
        return "redirect:/cases";
    }

    @RequestMapping(value={"cas_komit"}, method=RequestMethod.POST, params={"cas_action=cas_hapus"})
    public String hapus(@RequestParam("id_case") String idcs, Model model, cases css)
    {
        model.addAttribute("cases", this.recas.findById(idcs));
        this.recas.deleteById(idcs);
        return "redirect:/cases";
    }
}

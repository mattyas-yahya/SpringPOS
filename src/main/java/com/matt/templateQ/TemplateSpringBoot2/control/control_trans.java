package com.matt.templateQ.TemplateSpringBoot2.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class control_trans
{
    @RequestMapping(value={"/Trans"})
    public String Trans()
    {
        return "Trans/Trans";
    }

    @GetMapping({"/Trans"})
    public String sale_form(Model model)
    {
        return "Trans/Trans";
    }
}

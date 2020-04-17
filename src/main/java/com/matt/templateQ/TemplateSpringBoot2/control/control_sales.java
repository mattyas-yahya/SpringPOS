package com.matt.templateQ.TemplateSpringBoot2.control;


import com.matt.templateQ.TemplateSpringBoot2.model.sales_rep;
import com.matt.templateQ.TemplateSpringBoot2.repo.repo_sales_rep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class control_sales
{
@Autowired
repo_sales_rep rsr;

    @RequestMapping(value={"/sales_rep"})
    public String sales()
    {
        return "sales_rep/sales_rep";
    }

    @GetMapping({"/sales_rep"})
    public String sales_form(Model model)
    {
        model.addAttribute("sales_rep", new sales_rep());
        return "sales_rep/sales_rep";
    }

    @RequestMapping(value={"sal_komit"},  method = RequestMethod.POST, params={"sal_action=sal_simpan"})
    public String simpan(sales_rep sar)
    {
        this.rsr.save(sar);
        return "redirect:/sales_rep";
    }

    @RequestMapping(value={"sal_komit"}, method=RequestMethod.POST, params={"sal_action=sal_hapus"})
    public String hapus(@RequestParam("id_sales") String ids, Model model, sales_rep sar)
    {
        model.addAttribute("sales_rep", this.rsr.findById(ids));
        this.rsr.delete(sar);
        return "redirect:/sales_rep";
    }

}

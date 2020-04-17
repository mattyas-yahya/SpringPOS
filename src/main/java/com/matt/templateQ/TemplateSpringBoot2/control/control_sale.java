package com.matt.templateQ.TemplateSpringBoot2.control;


import com.matt.templateQ.TemplateSpringBoot2.model.sale;
import com.matt.templateQ.TemplateSpringBoot2.model.trans;
import com.matt.templateQ.TemplateSpringBoot2.repo.repo_barang;
import com.matt.templateQ.TemplateSpringBoot2.repo.repo_sale;
import com.matt.templateQ.TemplateSpringBoot2.repo.repo_transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class control_sale
{
    @Autowired
    repo_sale resa;
    @Autowired
    repo_barang reba;
    @Autowired
    repo_transaction retr;
    @RequestMapping(value={"/sale"})
    public String sale()
    {
        return "sale/sale";
    }

    @GetMapping({"/sale"})
    public String sale_form(Model model)
    {
        model.addAttribute("sale", new sale());
        return "sale/sale";
    }
    @RequestMapping(value={"sa_komit"},  method = RequestMethod.POST, params={"sa_action=sa_simpan"})
    public String simpan(sale sal, trans tr, @RequestParam("units") int penjualan, @RequestParam("id_brg") String id_barang)
    {
        System.out.println( " - commit proces");
        try {
            this.resa.save(sal);
            this.reba.pembelian(penjualan,id_barang);
            this.retr.save(tr);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        System.out.println(" - commit finish");
        return "redirect:/sale";
    }

    @RequestMapping(value={"sa_komit"}, method=RequestMethod.POST, params={"sa_action=sa_hapus"})
    public String hapus(@RequestParam("id_sale") String ids, Model model, sale sal)
    {
        model.addAttribute("sale", this.resa.findById(ids));
        this.resa.deleteById(ids);
        return "redirect:/sale";
    }

    @RequestMapping(value={"sa_komit"}, method=RequestMethod.POST, params={"sa_action=sa_new"})
    public String NewTx( Model model, sale sal)
    {
        this.resa.deleteAll();
        return "redirect:/sale";
    }

    @ModelAttribute
    public void getX(final Model model)
    {
        List<Long> ls = new ArrayList<>();
        ls.add(resa.cost());
        model.addAttribute("ra",ls.remove(0));

    }
    @ModelAttribute
    public void getCountItem(final Model model)
    {
        List<Long> ls = new ArrayList<>();
        ls.add(resa.count_item());
        model.addAttribute("ci",ls.remove(0));

    }


}

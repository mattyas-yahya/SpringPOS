package com.matt.templateQ.TemplateSpringBoot2.control;


import com.matt.templateQ.TemplateSpringBoot2.model.Barang;
import com.matt.templateQ.TemplateSpringBoot2.repo.repo_barang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class control_barang
{
    @Autowired
    repo_barang rb;

    @RequestMapping(value={"/barang"})
    public String barang()
    {
        return "barang/barang";
    }

    @GetMapping({"/barang"})
    public String barang_form(Model model)
    {
        model.addAttribute("barang", new Barang());
        return "barang/barang";
    }

    @RequestMapping(value={"rb_komit"},  method = RequestMethod.POST, params={"rb_action=rb_simpan"})
    public String simpan(Barang brg, @RequestParam("nama") String nama)
    {

            System.out.println("save new items");
            this.rb.save(brg);
        return "redirect:/barang";

    }

    @RequestMapping(value={"rb_komit"}, method=RequestMethod.POST, params={"rb_action=rb_hapus"})
    public String hapus(@RequestParam("id_barang") String idc, Model model, Barang brg)
    {
        model.addAttribute("barang", this.rb.findById(idc));
        this.rb.deleteById(idc);
        return "redirect:/barang";
    }


    }


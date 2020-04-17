package com.matt.templateQ.TemplateSpringBoot2.control;


import com.matt.templateQ.TemplateSpringBoot2.model.adjustment;
import com.matt.templateQ.TemplateSpringBoot2.repo.repo_adjustment;
import com.matt.templateQ.TemplateSpringBoot2.repo.repo_barang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class control_adjustment
{
    @Autowired
    repo_adjustment readj;
    @Autowired
    repo_barang rb;

    @RequestMapping(value={"/adjustment"})
    public String adjustment()
    {
        return "adjustment/adjustment";
    }

    @GetMapping({"/adjustment"})
    public String adjustment_form(Model model)
    {
        model.addAttribute("adjustment", new adjustment());
        return "adjustment/adjustment";
    }
    @RequestMapping(value={"adj_komit"},  method = RequestMethod.POST, params={"adj_action=adj_simpan"})
    public String simpan(adjustment adj, @RequestParam("jumlah") int adjs, @RequestParam("id_brg") String id_barang)
    {
        this.rb.adjustmentnin(adjs,id_barang);

        this.readj.save(adj);
        return "redirect:/adjustment";
    }
}

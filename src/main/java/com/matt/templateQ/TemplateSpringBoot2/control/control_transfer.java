package com.matt.templateQ.TemplateSpringBoot2.control;


import com.matt.templateQ.TemplateSpringBoot2.model.transfer;
import com.matt.templateQ.TemplateSpringBoot2.repo.repo_barang;
import com.matt.templateQ.TemplateSpringBoot2.repo.repo_transfer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class control_transfer
{
    @Autowired
    repo_transfer retro;
    @Autowired
    repo_barang rb;
    @RequestMapping(value={"/transfer"})
    public String transfer()
    {
        return "transfer/transfer";
    }

    @GetMapping({"/transfer"})
    public String transfer_form(Model model)
    {
        model.addAttribute("transfer", new transfer());
        return "transfer/transfer";
    }
    @RequestMapping(value={"trs_komit"},  method = RequestMethod.POST, params={"trs_action=trs_simpan"})
    public String simpan(transfer trs, @RequestParam("jumlah") int transfer, @RequestParam("id_brg") String id_barang)
    {
        this.rb.transferin(transfer,id_barang);
        this.retro.save(trs);
        return "redirect:/transfer";
    }
}

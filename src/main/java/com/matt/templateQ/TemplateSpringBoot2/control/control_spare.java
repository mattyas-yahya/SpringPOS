//package com.matt.templateQ.TemplateSpringBoot2.control;
//
//import com.example.model.spare_part;
//import com.example.repo.repo_spare;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.StoredProcedureQuery;
//import java.util.List;
//
//@Controller
//public class control_spare
//{
//    @Autowired
//    repo_spare resp;
//
//
//
//    @RequestMapping(value={"/spare_part"})
//    public String spare_part()
//    {
//        return "Spare_part/spare_part";
//    }
//
//    @GetMapping({"/spare_part"})
//    public String spare_part_form(Model model)
//    {
//        model.addAttribute("spare_part", new spare_part());
//        return "Spare_part/spare_part";
//    }
//
//    @RequestMapping(value={"s_komit"},  method = RequestMethod.POST, params={"s_action=s_simpan"})
//    public String simpan(spare_part as)
//    {
//        this.resp.save(as);
//        return "redirect:/spare_part";
//    }
//
//    @RequestMapping(value={"s_komit"}, method= RequestMethod.POST, params={"s_action=s_ubah"})
//    public String ubah(@RequestParam("id_spare_part") String idr, Model model, spare_part as)
//    {
//
//        model.addAttribute("spare_part", this.resp.findById(idr));
//        this.resp.save(as);
//        return "redirect:/spare_part";
//    }
//
//    @RequestMapping(value={"s_komit"}, method=RequestMethod.POST, params={"s_action=s_hapus"})
//    public String hapus(@RequestParam("id_spare_part") String idr,Model model, spare_part as)
//    {
//
//        model.addAttribute("spare_part", this.resp.findById(idr));
//        this.resp.delete(as);
//        return "redirect:/spare_part";
//    }
//}

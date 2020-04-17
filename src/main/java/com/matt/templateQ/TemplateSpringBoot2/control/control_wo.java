package com.matt.templateQ.TemplateSpringBoot2.control;//package com.example.control;
//
//import com.example.model.Work_order;
//import com.example.repo.repo_wo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//
//@Controller
//public class control_wo
//{
//@Autowired
//    repo_wo rew;
////    @Autowired
////repo_aud_wo reaw;
//
//
//    @RequestMapping(value={"/Work_order"})
//    public String wor()
//    {
//        return "Work_order/Work_order";
//    }
//
//    @GetMapping({"/Work_order"})
//    public String wo_form(Model model)
//    {
//        model.addAttribute("Work_order", new Work_order());
//        return "Work_order/Work_order";
//    }
//
//
//    @RequestMapping(value={"/service_request"})
//    public String scor()
//    {
//        return "Work_order//service_request";
//    }
//
//    @GetMapping({"/service_request"})
//    public String sr_form(Model model)
//    {
//        model.addAttribute("sc", new Work_order());
//        return "Work_order/service_request";
//    }
//
//
//    @RequestMapping(value={"wo_komit"},  method = RequestMethod.POST, params={"wo_action=wo_simpan"})
//    public String simpan(Work_order wo, aud_wo awo)
//    {
//        this.rew.save(wo);
//        this.reaw.save(awo);
//
//        return "redirect:/Work_order";
//    }
//
//    @RequestMapping(value={"sc_komit"},  method = RequestMethod.POST, params={"sc_action=sc_simpan"})
//    public String simpansc(Work_order wo, aud_wo awo)
//    {
//        this.rew.save(wo);
//        this.reaw.save(awo);
//
//        return "redirect:/service_request";
//    }
//
//    @RequestMapping(value={"wo_komit"}, method= RequestMethod.POST, params={"wo_action=wo_ubah"})
//    public String ubah(@RequestParam("id_wo") String idw, Model model, Work_order wo ,aud_wo awo)
//    {
//        model.addAttribute("Work_order", this.rew.findOne(idw));
//        this.rew.save(wo);
//        this.reaw.save(awo);
//        return "redirect:/Work_order";
//    }
//
//    @RequestMapping(value={"wo_komit"}, method=RequestMethod.POST, params={"wo_action=wo_hapus"})
//    public String hapus(@RequestParam("id_wo") String idw,Model model, Work_order wo)
//    {
//        model.addAttribute("Work_order", this.rew.findOne(idw));
//        this.rew.delete(wo);
//        return "redirect:/Work_order";
//    }
//
//}

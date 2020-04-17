package com.matt.templateQ.TemplateSpringBoot2.control;//package com.example.control;
//
//import com.example.model.campaign;
//import com.example.repo.repo_campaign;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import java.util.Date;
//
//@Controller
//public class control_campaign
//{
//    private static final Logger log = LoggerFactory.getLogger(control_campaign.class);
//
//    @Autowired
//    repo_campaign recam;
//
//    @RequestMapping(value={"/campaign"})
//    public String campaign()
//    {
//        return "campaign/campaign";
//    }
//
//    @GetMapping({"/campaign"})
//    public String campaign_form(Model model)
//    {
//        model.addAttribute("campaign", new campaign());
//        return "campaign/campaign";
//    }
//
//    @RequestMapping(value={"cam_komit"},  method = RequestMethod.POST, params={"cam_action=cam_simpan"})
//    public String simpan(campaign cam)
//    {
//        this.recam.save(cam);
//        return "redirect:/campaign";
//    }
//
//    @RequestMapping(value={"cam_komit"}, method=RequestMethod.POST, params={"cam_action=cam_hapus"})
//    public String hapus(@RequestParam("id_campaign") String idc, Model model, campaign cam)
//    {
//        model.addAttribute("campaign", this.recam.findOne(idc));
//        this.recam.delete(idc);
//        return "redirect:/campaign";
//    }
//
//    @Scheduled(initialDelay = 10000, fixedRate = 10000)
//    public void pri()
//{
//    Date d = new Date();
//    log.info("Time :"+d.toLocaleString());
//
//}
//
//}

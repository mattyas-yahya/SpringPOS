package com.matt.templateQ.TemplateSpringBoot2.control.rest;


import com.matt.templateQ.TemplateSpringBoot2.model.Work_order;
import com.matt.templateQ.TemplateSpringBoot2.repo.repo_wo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class control_wo_rest
{
@Autowired
repo_wo rew;

    @RequestMapping(path="/WoFail", method= RequestMethod.GET)
    public List<Work_order> getAll()
    {

        return (List)this.rew.findAll();
    }

    @RequestMapping(path="/WoAll", method= RequestMethod.GET)
    public List<Work_order> getAllWo()
    {

        return (List)this.rew.findQ();
    }
    @RequestMapping(path="/WoAllEnd", method= RequestMethod.GET)
    public List<Work_order> getAllWoEnd()
    {

        return (List)this.rew.findX();
    }
    @RequestMapping(path="/WoIncoming", method= RequestMethod.GET)
    public List<Work_order> getInWo()
    {
        return (List)this.rew.findByVerified();
    }



//    @RequestMapping(path="/Calen", method=RequestMethod.GET)
//public void getAllEmployees(HttpServletResponse response) throws JsonProcessingException, IOException
//{
//    response.setContentType("application/json;charset=UTF-8");
//response.setHeader("Cache-Control", "no-cache");
//PrintWriter out = response.getWriter();
//try{
//Work_order wr = new Work_order();
//ArrayList arrData = new ArrayList();
//Map<String, String> dataMap = new LinkedHashMap<>();
//Map<String, String> lv = new HashMap<>();
//Gson gson = new Gson();
//List wo = rew.findAll();
//Iterator itr = wo.iterator();
//while (itr.hasNext())
//{
//wr = (Work_order) itr.next();
//lv.put("id_rawat_jalan", wr.);
//lv.put("start", r.getId_pasien().getId_pasien());
//lv.put("end", r.getNok());
//lv.put("title", r.getNama());
//
//arrData.add(lv);
//dataMap.put("data",gson.toJson(arrData));
//out.println(dataMap.put("data", gson.toJson(arrData)));
//}
//}catch (HibernateException e)
//{
//  e.printStackTrace();
//}
//}
}

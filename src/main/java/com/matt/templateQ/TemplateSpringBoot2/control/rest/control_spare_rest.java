package com.matt.templateQ.TemplateSpringBoot2.control.rest;

import com.matt.templateQ.TemplateSpringBoot2.model.spare_part;
import com.matt.templateQ.TemplateSpringBoot2.repo.repo_spare;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import java.util.List;

@RestController
public class control_spare_rest {
    @Autowired
    private repo_spare resp;

    @PersistenceContext
    private EntityManager em;

    StoredProcedureQuery query;

    @RequestMapping(path = "/GetSpare", method = RequestMethod.GET)
    public List<spare_part> getAll() {
        return (List) resp.spare_Data();
    }

    @RequestMapping(path = "/GetStore", method = RequestMethod.GET)
    public List<repo_spare> getAll2() {
        StoredProcedureQuery sp = em.createNamedStoredProcedureQuery("end_blnc");
        return sp.getResultList();
    }

//    @RequestMapping(path = "/GetSpare", method = RequestMethod.GET)
//    public List<spare_part> getAll3() {
//        return (List) resp.spare_Data();
//    }
}
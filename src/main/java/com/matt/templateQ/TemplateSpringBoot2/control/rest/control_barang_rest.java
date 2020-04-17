package com.matt.templateQ.TemplateSpringBoot2.control.rest;

import com.matt.templateQ.TemplateSpringBoot2.model.Barang;
import com.matt.templateQ.TemplateSpringBoot2.repo.repo_barang;
import com.matt.templateQ.TemplateSpringBoot2.repo.repo_barang_dto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Vector;

@RestController
public class control_barang_rest
{
@Autowired
repo_barang rb;
    @Autowired
    repo_barang_dto rbd;


    @RequestMapping(path="/BarangAll", method= RequestMethod.GET)
    public List<Barang> getAll()
    {
        return (List)this.rb.stok_barang();
    }

    @RequestMapping(path="/BarangLaris", method= RequestMethod.GET)
    public Vector getLaris()
    {
        return this.rb.barang_laris();
    }

    @RequestMapping(path="/BarangLarisDto", method= RequestMethod.GET)
    public Vector getLarisDto()
    {
        return this.rbd.barang_laris_dto();
    }

    @RequestMapping(path="/BarangStok", method= RequestMethod.GET)
    public List<Barang> getAllStok()
    {
        return (List)this.rb.stok_barang();
    }

    @RequestMapping(path="/MinStok", method= RequestMethod.GET)
    public List<Barang> getMinStok()
    {

      return (List)this.rb.Stok_min();


    }

}

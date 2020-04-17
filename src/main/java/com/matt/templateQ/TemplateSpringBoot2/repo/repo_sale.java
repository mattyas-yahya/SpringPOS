package com.matt.templateQ.TemplateSpringBoot2.repo;


import com.matt.templateQ.TemplateSpringBoot2.model.sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Vector;

public interface repo_sale extends JpaRepository<sale,String> {

    String Q="SELECT sum(total) FROM sale ";
    @Query(value = Q,nativeQuery = true)
    Long cost();

    String Q1="SELECT sum(units) FROM sale ";
    @Query(value = Q1,nativeQuery = true)
    Long count_item();

    String Q2="select tanggal,nma,hrga_jl,units,(hrga_jl*units) as total from sale\n";
    @Query(value = Q2,nativeQuery = true)
    Vector AllSale();

}

package com.matt.templateQ.TemplateSpringBoot2.repo;

import com.matt.templateQ.TemplateSpringBoot2.model.sales_rep;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface repo_sales_rep extends JpaRepository<sales_rep,String>
{

    String Q=" Select max(id_sales)sales_terbanyak from crm.contact ";
    @Query(value = Q,nativeQuery = true)
    int max_sales();
}

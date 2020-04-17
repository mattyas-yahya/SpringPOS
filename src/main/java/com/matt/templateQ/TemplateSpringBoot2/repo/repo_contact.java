package com.matt.templateQ.TemplateSpringBoot2.repo;

import com.matt.templateQ.TemplateSpringBoot2.model.contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface repo_contact extends JpaRepository<contact,String>
{
    String Q="SELECT count(id_contact)as c_id FROM contact ";
    @Query(value = Q,nativeQuery = true)
    int count_id();
}

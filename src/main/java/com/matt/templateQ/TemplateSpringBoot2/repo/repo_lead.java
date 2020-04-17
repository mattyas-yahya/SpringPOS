package com.matt.templateQ.TemplateSpringBoot2.repo;


import com.matt.templateQ.TemplateSpringBoot2.model.lead;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repo_lead  extends JpaRepository<lead,String> {
}

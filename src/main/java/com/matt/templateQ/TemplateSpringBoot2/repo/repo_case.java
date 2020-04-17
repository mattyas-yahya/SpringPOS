package com.matt.templateQ.TemplateSpringBoot2.repo;


import com.matt.templateQ.TemplateSpringBoot2.model.cases;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repo_case extends JpaRepository<cases,String> {
}

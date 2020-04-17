package com.matt.templateQ.TemplateSpringBoot2.repo;

import com.matt.templateQ.TemplateSpringBoot2.model.trans;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repo_transaction extends JpaRepository<trans,String> {
}

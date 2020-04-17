package com.matt.templateQ.TemplateSpringBoot2.control;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.matt.templateQ.TemplateSpringBoot2.model.adjustment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
@Controller
//@RequestMapping("/index")
public class control_index
{
    @GetMapping({"/index"})
    public String adjustment_form()
    {
        return "index/index";
    }
}


package com.matt.templateQ.TemplateSpringBoot2.model;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

public class task
{
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "id_task", unique = true, nullable = false)
    String id_task;//92019201
    @JoinColumn(name = "id_sales")
    @ManyToOne
    sales_rep id_sales ;

    String task_ref;//TSK_002

    String to_do_desc;// follow up email ku bos

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name="to_do_date")
    @Temporal(TemporalType.DATE)
    private Date to_do_date;//21-22-2019

    String contact_name; ///pak agung
    String task_status; //pending,complet,cancel
    String sales_rep;
}

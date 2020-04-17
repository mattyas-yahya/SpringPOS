package com.matt.templateQ.TemplateSpringBoot2.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;


import javax.persistence.*;
@Getter
@Setter
@NoArgsConstructor
@Entity

public class contact
{
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "id_contact", unique = true, nullable = false)
    String id_contact;//9201219201
    @JoinColumn(name = "id_sales")
    @ManyToOne
    sales_rep id_sales;
    String sales_name;
    String contact_name;//pak agung
    String company;//cv baru bangkit
    String industry;// bidang pakan
    String phone_no;
    String country;
    String city;
    String Street;
}

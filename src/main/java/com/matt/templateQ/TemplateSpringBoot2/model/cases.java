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
public class cases
{
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "id_case", unique = true, nullable = false)
String id_case;
    @JoinColumn(name = "id_contact")
    @ManyToOne
    contact id_contact;
    String sales_name;
    String contact_name;
    String company;
    String industry;
    String phone_no;

    //Additional Information
    String status;//none,new case,pending,waiting for customer response,closed
    String case_origin; //none,email,phone,web,sms,other
    String priority;//medium,high,critical,low,none
    String case_type;//none,problem,feature request,question
    String case_reason;//

}

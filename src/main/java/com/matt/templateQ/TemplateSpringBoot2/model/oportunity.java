package com.matt.templateQ.TemplateSpringBoot2.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class oportunity
{
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "id_oportunity", unique = true, nullable = false)
String id_oportunity;
    @JoinColumn(name = "id_contact")
    @ManyToOne
    contact id_contact;
    String oportunity_name;//baglife(sample)
    String sales_name;
    String contact_name;
    String company;
    String industry;
    String phone_no;

    String Type;//Exixting Bussines,New Bussiness, none
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name="close_date")
    @Temporal(TemporalType.DATE)
    private Date close_date;

    String Stage; //qualification,meeting schedule,proposal/price quote,negotiation,closed won,closed lost
    String Probability; //% 100
    int Amount;//45000
    String lead_source;//web,social,adv,other
    String note;

}

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
public class lead
{
@Id
@GeneratedValue(generator = "uuid")
@GenericGenerator(name = "uuid", strategy = "uuid2")
@Column(name = "id_leads", unique = true, nullable = false)
String id_leads;

@JoinColumn(name = "id_contact")
@ManyToOne
contact id_contact;

String sales_name;
String contact_name;
String company;
String industry;
String phone_no;

String lead_status;//new,contacted,working,qualified,unqualified
String note;
String lead_source;//web,social,adv,other
int annual_revenue;//239000
    @Lob
    private Byte[] image;
}

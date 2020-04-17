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

public class campaign
{
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "id_campaign", unique = true, nullable = false)
String id_campaign;
String campaign_name;
String status;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
@Column(name="started", nullable=false)
@Temporal(TemporalType.DATE)
private Date started;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name="ended", nullable=false)
    @Temporal(TemporalType.DATE)
    private Date ended;
}

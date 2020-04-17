package com.matt.templateQ.TemplateSpringBoot2.model;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@Entity
@NamedQueries({@NamedQuery(name = "Wo.ne", query = "SELECT i FROM Work_order i WHERE i.status_pekerjaan != :status")})
public class Work_order
{
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "id_wo", unique = true, nullable = false)
    @LastModifiedDate
    String id_wo;
//    @JoinColumn(name = "id_asset")
//    @ManyToOne
//    private Asset id_asset;
//    @JoinColumn(name = "id_pm")
//    @ManyToOne
//    private PreventiveMaintenance id_pm;
//    @JoinColumn(name = "id_dept")
//    @ManyToOne
//    Departemen id_dept ;
    Long kode_wo;
/////////////////// milik department/////////////////
    String nama_dept;
/////////////////// milik department/////////////////
@Lob
    @Column(columnDefinition ="LONGTEXT",length = 100000)
    String title;
/////////////////// milik asset/////////////////
    String kode_asset;
    String lokasi;
////////////////////////////////////////////////
    String status_pekerjaan;
    String prioritas;
    @Size( max=9000)
    String action;
    String jenis_pekerjaan;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name="pembuatan", nullable=false)
    @Temporal(TemporalType.DATE)
    private Date pembuatan;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name="start")
    @Temporal(TemporalType.DATE)
    private Date start;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name="end")
    @Temporal(TemporalType.DATE)
    private Date end;
    private int uptime;
    private int downtime;
}

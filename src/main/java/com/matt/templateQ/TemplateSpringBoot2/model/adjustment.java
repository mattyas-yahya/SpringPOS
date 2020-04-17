package com.matt.templateQ.TemplateSpringBoot2.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.awt.*;
import java.util.Date;

@Getter
@Setter
@Entity
public class adjustment
{
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "id_adjustment", unique = true, nullable = false)
    String id_adjustment;
  @JoinColumn(name = "id_barang")
  @ManyToOne
  Barang id_brg;
  String kode_barang;
  String nama;
    int jumlah;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name="tanggal", nullable=false)
    @Temporal(TemporalType.DATE)
    private Date tanggal;
    @Size(min=0, max=100)
    String note;




}

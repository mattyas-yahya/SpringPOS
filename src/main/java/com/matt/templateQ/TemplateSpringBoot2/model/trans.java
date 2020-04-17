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

public class trans
{
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "id_transaction", unique = true, nullable = false)
    String id_transaction;

    @JoinColumn(name = "id_barang")
    @ManyToOne
    Barang id_brg;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name="tanggal", nullable=false)
    @Temporal(TemporalType.DATE)
    private Date tanggal;
    String nma;
    int hrga_jl;
    int units;
    int total;
}
//SELECT
//        tanggal as time_sec,
//        hrga_jl as value,
//        nma as metric
//        FROM trans
//        WHERE $__timeFilter(tanggal)
//        ORDER BYtanggal ASC
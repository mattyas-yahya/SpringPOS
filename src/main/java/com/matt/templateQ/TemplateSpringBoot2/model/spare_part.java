package com.matt.templateQ.TemplateSpringBoot2.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(name = "end_blnc",
                procedureName = "end_blnc",
                resultClasses = spare_part.class)
})
 //@NamedQuery(name = "spare_part.findByJoin", query = "SELECT a.id_spare_part, b.kode_asset, a.kode_spare_part, a.nama_spare_part, a.tgl_beli_spare, a.vendor,b.id_asset, b.garansi, a.harga_beli, a.serial, a.stok, a.consume, sum(a.stok-a.consume) as end_balance FROM spare_part a join asset b where a.id_asset=b.id_asset group by a.id_spare_part")
@Table(name = "Spare_part")
public class spare_part
{
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "id_spare_part", unique = true, nullable = false)
    String id_spare_part;

//    @JoinColumn(name = "id_asset")
//    @ManyToOne
//    private Asset id_asset;
//
//    @JoinColumn(name = "id_safety")
//    @ManyToOne
//    private Safety id_safety;


    @NotEmpty
    @Size(min=1, max=30)
    String kode_spare_part;

    @NotEmpty
    private String lokasi;

    @NotEmpty
    @Size(min=1, max=30)
    String kode_asset;

    @NotEmpty
    @Size(min=1, max=30)
    String nama_spare_part;


    String referensi;

    @NotEmpty
    @Size(min=1, max=30)
    String vendor;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name="tgl_beli_spare", nullable=false)
    @Temporal(TemporalType.DATE)
    private Date tgl_beli_spare;

    private double harga_beli;
    @NotEmpty
    private String garansi;
    @NotEmpty
    private String serial;
    private int consume;
    private int stok;
    private int end_balance;
}


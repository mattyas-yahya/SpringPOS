package com.matt.templateQ.TemplateSpringBoot2.repo;

import com.matt.templateQ.TemplateSpringBoot2.model.adjustment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface repo_adjustment extends JpaRepository<adjustment,String>
{
    String Q1="SELECT a.id_adjustment,b.id_barang,a.tanggal,b.nama,b.kode_barang,a.jumlah,a.note FROM adjustment a join barang b where b.id_barang=a.id_barang";
    @Query(value =Q1 ,nativeQuery = true)
    List<adjustment> adjustment_barang();
}

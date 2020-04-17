package com.matt.templateQ.TemplateSpringBoot2.repo;


import com.matt.templateQ.TemplateSpringBoot2.model.spare_part;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface repo_spare extends JpaRepository<spare_part,String>
{

//String Q="SELECT a.id_spare_part,b.kode_asset,a.kode_spare_part,a.nama_spare_part,a.tgl_beli_spare,a.vendor,b.id_asset,b.garansi,a.harga_beli,a.serial,a.stok,a.consume,sum(a.stok-a.consume)as end_balance FROM spare_part a join asset b where a.id_asset=b.id_asset  group by a.id_spare_part;";
//    String Q="SELECT a.id_spare_part,a.lokasi, b.kode_asset, a.kode_spare_part, a.nama_spare_part, a.tgl_beli_spare, a.vendor,b.id_asset, b.garansi, a.harga_beli, a.serial, a.stok, a.consume, (a.stok-a.consume) as end_balance FROM spare_part a join asset b where a.id_asset=b.id_asset group by a.id_spare_part";
   String Q="SELECT a.id_spare_part,c.id_safety,a.lokasi, b.kode_asset, a.kode_spare_part, a.nama_spare_part,c.referensi, a.tgl_beli_spare, a.vendor,b.id_asset, b.garansi, a.harga_beli, a.serial, a.stok, a.consume, (a.stok-a.consume) as end_balance \n" +
        "FROM spare_part a , asset b , safety c\n" +
        "where a.id_asset=b.id_asset and c.id_safety=a.id_safety\n" +
        "group by a.id_spare_part";
    @Query(value =Q ,nativeQuery = true)
    List<spare_part> spare_Data();

    String Q4="SELECT a.id_spare_part,a.lokasi, b.kode_asset, a.kode_spare_part, a.nama_spare_part, a.tgl_beli_spare, a.vendor,b.id_asset, b.garansi, a.harga_beli, a.serial, a.stok, a.consume, (a.stok-a.consume) as end_balance  FROM spare_part a join asset b where a.id_asset=b.id_asset group by a.id_spare_part";
    @Query(value =Q4 ,nativeQuery = true)
    List<spare_part> spare_Data_is_zero();

    String Q1="SELECT * FROM spare_part where kode_spare_part = ?1";
    String Q2="SELECT * FROM work_order where kode_asset = ?1";
    @Query(value =Q1 ,nativeQuery = true)
    List<spare_part> findbykode(String kode_spare_part);

    String Q3="update spare_part set consume =? where id_spare_part =?";
    @Modifying
    @Transactional
    @Query(value =Q3 ,nativeQuery = true)
    int pemakaian(int consume, String id_spare_part);
}

package com.matt.templateQ.TemplateSpringBoot2.repo;


import com.matt.templateQ.TemplateSpringBoot2.model.Barang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Vector;

public interface repo_barang extends JpaRepository<Barang,String>
{
    String Q3="update barang set penjualan=penjualan+? where id_barang =?";
    @Modifying
    @Transactional
    @Query(value =Q3 ,nativeQuery = true)
    int pembelian(int penjualan, String id_barang);


     String Q4="SELECT id_barang,kode_barang,nama,jenis,harga_beli,harga_jual,(harga_jual-harga_beli)as margin,stok_awal,transfer,adjustment,penjualan,(stok_awal+transfer+adjustment-penjualan)as stok_akhir,uom,barang_laris FROM barang;";
   // String Q4="SELECT id_barang,nama,jenis,harga_beli,harga_jual,stok_awal,transfer,penjualan,(stok_awal+transfer-penjualan)as stok_akhir FROM pos.barang";
    @Query(value =Q4 ,nativeQuery = true)
    List<Barang> stok_barang();

    String Q2="update barang set transfer=transfer+? where id_barang =?";
    @Modifying
    @Transactional
    @Query(value =Q2 ,nativeQuery = true)
    int transferin(int transfer, String id_barang);

    String Q5="update barang set adjustment=? where id_barang =?";
    @Modifying
    @Transactional
    @Query(value =Q5 ,nativeQuery = true)
    int adjustmentnin(int adjustment, String id_barang);

String Q1="select nama as nama,max(penjualan) as barang_laris from barang group by id_barang limit 5";
    @Query(value = Q1,nativeQuery = true)
    Vector barang_laris();

    String Q6="select nama,max(penjualan) as penjulan_tertinggi from barang group by id_barang limit 1";
    @Query(value = Q6,nativeQuery = true)
    List barang_max();

    String Q7="select nama,avg(penjualan) as penjulan_tertinggi from barang group by id_barang limit 1";
    @Query(value = Q7,nativeQuery = true)
    Vector barang_avg();

    String Q8="select nama,min(penjualan) as penjulan_tertinggi from barang group by id_barang limit 1";
    @Query(value = Q8,nativeQuery = true)
    Vector barang_min();

    String Q9="SELECT id_barang,nama,(stok_awal+transfer+adjustment-penjualan)as stok_akhir FROM barang having stok_akhir <10";
    @Query(value = Q9,nativeQuery = true)
    Vector Stok_min();

}

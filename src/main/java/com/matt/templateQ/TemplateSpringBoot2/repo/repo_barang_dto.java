package com.matt.templateQ.TemplateSpringBoot2.repo;


import com.matt.templateQ.TemplateSpringBoot2.model.model.dto.barang_dto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Vector;

public interface repo_barang_dto extends JpaRepository<barang_dto,String>
{
    String Q9="select  nama as nama,max(penjualan) as barang_laris from barang group by id_barang limit 5";
    @Query(value = Q9,nativeQuery = true)
    Vector barang_laris_dto();

}

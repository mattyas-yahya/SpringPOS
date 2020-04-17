package com.matt.templateQ.TemplateSpringBoot2.model.model.dto;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@DynamicUpdate

@Entity
public class barang_dto
{
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "id_barang_dto", unique = true, nullable = false)
    private
    String id_barang_dto;
    @Column(name = "nama")
    private
    String nama;
    @Column(name = "barang_laris")
    private
    int barang_laris;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getBarang_laris() {
        return barang_laris;
    }

    public void setBarang_laris(int barang_laris) {
        this.barang_laris = barang_laris;
    }

    public String getId_barang_dto() {
        return id_barang_dto;
    }

    public void setId_barang_dto(String id_barang_dto) {
        this.id_barang_dto = id_barang_dto;
    }
}

package com.matt.templateQ.TemplateSpringBoot2.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@Entity
@DynamicUpdate
public class Barang
{
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "id_barang", unique = true, nullable = false)
String id_barang;
  @Column(unique = true)
  private String kode_barang;
    @Column(unique = true)
    private String nama;
String jenis;
int harga_beli;
int harga_jual;
int stok_awal;
int transfer;
int penjualan;
int adjustment;
int stok_akhir;
    @Column(name = "barang_laris")
    int barang_laris;
    String uom;
    int margin;
}

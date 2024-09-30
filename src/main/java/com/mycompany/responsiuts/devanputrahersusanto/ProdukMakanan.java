/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsiuts.devanputrahersusanto;

/**
 *
 * @author asus1
 */
import java.time.LocalDate;

public class ProdukMakanan extends Produk {
    private LocalDate tanggalKadaluarsa;
    public ProdukMakanan(String namaProduk, double harga, LocalDate tanggalKadaluarsa) {
        super(namaProduk, harga);
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }
    public LocalDate getTanggalKadaluarsa() {
        return tanggalKadaluarsa;
    }
    public void setTanggalKadaluarsa(LocalDate tanggalKadaluarsa) {
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tanggal Kadaluarsa: " + tanggalKadaluarsa);
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsiuts.devanputrahersusanto;

import java.time.LocalDate;

/**
 *
 * @author asus1
 */
public class ResponsiUTSDevanPutraHersusanto {
    public static void main(String[] args) {
        Produk produk1 = new ProdukElektronik("Laptop", 15000000, 2);
        Produk produk2 = new ProdukMakanan("Snack", 15000, LocalDate.of(2023, 12, 30));
        produk1.tampilkanInfo();
        System.out.println();
        produk2.tampilkanInfo();
        Pegawai pegawai1 = new PegawaiTetap("Devan Putra Hersusanto", 5000000, 1000000);
        Pegawai pegawai2 = new PegawaiKontrak("Andi", 3000000, 12);
        pegawai1.tampilkanInfo();
        System.out.println();
        pegawai2.tampilkanInfo();
    }
}
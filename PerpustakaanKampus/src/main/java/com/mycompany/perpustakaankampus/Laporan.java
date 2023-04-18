/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perpustakaankampus;

/**
 *
 * @author User
 */
public class Laporan {
    public Buku dataBuku;
    public String kondisiBuku;
    public int jmlPinjam;
    
    public Laporan(Buku dataBuku, String kondisiBuku, int jmlPinjam){
        this.dataBuku = dataBuku;
        this.kondisiBuku = kondisiBuku;
        this.jmlPinjam = 0;
     }
    
    public Buku getDataBuku(){
      return dataBuku;
    }
  
    public String getKondisiBuku(){
      return kondisiBuku;
    }
    
    public int getJmlPinjam(){
      return jmlPinjam;
    }
  
    // edit laporan
    public void editLaporan(Buku dataBuku, String kondisiBuku, int jmlPinjam){
      this.dataBuku = dataBuku;
      this.kondisiBuku = kondisiBuku;
      this.jmlPinjam = jmlPinjam;
    }
  
    public void printLaporan(){
      System.out.println("Kode Buku : " + dataBuku.getKodeBuku() + " dengan judul " + dataBuku.getJudulBuku() + " memiliki stok " + dataBuku.stokBuku + " frekuensi pinjam dalam 1 bulan : " + this.jmlPinjam + " dan kondisi buku dalam keadaan " + this.kondisiBuku );
    }
}

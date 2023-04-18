/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perpustakaankampus;

/**
 *
 * @author ACER
 */
public class Buku {
    private int kodeBuku;
    private String judulBuku;
    private String author;
    private String kategoriBuku;
    private int tahunTerbit;
    public int stokBuku;
    private String sinopsis;
    
    public Buku() {};
    
    public Buku(int kodeBuku, String judulBuku, String author, String kategoriBuku, int tahunTerbit, int stokBuku){
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.author = author;
        this.kategoriBuku = kategoriBuku;
        this.tahunTerbit = tahunTerbit;
        this.stokBuku = stokBuku;
    };
    
    public Buku(int kodeBuku, String judulBuku, String author, String kategoriBuku, int tahunTerbit, int stokBuku, String sinopsis){
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.author = author;
        this.kategoriBuku = kategoriBuku;
        this.tahunTerbit = tahunTerbit;
        this.stokBuku = stokBuku;
        this.sinopsis = sinopsis;
    };

    /**
     * @return the kodeBuku
     */
    public int getKodeBuku() {
        return kodeBuku;
    }

    /**
     * @return the judulBuku
     */
    public String getJudulBuku() {
        return judulBuku;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @return the tahunTerbit
     */
    public int getTahunTerbit() {
        return tahunTerbit;
    }

    /**
     * @return the kategoriBuku
     */
    public String getKategoriBuku() {
        return kategoriBuku;
    }

    /**
     * @return the stokBuku
     */
    public int getStokBuku() {
        return stokBuku;
    }
    
    
}

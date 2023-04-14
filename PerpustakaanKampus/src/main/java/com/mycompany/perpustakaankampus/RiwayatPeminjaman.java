/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perpustakaankampus;

/**
 *
 * @author User
 */
import SistemPerpustakaan.Perpustakaan;
import SistemPerpustakaan.Rak;
import SistemPerpustakaan.Buku;

public class RiwayatPeminjaman {
    private Buku buku;
    private String tanggalPinjam;
    private String batasPinjam;
    private String extend;
    public RiwayatPeminjaman() {}
    public RiwayatPeminjaman(Buku buku, String tanggalPinjam, String extend) {
        this.buku = buku;
        this.tanggalPinjam = tanggalPinjam;
        this.batasPinjam = "";
        this.extend = "";
    }

    /**
     * @return the buku
     */
    public Buku getBuku() {
        return buku;
    }

    /**
     * @return the tanggalPinjam
     */
    public String getTanggalPinjam() {
        return tanggalPinjam;
    }

    /**
     * @return the batasPinjam
     */
    public String getBatasPinjam() {
        return batasPinjam;
    }

    /**
     * @return the extend
     */
    public String getExtend() {
        return extend;
    }
    
}

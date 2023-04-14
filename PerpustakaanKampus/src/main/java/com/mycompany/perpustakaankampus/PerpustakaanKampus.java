/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.perpustakaankampus;

/**
 *
 * @author User
 */
import SistemPerpustakaan.Perpustakaan;
import SistemPerpustakaan.Rak;
import SistemPerpustakaan.Buku;

public class PerpustakaanKampus {

    public static void main(String[] args) {
        //Terdapat database yang sudah dibuat
        Perpustakaan lib = new Perpustakaan();
        DataLogin login = new DataLogin();
        
        //database login
        Mahasiswa mhs1 = new Mahasiswa("herlin", "herlin123", "herlin priatna", "1302213018", lib, login);
        Mahasiswa mhs2 = new Mahasiswa("regy", "regy117", "regy renanda","1302213117",lib, login);                
        Mahasiswa mhs3 = new Mahasiswa("kiwil", "syahran123", "syahran syahputra", "1302210021",lib, login);
        
        Pustakawan p1 = new Pustakawan("regyyy", "regy1234", "regy rahman", "1302213018", lib, login);
        
        login.addAkunMahasiswa(mhs1);
        login.addAkunMahasiswa(mhs2);
        login.addAkunMahasiswa(mhs3);
        login.addAkunPustakawan(p1);
        
        //database perpustakaan
        Buku buku1 = new Buku(110001, "Pengantar Teknologi Informasi", "Tata Sutabri", "Teknologi", 2014, 2);
        Buku buku2 = new Buku(110002, "Pengantar Membuat Robot", "M. Ibnu Malik", "Teknologi", 2006, 4);
        Buku buku3 = new Buku(110003, "Pemrograman Web Membuat Sistem Informasi Akademik Sekolah Dengan PHP-MYSQL & Dreamweaver", "Bunafit Nugroho", "Teknologi", 2014, 4);
        Buku buku4 = new Buku(110004, "Panduan Praktis Sistem Kendali Digital", "Azwardi Dan Cekmas Cekdin", "Teknologi", 2015, 2);
        Buku buku5 = new Buku(110005, "Pengantar Artificial Intellengece", "Budi Hartono", "Teknologi", 2020, 3);
        Buku[] bukuTeknologi = {buku1,buku2,buku3,buku4,buku5};
        Rak teknologi = new Rak("Teknologi","11");
        teknologi.tambahBuku(bukuTeknologi);
        
        lib.tambahRak(teknologi);
        
        Buku buku6 = new Buku(120001, "PENDIDIKAN PASCAKONFLIK ; Pendidikan Multikultural Berbasis Konseling Budaya Masyarakat Maluku Utara", "Dr. M. Tahir Sapsuha","Pendidikan", 2013, 3);
        Buku buku7 = new Buku(120002, "Menulis Itu Mudah ; Panduan Praktis Menjadi Penulis Handal", "Sukino", "Pendidikan", 2010, 3);
        Buku buku8 = new Buku(120003, "Langkah Mudah Belajar Kalkulus For IT(Khusus P. Jawa)", "Sudaryono, Untung Rahardja, Edi S. Mulyanta", "Pendidikan", 2012, 5);
        Buku buku9 = new Buku(120004, "DESAIN PEMBELAJARAN BERBASIS PENDIDIKAN KARAKTER", "Asmaun Sahlan & Angga Teguh Prastyo", "Pendidikan", 2016, 3);
        Buku buku10 = new Buku(120005, "Belajar mikrokontroler AT89C51/52/55", "Agfianto EP", "Pendidikan", 2010, 4);
        Buku[] bukuPendidikan = {buku6,buku7,buku8,buku9,buku10};
        Rak pendidikan = new Rak("Pendidikan","12");
        pendidikan.tambahBuku(bukuPendidikan);
        
        lib.tambahRak(pendidikan);
        
        //mulai sebagai guest
        Guest g1 = new Guest(lib,login);
        g1.menuUtama();
        System.out.println("Akhir program");
    }
}

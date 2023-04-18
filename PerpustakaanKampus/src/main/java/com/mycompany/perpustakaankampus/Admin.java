/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perpustakaankampus;

/**
 *
 * @author ACER
 */


import java.util.*;
import java.util.Scanner;

<<<<<<< Updated upstream:PerpustakaanKampus/src/main/java/com/mycompany/perpustakaankampus/Pustakawan.java
public class Admin extends Guest{
=======
public class Admin extends Guest implements Logout{
>>>>>>> Stashed changes:PerpustakaanKampus/src/main/java/com/mycompany/perpustakaankampus/Admin.java
    private String username;
    private String password;
    private String nama;
    private String kodePustakawan;
    
    public Admin(){}
    
    public Admin(String username, String password, String nama, String kodePustakawan, Perpustakaan lib, DataLogin login){
        super(lib,login);
        this.username = username;
        this.password = password;
        this.nama = nama;
        this.kodePustakawan = kodePustakawan;
    }
    
    public void menuUtama() {
        System.out.println("\n===============HOME===============");
        System.out.println("Login as "+nama+" (Admin)");
        System.out.println("1. Login");
        System.out.println("2. List semua buku");
        System.out.println("3. Peminjaman buku");
        System.out.println("4. Pengembalian buku");
        System.out.println("5. Tambah buku");
        System.out.println("6. Hapus buku");
        System.out.println("0. Logout");
        System.out.print("Ketik nomor pilihan : ");
        String pilihan = input.nextLine();
        //jika pilih 1 maka login, 2 maka lihat list
        if (pilihan.equals("1")) {
            login();
        } else if (pilihan.equals("2")) {
            menuList();
        } else if (pilihan.equals("3")) {
            peminjamanBuku();
        } else if (pilihan.equals("4")) {
            pengembalianBuku();
        } else if (pilihan.equals("5")) {
            menambahBuku();
        } else if (pilihan.equals("0")) {
            logoutAkun();
        }
    }
    
    public void peminjamanBuku() {
        System.out.println("\n===============PEMINJAMAN BUKU===============");
        System.out.print("Username mahasiswa : ");
        String username = input.nextLine();
        
        System.out.print("Kode buku : ");
        int kode = input.nextInt();
        
        Rak rak = lib.getDaftarRak().get(0);
        Buku buku = buku = rak.getDaftarBuku().get(0);
        boolean found = false;
        for (int i = 0; i < lib.getDaftarRak().size() && !found; i++) {
            rak = lib.getDaftarRak().get(i);
            for (int j = 0; j < rak.getDaftarBuku().size() && !found; j++) {
                buku = rak.getDaftarBuku().get(j);
                found = kode == buku.getKodeBuku();
            }
        }
        rak.kurangStokBuku(kode);
        
        System.out.print("Tanggal pinjam (dd-MMM-yyyy) : ");
        String inputTanggal = input.nextLine();
        String extend = "halo";
        RiwayatPeminjaman riwayat = new RiwayatPeminjaman(buku,inputTanggal, extend);
        Mahasiswa mhs = getVerifLogin().cariMahasiswa(username);
        mhs.listRiwayat.add(riwayat);
        System.out.print("Berhasil meminjam buku");
        for (int i = 0; i < mhs.listRiwayat.size(); i++) {
                Buku bukuPinjam = mhs.listRiwayat.get(i).getBuku();
                System.out.println(bukuPinjam.getKodeBuku()+" || "+bukuPinjam.getJudulBuku()+" || "+bukuPinjam.getKategoriBuku()+" || "+mhs.listRiwayat.get(i).getTanggalPinjam());
            }
        menuUtama();
    }
    
    public void pengembalianBuku() {
        System.out.println("\n===============PENGEMBALIAN BUKU===============");
        System.out.print("Username mahasiswa : ");
        String username = input.nextLine();
        
        System.out.print("Kode buku : ");
        int kode = input.nextInt();
        
        Rak rak = lib.getDaftarRak().get(0);
        Buku buku = buku = rak.getDaftarBuku().get(0);
        boolean found = false;
        for (int i = 0; i < lib.getDaftarRak().size() && !found; i++) {
            rak = lib.getDaftarRak().get(i);
            for (int j = 0; j < rak.getDaftarBuku().size() && !found; j++) {
                buku = rak.getDaftarBuku().get(j);
                found = kode == buku.getKodeBuku();
            }
        }
        rak.kurangStokBuku(kode);

        Mahasiswa mhs = getVerifLogin().cariMahasiswa(username);
        
        int j = 0;
        while (j < mhs.listRiwayat.size() && !found) {
            found = mhs.listRiwayat.get(j).getBuku() == buku;
            j++;
        }
        
        mhs.listRiwayat.remove(j-1);
        System.out.print("Berhasil meminjam buku");
        for (int i = 0; i < mhs.listRiwayat.size(); i++) {
                Buku bukuPinjam = mhs.listRiwayat.get(i).getBuku();
                System.out.println(bukuPinjam.getKodeBuku()+" || "+bukuPinjam.getJudulBuku()+" || "+bukuPinjam.getKategoriBuku()+" || "+mhs.listRiwayat.get(i).getTanggalPinjam());
            }
        menuUtama();
    }
    
    public void menambahBuku(){
        System.out.println("\n===============MENAMBAHKAN BUKU===============");
        int i = 1;
        while (i == 1) {
            System.out.print("Kode buku\t: ");
            int kodeBuku = input.nextInt();
            System.out.print("Judul buku\t: ");
            String judulBuku = input.nextLine();
            System.out.print("Author\t\t: ");
            String author = input.nextLine();
            System.out.print("Kategori buku\t: ");
            String kategoriBuku = input.nextLine();
            System.out.print("Tahun terbit\t: ");
            int tahunTerbit = input.nextInt();
            System.out.print("Stok buku\t: ");
            int stokBuku = input.nextInt();
            Buku buku = new Buku(kodeBuku, judulBuku, author, kategoriBuku, tahunTerbit, stokBuku);
            
            Rak rak = lib.getDaftarRak().get(0);
            boolean found = false;
            for (int j = 0; j < lib.getDaftarRak().size() && !found; j++) {
                found = buku.getKategoriBuku().equals(lib.getDaftarRak().get(i).getKategoriRak());
            }
            if (found) {
                Buku[] arrBuku = {buku};
                rak.tambahBuku(arrBuku);
                System.out.println("Berhasil menambahkan buku");
            } else {
                System.out.println("Tidak ada rak yang sesuai dengan kategori");
            }
            System.out.print("Tambahkan buku lagi?");
            System.out.print("1. Iya");
            System.out.print("0. Tidak");
            i = input.nextInt();
        }
        menuUtama();
    }
    
    public void menghapusBuku(){
        
    }
    
    public void logoutAkun() {
        super.menuUtama();
    }
    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @return the kodePustakawan
     */
    public String getKodePustakawan() {
        return kodePustakawan;
    }
    
}

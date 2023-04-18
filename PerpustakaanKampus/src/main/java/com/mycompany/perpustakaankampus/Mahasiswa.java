/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perpustakaankampus;

/**
 *
 * @author User
 */
import java.util.*;
import java.util.Scanner;

public class Mahasiswa extends Guest implements Logout {
    Scanner input = new Scanner(System.in);
    private String username;
    private String password;
    private String nama;
    private String nim;
    public List<RiwayatPeminjaman> listRiwayat;
    //constructor
    public Mahasiswa() {}
    public Mahasiswa(String username, String password, String nama, String nim, Perpustakaan lib, DataLogin login) {
        super(lib,login);
        this.username = username;
        this.password = password;
        this.nama = nama;
        this.nim = nim;
        listRiwayat = new ArrayList();
    }
    public void menuUtama() {
        System.out.println("\n===============HOME===============");
        System.out.println("Login as "+nama+" (Mahasiswa)");
        System.out.println("1. Login");
        System.out.println("2. List semua buku");
        System.out.println("3. Riwayat peminjaman");
        System.out.println("0. Logout");
        System.out.print("Ketik nomor pilihan : ");
        String pilihan = input.nextLine();
        //jika pilih 1 maka login, 2 maka lihat list
        if (pilihan.equals("1")) {
            login();
        } else if (pilihan.equals("2")) {
            menuList();
        } else if (pilihan.equals("3")) {
            melihatRiwayat();
        } else if (pilihan.equals("0")) {
            logoutAkun();
        }
    }
    //menampilkan menu riwayat peminjaman
    public void melihatRiwayat() {
        System.out.println("\n===============RIWAYAT===============");
        if (listRiwayat.size() > 0) {
            for (int i = 0; i < listRiwayat.size(); i++) {
                Buku buku = listRiwayat.get(i).getBuku();
                System.out.println(buku.getKodeBuku()+" || "+buku.getJudulBuku()+" || "+buku.getKategoriBuku()+" || "+listRiwayat.get(i).getTanggalPinjam());
            }
            String pilihan = "1";
            while (!pilihan.equals(0)) {
                System.out.println("\n1. Perpanjang peminjaman");
                System.out.println("0. Kembali ke menu sebelumnya");
                System.out.print("Ketik nomor pilihan : ");
                pilihan = input.nextLine();
                if (pilihan.equals("1")) {
                    System.out.println("Peminjaman diperpanjang");
                } else {
                    break;
                }
            }
            menuUtama();
        } else {
            System.out.println("Tidak ada riwayat peminjaman");
            menuUtama();
        }
    }
    //memperpanjang peminjaman buku
    public void extendPeminjaman() {}
    
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
     * @return the nim
     */
    public String getNim() {
        return nim;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perpustakaankampus;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class Guest {
    public Perpustakaan lib;
    private DataLogin verifLogin;
    Scanner input = new Scanner(System.in);
    public Guest() {}
    public Guest(Perpustakaan lib, DataLogin verifLogin) {
        this.lib = lib;
        this.verifLogin = verifLogin;
    }
    //Menu Utama
    public void menuUtama() {
        System.out.println("\n===============HOME===============");
        System.out.println("Login as Guest");
        System.out.println("1. Login");
        System.out.println("2. List semua buku");
        System.out.print("Ketik nomor pilihan : ");
        String pilihan = input.nextLine();
        //jika pilih 1 maka login, 2 maka lihat list
        if (pilihan.equals("1")) {
            login();
        } else if (pilihan.equals("2")) {
            menuList();
        }
    }
    //Menu Login
    public void login() {
        System.out.println("\n===============LOGIN===============");
        System.out.println("Ketik 0 untuk membatalkan login");
        boolean benar = false;
        while (!benar) {
            System.out.print("Login as\n1. Mahasiswa\n2. Admin\nKetik nomor pilihan : ");
            String role = input.nextLine();
            //jika input 0 maka proses login batal
            if (role.equals("0")) {
                menuUtama();
            } else if (role.equals("1")){
                System.out.print("Username : ");
                String username = input.nextLine();
                System.out.print("Password : ");
                String password = input.nextLine();
                Mahasiswa terdaftar = verifLogin.cariMahasiswa(username);
                if (terdaftar != null) {
                    if (password.equals(terdaftar.getPassword())) {
                        System.out.println("Login Berhasil");
                        benar = true;
                        terdaftar.menuUtama(); //berpindah ke ui mahasiswa
                    } else {
                        System.out.println("Password salah, harap coba lagi");
                    }
                } else {
                    System.out.println("Username tidak terdaftar");
                }
            } else if (role.equals("2")){
                System.out.print("Username : ");
                String username = input.nextLine();
                System.out.print("Password : ");
                String password = input.nextLine();
                Admin terdaftar = verifLogin.cariAdmin(username);
                if (terdaftar != null) {
                    if (password.equals(terdaftar.getPassword())) {
                        System.out.println("Login Berhasil");
                        benar = true;
                        terdaftar.menuUtama(); //berpindah ke ui mahasiswa
                    } else {
                        System.out.println("Password salah, harap coba lagi");
                    }
                } else {
                    System.out.println("Username tidak terdaftar");
                }
            }
        }
    }
    //Menu list buku
    public void menuList() {
        System.out.println("\n===============LIST BUKU===============");
        for (int i = 0; i < lib.getDaftarRak().size(); i++) {
            Rak rak = lib.getDaftarRak().get(i);
            System.out.println("Kategori : "+rak.getKategoriRak());
            System.out.println("  Kode   Tahun  Judul");
            for (int j = 0; j < rak.getDaftarBuku().size(); j++) {
                Buku buku = rak.getDaftarBuku().get(j);
                System.out.println("["+buku.getKodeBuku()+"] ["+buku.getTahunTerbit()+"] "+buku.getJudulBuku());
            }
            System.out.println();
        }
        
        String pilihan = "1";
        while (!pilihan.equals("0")) {
            System.out.println("\n1. Lihat detail buku");
            System.out.println("2. Search buku");
            System.out.println("0. Kembali ke menu sebelumnya");
            System.out.print("Ketik nomor pilihan : ");
            pilihan = input.nextLine();
            if (pilihan.equals("1")) {
                System.out.print("Ketik kode buku : ");
                int kode = input.nextInt();
                menuDetailBuku(kode);
            } else if (pilihan.equals("2")) {
                System.out.print("Ketik judul buku : ");
                String judul = input.nextLine();
                Buku buku = searchBuku(judul);
                if (buku != null) {
                    System.out.println("\nHasil search");
                    System.out.println("Kategori : "+buku.getKategoriBuku());
                    System.out.println("  Kode   Tahun  Judul");
                    System.out.println("["+buku.getKodeBuku()+"] ["+buku.getTahunTerbit()+"] "+buku.getJudulBuku());
                }
            }
            
        }
        menuUtama();
    }
    
    public Buku searchBuku(String judul) {
        boolean found = false;
        for (int i = 0; i < lib.getDaftarRak().size() && !found; i++) {
            Rak rak = lib.getDaftarRak().get(i);
            for (int j = 0; j < rak.getDaftarBuku().size() && !found; j++) {
                Buku buku = rak.getDaftarBuku().get(j);
                found = judul.equals(rak.getDaftarBuku().get(j).getJudulBuku());
                if (found) {
                    return buku;
                }
            }
        }
        System.out.println("Buka tidak ditemukan");
        return null;
    }
    
    public void menuDetailBuku(int kode) {
        Rak rak = lib.getDaftarRak().get(0);
        Buku buku = rak.getDaftarBuku().get(0);
        boolean found = false;
        for (int i = 0; i < lib.getDaftarRak().size() && !found; i++) {
            rak = lib.getDaftarRak().get(i);
            for (int j = 0; j < rak.getDaftarBuku().size() && !found; j++) {
                buku = rak.getDaftarBuku().get(j);
                found = kode == buku.getKodeBuku();
            }
        }
        if (found) {
            System.out.println("\nInformasi buku");
            System.out.println("Kode buku\t: "+buku.getKodeBuku());
            System.out.println("Judul buku\t: "+buku.getJudulBuku());
            System.out.println("Author\t\t: "+buku.getAuthor());
            System.out.println("Kategori buku\t: "+buku.getKategoriBuku());
            System.out.println("Tahun terbit\t: "+buku.getTahunTerbit());
            System.out.println("Stok buku\t: "+buku.getStokBuku());
        } else {
            System.out.println("Buku tidak ditemukan");
        }
    }
    
    public DataLogin getVerifLogin() {
        return verifLogin;
    }
}

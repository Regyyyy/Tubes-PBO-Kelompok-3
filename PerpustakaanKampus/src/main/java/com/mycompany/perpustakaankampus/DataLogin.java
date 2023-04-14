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

public class DataLogin {
    private List<Mahasiswa> dataLoginMahasiswa;
    private List<Pustakawan> dataLoginPustakawan;
    
    public DataLogin() {
        dataLoginMahasiswa = new ArrayList();
        dataLoginPustakawan = new ArrayList();
    }
    
    public void addAkunMahasiswa(Mahasiswa mhs) {
        dataLoginMahasiswa.add(mhs);
    }
    
    public void addAkunPustakawan(Pustakawan p) {
        dataLoginPustakawan.add(p);
    }
    /*
    untuk mengembalikan objek mahasiswa dengan nama yang sama dengan input
    asumsi tidak ada mahasiswa yang memiliki nama yang sama
    */
    public Mahasiswa cariMahasiswa(String username) {
        int i = 0;
        boolean found = false;
        while (!found && i < dataLoginMahasiswa.size()) {
            found = dataLoginMahasiswa.get(i).getUsername().equals(username);
            i++;
        }
        if (found) {
            return dataLoginMahasiswa.get(i-1);
        } else {
            return null;
        }
    }
    /*
    untuk mengembalikan objek mahasiswa dengan nama yang sama dengan input
    asumsi tidak ada mahasiswa yang memiliki nama yang sama
    */
    public Pustakawan cariPustakawan(String username) {
        int i = 0;
        boolean found = false;
        while (!found && i < dataLoginPustakawan.size()) {
            found = dataLoginPustakawan.get(i).getUsername().equals(username);
            i++;
        }
        if (found) {
            return dataLoginPustakawan.get(i-1);
        } else {
            return null;
        }
    }
}

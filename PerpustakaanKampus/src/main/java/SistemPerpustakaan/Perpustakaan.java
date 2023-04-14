/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemPerpustakaan;

/**
 *
 * @author User
 */
import java.util.*;
public class Perpustakaan {
    private List<Rak> daftarRak;
    
    public Perpustakaan() {
        daftarRak = new ArrayList();
    }
    
    public void tambahRak(Rak rak) {
        daftarRak.add(rak);
    }
    
    public Rak hapusRak(String kategoriRak) {
        int i = 0;
        boolean found = false;
        while (!found && i < daftarRak.size()) {
            found = kategoriRak.equals(daftarRak.get(i).getKategoriRak());
            i++;
        }
        if (found) {
            Rak rak;
            rak = daftarRak.get(i-1);
            daftarRak.remove(i-1);
            return rak;
        } else {
            System.out.println("Kategori rak tidak ditemukan");
            return null;
        }
    }

    /**
     * @return the daftarRak
     */
    public List<Rak> getDaftarRak() {
        return daftarRak;
    }
    
    
}

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

public class Rak {
    private String kategoriRak;
    private String kodeRak;
    private List<Buku> daftarBuku;
    
    public Rak() {}
    public Rak(String kategoriRak, String kodeRak) {
        this.kategoriRak = kategoriRak;
        this.kodeRak = kodeRak;
        daftarBuku = new ArrayList();
    }
    public void tambahBuku(Buku[] arrBuku) {
        for (int i = 0; i < arrBuku.length; i++) {
            getDaftarBuku().add(arrBuku[i]);
        }
    }
    private int indexBuku(int kodeBuku) {
        int i = 0;
        boolean found = false;
        while (!found && i < getDaftarBuku().size()) {
            found = kodeBuku == getDaftarBuku().get(i).getKodeBuku();
            i++;
        }
        if (found) {
            return i-1;
        } else {
            System.out.println("Buku tidak ditemukan");
            return -1;
        }
    }
    
    public Buku hapusBuku(int kodeBuku) {
        int i = indexBuku(kodeBuku);
        Buku buku;
        if (i != -1) {
            buku = getDaftarBuku().get(i);
            getDaftarBuku().remove(i);
            return buku;
        } else {
            return null;
        }
    }
    
    public void tambahStokBuku(int kodeBuku) {
        int i = indexBuku(kodeBuku);
        Buku buku;
        if (i != -1) {
            daftarBuku.get(i).stokBuku++;
        }
    }
    
    public void kurangStokBuku(int kodeBuku) {
        int i = indexBuku(kodeBuku);
        Buku buku;
        if (i != -1) {
            if (getDaftarBuku().get(i).stokBuku > 0) {
                daftarBuku.get(i).stokBuku--;
            }
        }
    }

    /**
     * @return the kategoriRak
     */
    public String getKategoriRak() {
        return kategoriRak;
    }

    /**
     * @return the kodeRak
     */
    public String getKodeRak() {
        return kodeRak;
    }

    /**
     * @return the daftarBuku
     */
    public List<Buku> getDaftarBuku() {
        return daftarBuku;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package lonanzoo;


import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author M. ARIANDA SAPUTRA
 */
public class Hewan {
    private int kodeHewan;
    private String habitat;
    private String namaHewan;
    private String jenisMakanan;
    private String asalNegara;
    private int jumlahHewan;
    private String category;

    public Hewan(int kodeHewan, String habitat, String namaHewan, String jenisMakanan, String asalNegara, int jumlahHewan, String category) {
        this.kodeHewan = kodeHewan;
        this.habitat = habitat;
        this.namaHewan = namaHewan;
        this.jenisMakanan = jenisMakanan;
        this.asalNegara = asalNegara;
        this.jumlahHewan = jumlahHewan;
        this.category = category;
    }

    public int getKode() {
        return kodeHewan;
    }

    public void setKodeHewan(int kodeHewan) {
        this.kodeHewan = kodeHewan;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getNama() {
        return namaHewan;
    }

    public void setNamaHewan(String namaHewan) {
        this.namaHewan = namaHewan;
    }

    public String getJenisMakanan() {
        return jenisMakanan;
    }

    public void setJenisMakanan(String jenisMakanan) {
        this.jenisMakanan = jenisMakanan;
    }

    public String getAsalNegara() {
        return asalNegara;
    }

    public void setAsalNegara(String asalNegara) {
        this.asalNegara = asalNegara;
    }

    public int getJumlah() {
        return jumlahHewan;
    }

    public void setJumlahHewan(int jumlahHewan) {
        this.jumlahHewan = jumlahHewan;
    }

    public String getKategori() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

package springhibernate.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "barangbaru")

public class Barang {
    @Id
    @Column(name = "Nama Barang", length = 30)
    private String nama;

    @Column(name = "Jenis Barang", length = 30)
    private String jenis;

    @Column(name = "Jumlah Barang", length = 30)
    private int jumlah;

    @Column(name = "Kondisi Barang", length = 100)
    private String kondisi;

    public String getNama() { 
        return nama;
    }
    public void setNama (String nama) { 
        this.nama = nama;
    }
    
    public String getJenis() {
    return jenis;
    }
    public void setJenis (String jenis) { 
        this.jenis = jenis;
    }
    
    public int getJumlah() {
        return jumlah;
    }
    public void setJumlah (int jumlah) { 
        this.jumlah = jumlah;
    }
    
    public String getKondisi() {
    return kondisi;
    }
    public void setKondisi (String kondisi) { 
        this.kondisi = kondisi;
    }
}
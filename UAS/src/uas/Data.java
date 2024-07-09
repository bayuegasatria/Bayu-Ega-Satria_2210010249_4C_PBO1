
package uas;


public class Data {
    private String nama,item,kode;
    private double harga;

    public Data(String nama, String item, String kode, double harga) {
        this.nama = nama;
        this.item = item;
        this.kode = kode;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    
    public void display(){
        System.out.println("Nama        : " +getNama());
        System.out.println("Item        : " +getItem());
        System.out.println("Harga       : " +getHarga());
        System.out.println("Kode        : " +getKode());
    }
}

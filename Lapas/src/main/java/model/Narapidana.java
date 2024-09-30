package model;

public class Narapidana {
    private static int totalNarapidana = 0;
    private String id;
    private String nama;
    private int masaTahanan;

    // Constructor
    public Narapidana(String id, String nama, int masaTahanan) {
        this.id = id;
        this.nama = nama;
        this.masaTahanan = masaTahanan;
        totalNarapidana++; // Menggunakan static keyword
    }

    // Method untuk menampilkan informasi narapidana
    public void displayInfo() {
        System.out.println("ID Narapidana: " + id);
        System.out.println("Nama Narapidana: " + nama);
        System.out.println("Masa Tahanan: " + masaTahanan + " tahun");
    }

    // Getter untuk total narapidana (static method)
    public static int getTotalNarapidana() {
        return totalNarapidana;
    }

    // Getters and Setters (opsional)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getMasaTahanan() {
        return masaTahanan;
    }

    public void setMasaTahanan(int masaTahanan) {
        this.masaTahanan = masaTahanan;
    }
}

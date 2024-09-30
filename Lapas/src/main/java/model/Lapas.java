package model;

public class Lapas {
    private String idLapas;
    private String namaLapas;
    private int kapasitas;

    // Constructor
    public Lapas(String idLapas, String namaLapas, int kapasitas) {
        this.idLapas = idLapas;
        this.namaLapas = namaLapas;
        this.kapasitas = kapasitas;
    }

    // Method
    public void displayInfo() {
        System.out.println("ID Lapas: " + idLapas);
        System.out.println("Nama Lapas: " + namaLapas);
        System.out.println("Kapasitas: " + kapasitas);
    }

    // Getters and Setters (opsional)
    public String getIdLapas() {
        return idLapas;
    }

    public void setIdLapas(String idLapas) {
        this.idLapas = idLapas;
    }

    public String getNamaLapas() {
        return namaLapas;
    }

    public void setNamaLapas(String namaLapas) {
        this.namaLapas = namaLapas;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }
}

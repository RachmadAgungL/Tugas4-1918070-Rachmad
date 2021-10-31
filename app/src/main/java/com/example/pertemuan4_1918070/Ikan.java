package com.example.pertemuan4_1918070;

public class Ikan {
    private String nama,asal,ciriciri;
    private int foto;
    public Ikan(String nama, String asal, String ciriciri, int foto){
        this.nama = nama;
        this.asal = asal;
        this.ciriciri = ciriciri;
        this.foto = foto;
    }

    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getAsal(){ return asal; }
    public void setAsal(String asal){
        this.asal = asal;
    }
    public String getCiriciri(){
        return ciriciri;
    }
    public void setCiriciri(String ciriciri){
        this.ciriciri = ciriciri;
    }

    public int getFoto() { return foto; }
    public void setFoto(int foto) { this.foto = foto; }
}

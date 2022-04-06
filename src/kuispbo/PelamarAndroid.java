/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuispbo;
import kuis.Android;
/**
 *
 * @author ASUS
 */
public class PelamarAndroid implements Android {

    String nik, namaPelamar ;
    double nilaiTulis, nilaiCoding, nilaiWawancara;
    PelamarAndroid (String nik,String nama, double nilaiTulis, double nilaiCoding, double nilaiWawancara ){
        this.nik = nik;
        this.namaPelamar = nama;
        this.nilaiTulis = nilaiTulis;
        this.nilaiCoding = nilaiCoding;
        this.nilaiWawancara = nilaiWawancara;
    }
    
    @Override
    public double nilaiTulis() {
        // TODO Auto-generated method stub
        this.nilaiTulis= this.nilaiTulis * 0.20;
        return this.nilaiTulis;
    }
    @Override
    public double nilaiCoding() {
        // TODO Auto-generated method stub
        this.nilaiCoding = this.nilaiCoding * 0.50;
        return this.nilaiCoding;
    }
    @Override
    public double nilaiWawancara() {
        // TODO Auto-generated method stub
        this.nilaiWawancara = this.nilaiWawancara * 0.30;
        return this.nilaiWawancara;
    }
    
    public double getHasil(){
        double nilaiAkhir = nilaiTulis() + nilaiCoding() + nilaiWawancara() ;
        return nilaiAkhir;
    }

    public void setNilaiTulis(double nilai){
        nilaiTulis = nilai;
    }
    public void setNilaiCoding(double nilai){
        nilaiCoding = nilai;
    }
    public void setNilaiWawancara(double nilai){
        nilaiWawancara = nilai;
    }
    
}

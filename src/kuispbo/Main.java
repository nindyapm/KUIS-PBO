/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuispbo;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("FORM PENDAFTARAN PT.NINDYA");
        System.out.println("1. Android Development");
        System.out.println("2. Web Development");
        System.out.print("Pilih jenis Form : ");
        int pilihan = Integer.parseInt(input.nextLine());
        String nik, nama;
        String ket;
        double[] nilai = new double[3];
        int utama;
        switch (pilihan) {
            case 1:
                System.out.println("FORM PENDAFTARAN");
                System.out.print(" Input NIK : ");
                nik = input.nextLine();
                System.out.print(" Input Nama : ");
                nama = input.nextLine();
                
                System.out.print(" Input Nilai Tes Tulis : ");
                nilai[0] = input.nextDouble();
                System.out.print(" Input Nilai Tes Coding : ");
                nilai[1] = input.nextDouble();
                System.out.print(" Input Nilai Tes Wawancara : ");
                nilai[2] = input.nextDouble();
               
                PelamarAndroid PelamarAndroid = new PelamarAndroid (nik, nama, nilai[0], nilai[1], nilai[2]);
                do{
                    System.out.println("=== Menu ===");
                    System.out.println(" 1. Edit");
                    System.out.println(" 2. Tampil");
                    System.out.println(" 3. Exit");
                    System.out.print(" Pilih : ");
                    utama  = input.nextInt();
                    switch(utama) {
                        case 1:
                            System.out.println("FORM EDIT");
                            System.out.print(" Input Nilai Tes Tulis : ");
                            nilai[0] = input.nextDouble();
                            PelamarAndroid.setNilaiTulis(nilai[0]);
                            System.out.print(" Input Nilai Tes Coding : ");
                            nilai[1] = input.nextDouble();
                            PelamarAndroid.setNilaiCoding(nilai[1]);
                            System.out.print(" Input Nilai Tes Wawancara : ");
                            nilai[2] = input.nextDouble();
                            PelamarAndroid.setNilaiWawancara(nilai[2]);
                            break;
                        case 2: 
                            double hasil = PelamarAndroid.getHasil();
                            System.out.println(" Nilai Akhir    : " + hasil);
                            if(hasil < 85){
                                ket = "GAGAL";
                            }else{
                                ket = "LOLOS";
                            }
                            System.out.println(" KETERANGAN     : " + ket); 
                            if(hasil < 85){
                                System.out.println(" Mohon maaf kepada "+ PelamarAndroid.namaPelamar +  " telah ditolak sebagai Android");
                            }else {
                                System.out.println(" Selamat kepada " + PelamarAndroid.namaPelamar +  " telah diterima sebagai Android");
                            }
                            break;
                        case 3: 
                            System.exit(0);
                            break;
                        default: System.out.println("Opsi tidak ada, Mohon masukkan opsi dengan benar");
                            break;
                        }
                }while(utama != 3);
                break;
            case 2: 
                System.out.println("FORM PENDAFTARAN");
                System.out.print(" Input NIK : ");
                nik = input.nextLine();
                System.out.print(" Input Nama : ");
                nama = input.nextLine();
                
                System.out.print(" Input Nilai Tes Tulis : ");
                nilai[0] = input.nextDouble();
                System.out.print(" Input Nilai Tes Coding : ");
                nilai[1] = input.nextDouble();
                System.out.print(" Input Nilai Tes Wawancara : ");
                nilai[2] = input.nextDouble();
                
                PelamarWeb  PelamarWeb = new  PelamarWeb (nik, nama, nilai[0], nilai[1], nilai[2]);
                do{
                    System.out.println("=== Menu ===");
                    System.out.println(" 1. Edit");
                    System.out.println(" 2. Tampil");
                    System.out.println(" 3. Exit");
                    System.out.print(" Pilih : ");
                    utama  = input.nextInt();
                    switch (utama) {
                        case 1:
                            System.out.println("FORM EDIT");
                            System.out.print(" Input Nilai Tes Tulis : ");
                            nilai[0] = input.nextDouble();
                            PelamarWeb.setNilaiTulis(nilai[0]);
                            System.out.print(" Input Nilai Tes Coding : ");
                            nilai[1] = input.nextDouble();
                            PelamarWeb.setNilaiCoding(nilai[1]);
                            System.out.print(" Input Nilai Tes Wawancara : ");
                            nilai[2] = input.nextDouble();
                            PelamarWeb.setNilaiWawancara(nilai[2]);
                            break;
                        case 2: 
                            double hasil = PelamarWeb.getHasil();
                            System.out.println(" Nilai Akhir    : " + hasil);
                            if(hasil < 85){
                                ket = "GAGAL";
                            }else{
                                ket = "LOLOS";
                            }
                            System.out.println(" KETERANGAN     : " + ket); 
                            if(hasil < 85){
                                System.out.println(" Mohon maaf kepada " + PelamarWeb.namaPelamar +  " telah ditolak sebagai WEB");
                            }else {
                                System.out.println(" Selamat kepada " + PelamarWeb.namaPelamar +  " telah diterima sebagai WEB");
                            }
                                break;
                        case 3: 
                            System.exit(0);
                            break;
                        default: System.out.println(" Opsi tidak ada, Mohon masukkan opsi dengan benar");
                            break;
                    }
                   
                }while(utama != 3);
               
                break;
            default: System.out.println(" Opsi tidak ada, Mohon masukkan opsi dengan benar");
                break;
        }
        input.close();
        
    }
}

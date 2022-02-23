/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp;
import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class spp {
    static int input_id=0, iP=0, iJb = 0;
    static char golongan = 'A';
    static int[] id = {1,2,3,4};
    static String[] nama = {"Mira","Nina","Oemar","Pena"};
    static String[] alamat = {"Sawojajar","Kedung kandang","Ijen","Dinoyo"};
    static String[] jalur = {"SBMPTN","SNMPTN","Mandiri","SBMPTN"};
    
    static int id_m= 0;
    static String Nama=" ",Alamat=" ", Jalur=" ";
    static int total = 0, SPP=0,DSP=0;
    
    static void rumus(int Inputd,int P,int Jb){
        int index = input_id-1;
        
        id_m  = id[index];
        Nama = nama[index];
        Alamat = alamat[index];
        Jalur = jalur[index];
        
        switch(Jalur){
            case "SBMPTN":
                if(iP<2000000){
                    DSP = 5000000;
                    SPP = 500000;
                }else if(iP>10000000){
                    golongan = 'C';
                    DSP = 30000000;
                    SPP = 2000000;
                }else{
                    golongan = 'B';
                    DSP = 15000000;
                    SPP = 1000000;
                }
                break;
                case "SNMPTN":
                if(iP<2000000){
                    DSP = 7000000;
                    SPP = 500000;
                }else if(iP>10000000){
                    golongan = 'C';
                    DSP = 35000000;
                    SPP = 2000000;
                }else{
                    golongan = 'B';
                    DSP = 17000000;
                    SPP = 1000000;
                }
                break;
                case "Mandiri":
                if(iP<2000000){
                    DSP = 10000000;
                    SPP = 1000000;
                }else if(iP>10000000){
                    golongan = 'C';
                    DSP = 50000000;
                    SPP = 3000000;
                }else{
                    golongan = 'B';
                    DSP = 25000000;
                    SPP = 3000000;
                }
                break;
        }
        total = SPP*iJb;
    }
    static void tampil(){
        System.out.println("Data:");
        System.out.println("ID Mahasiswa\t:"+id_m);
        System.out.println("Nama Mahasiswa\t:"+Nama);
        System.out.println("Alamat Mahasiswa:"+Alamat);
        System.out.println("Pendapatan\t:"+iP);
        System.out.println("Golongan\t:"+golongan);
        System.out.println("Jalur masuk\t:"+Jalur);
        System.out.println("Jumlah SPP yang akan dibayar\t:"+iJb);
        System.out.println("Jumlah SPP yang harus dibayar\t:"+total);
    }
    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        System.out.println("Masukkan id\t:");
        input_id = I.nextInt();
        System.out.println("Masukkan pendapatan\t:");
        iP = I.nextInt();
        System.out.println("Masukkan jumlah bulan\t:");
        iJb = I.nextInt();
        rumus(input_id,iP,iJb);
        tampil();
    }
}

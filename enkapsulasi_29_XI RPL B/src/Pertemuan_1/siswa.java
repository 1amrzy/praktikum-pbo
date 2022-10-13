/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan_1;

/**
 *
 * @author R A F I F
 */
public class siswa {
    
    private String nama;
    private int nilai = 0;
    private String kelas;
    
    public void isiData(){
        nama = "Fahrul";
        nilai = 69;
        kelas = "XI RPL B";
    }
    
    public void cetak(){
        System.out.println("Nama :" + nama);
        System.out.println("Nama :" + nilai);
        System.out.println("Nama :" + kelas);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan_1;

import javax.swing.JOptionPane;
/**
 *
 * @author R A F I F
 */
public class LuasBangunDatar {
    
    private String persegi;
    private int sisi;
    private int luas;
    private String input;
    
    public void menghitung(){
        JOptionPane.showMessageDialog(null,"KALKULATOR PENGHITUNG BANGUN DATAR PERSEGI\n-----------\nMade by Rafif XI RPL B");
        String inputsisi = JOptionPane.showInputDialog("Input sisi =");
        sisi=Integer.parseInt(inputsisi);
        luas=sisi*sisi;
        JOptionPane.showMessageDialog(null,"Hasil = "+luas,"BANGUN DATAR PERSEGI",JOptionPane.INFORMATION_MESSAGE);
    }
    
    
}

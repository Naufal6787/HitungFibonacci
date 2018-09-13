/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitungfibonacci;

import java.util.Scanner;

/**
 *
 * @author Naufal K D
 */
public class JasaKuli {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah :  ");
        int berat = scanner.nextInt();
        int bilanganberat[] = new int[]{7,5,4,3,2};
        int jumlah;
        int bayaran;
         int total = 0;
    for(int i = 0; i< bilanganberat.length;i++){
    if(berat >= bilanganberat[i]){
        jumlah = berat/bilanganberat[i];
        berat = berat%bilanganberat[i];
    if(bilanganberat[i]==7){
    bayaran = 10000*jumlah;
    }
    else if(bilanganberat[i]==5){
    bayaran = 7000*jumlah;
    }
    else if(bilanganberat[i]==4){
    bayaran = 5000*jumlah;
    }
    else if(bilanganberat[i]==3){
    bayaran = 3000*jumlah;
    }
    else{
    bayaran = 2000*jumlah;
    }
    total += bayaran;
        System.out.println(" JumlahPecahan berat " +bilanganberat[i]+ " KG "+" sebanyak "+ jumlah +" Seharga "+ bayaran);
    }
    }
    System.out.println(" Total Harga = "+total+ " Rp ");
}
    }
        
    

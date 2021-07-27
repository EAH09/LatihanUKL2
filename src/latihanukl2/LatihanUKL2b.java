/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanukl2;

/**
 *
 * @author erisa
 */
public class LatihanUKL2b {
    public static void main(String[] args){
        //Latihan B
        
        for(int y=1; y<=5; y++){       // y digunakan untuk sisi tegak
                                       //y=1 maksudnya baris awalnya dimulai dari 1
                                       //jika y<=5 maka saat perulangan y akan ditambah 1
            
            for(int x=5; x>0; x--){    // X digunakan untuk sisi miring
                                       // x = 5 maksudnya baris awalnya 5
                                       // jika x>0 maka saat perulangannya x akan dikurangi 1
                                       
                System.out.print("*"); // untuk menampilkan simbol * (bintang)
                
                if(x==y){
                    break;
                }
            }
            System.out.println(" "); //ini digunakan spasi
        }
    }
    
    
}

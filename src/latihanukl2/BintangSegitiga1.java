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
public class BintangSegitiga1 {
    public static void main (String[] args){
        int a,b; //deklarasi variabel
        
        for(a=1; a<=5; a++){ //outer loop
            
            System.out.println();
            //mengakhiri baris spasi ke bawah
            // dan menampilkan perulangan inner loop sebanyak 5x
            // yang menampilkan bintang
            
           for(b=1; b<=4; b++){
               System.out.print("*");
               //digunakan untuk menampikan baris bintang (4x bintang)
               
           }
            
        }
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasutara;

public class Tugasutara {

    public static void main(String[] args) {
       
        Bangundatar persegiPanjang = new PersegiPanjang(10,10);
        System.out.println("Luas persegi panjang" + persegiPanjang.hitungLuas());
        
        Bangundatar bujursangkar = new Bujursangkar(10);
        System.out.println("Luas Bujur Sangkar " + bujursangkar.hitungLuas());
        
        Bangundatar Lingkarang = new Lingkarang (10);
        System.out.println("Luas Lingkaran " + Lingkarang.hitungLuas());
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasutara;

public class PersegiPanjang extends Bangundatar{

    public PersegiPanjang(double panjang, double lebar) {
        super.setPanjang(panjang);
        super.setLebar(lebar);
    }
    
    @Override
    public double hitungLuas(){
        return super.getLebar()*getPanjang();
    }
}

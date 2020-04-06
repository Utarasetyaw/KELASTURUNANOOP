/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasutara;

public class Bujursangkar extends Bangundatar{
    public Bujursangkar (double sisi) {
        super.setSisi(sisi);
    }
    @Override
    public double hitungLuas(){
        return super.getSisi() * getSisi();
}
}

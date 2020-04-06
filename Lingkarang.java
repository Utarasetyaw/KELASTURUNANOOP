/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasutara;

public class Lingkarang extends Bangundatar {

    public Lingkarang(double jariJari) {
        super.setJariJari(jariJari);
    }

    @Override
    public double hitungLuas() {
        return super.getJariJari() * getJariJari() * 3.14;
    }
}

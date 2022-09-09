/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunDatar;

/**
 *
 * @author khulu
 */
public class Persegi extends BangunDatar{
    
    private final float s;
    
    public Persegi (float sisi) {
        this.s = sisi;
    }
    
    @Override
    public void hitungLuas () {
        luas = s * s;
    }
    
    @Override
    public void hitungKeliling () {
        keliling = 4 * s;
    }
}
                
 
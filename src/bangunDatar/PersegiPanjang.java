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
public class PersegiPanjang extends BangunDatar{
    private float p;
    private float l;
    
    public PersegiPanjang (float pjg, float lb) {
        this.p = pjg;
        this.l = lb;
    }
    
    @Override
    public void hitungLuas () {
        luas = p * l;
    }
    
    @Override
    public void hitungKeliling () {
        keliling = 2 * (p + l);
    }
}

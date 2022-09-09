/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunRuang;

/**
 *
 * @author khulu
 */
public class Balok extends BangunRuang{
    private float p;
    private float l;
    private float t;
    
    public Balok (float pjg, float lb, float tg) {
        this.p = pjg;
        this.l = lb;
        this.t = tg;
    }
    
    @Override
    public void hitungLuas () {
        luas = 2 * ((p * l) + (p * t) + (p * t));
    }
    
    @Override
    public void hitungKeliling () {
        keliling = 4 * (p + l + t);
    }
    
    @Override
    public void hitungVolume () {
        volume = p * l * t;
    }
    
}

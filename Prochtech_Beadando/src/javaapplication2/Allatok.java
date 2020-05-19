/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author peti9
 */
public abstract class Allatok implements Ieloleny {

    private String Nev;
    private int Eletkor;
    private int Suly;
    private String Taplalek;
    @Override    
    public String getNev() {
        return this.Nev;
    }
    
    @Override
    public void setNev(String nev) {
        this.Nev=nev;
    }
    
    @Override
    public int getEletkor() {
       return this.Eletkor;
    }
    
    @Override
    public void setEletkor(int eletkor) {
        this.Eletkor=eletkor;
    }

    @Override
    public int getSuly() {
        return this.Suly;
    }

    @Override
    public void setSuly(int suly) {
       this.Suly=suly;
    }

    @Override
    public void setTaplalek(String taplalek) {
        this.Taplalek=taplalek;
    }

    @Override
    public String getTaplalek() {
        return this.Taplalek;
    }
    
    public abstract String mozgas(Ieloleny eloleny);
    
    public abstract String eves(Ieloleny eloleny);
     
    
    
    
}

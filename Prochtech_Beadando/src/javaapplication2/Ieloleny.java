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
public interface Ieloleny {
    public String getNev();
    
    public void setNev(String nev);
    
    public int getEletkor();
    
    public int getSuly();
    
    public void setSuly(int Suly);
    
    public void setTaplalek(enum taplalek);                
           
    public enum getTaplalek();
    
    public void setEletkor(int eletkor);
    
    public String mozgas();
    
    
    
}
public enum Taplalek{
    Növényevő,
    Húsevő,
    Mindenevő
}

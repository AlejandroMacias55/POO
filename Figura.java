/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia3;
/**
 *
 * @author sndmonreal
 */
public abstract class Figura {
    private String nombre;
    private int grosorBorde;
    private int color;
    
    public Figura(){}
    
    public Figura(String nom, int col){
        nombre = nom;
        color = col;
    }
    public void setNombre(String nom){
        nombre=nom;
    }
    public String getNombre(){
        return nombre;
    }
    public void setGrosorBorde(int g){
        grosorBorde=g;
    }
    public int getGrosorBorde(){
        return grosorBorde;
    }
    public void setColor(int c){
        color=c;
    }
    public int getColor(){
        return color;
    }
    
    // METODO ABSTRACTO
    public abstract void dibujar();
}

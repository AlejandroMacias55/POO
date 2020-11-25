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
public class Cubo extends Figura3D{
    private Cuadrado cuad;
    
    public Cubo(){
        cuad = new Cuadrado();
    }
    public Cubo(float lado){
        cuad=new Cuadrado(lado);
    }
    public void setCuad(Cuadrado c){
        cuad=c;
    }
    public Cuadrado getCuad(){
        return cuad;
    }
    
    public float calcularVolumen(){
        return (float)Math.pow(cuad.getLado(),3);
    }
    public void dibujar(){
        System.out.println("[]");
    }
    
    public float calcularAreaSuperficial(){
        return cuad.calcularArea()*6;
    }
}

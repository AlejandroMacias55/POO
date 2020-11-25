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
public class Cuadrado extends Figura2D {
    
    private float lado;
    
    public Cuadrado(){
        
    }
    public Cuadrado(float lad){
        lado=lad;
    }
    public void setLado(float lad){
        lado=lad;
    }
    public float getLado(){
        return lado;
    }
    // sobreescribir los métodos abstractos que hereda
    public float calcularArea(){
        return lado*lado;
    }
    public float calcularPerimetro(){
        return lado*4;
    }
    public void dibujar(){
        System.out.println("[]");
    }
    public float cambiarTamanio(){
        lado *=5;
        return lado;
    }
}

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
public class Esfera extends Figura3D{
    private float radio;
    
    public Esfera(){
        super();
    }
    public Esfera(float r){
        super();
        radio =r;
    }
    
    public void setRadio(float r){
        radio=r;
    }
    public float getRadio(){
        return radio;
    }
    
    @Override
    public float calcularVolumen(){
        float vol=0; // 4/3 PI * r^3
        vol =(float) ((4f/3f)*Math.PI * Math.pow(radio, 3f));
        return vol;
    }
    
    @Override
    public void dibujar(){
        System.out.println("O");
    }
    
}

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
public abstract class Figura3D extends Figura{
    
    public Figura3D(){
        super();
    } 
    public Figura3D(String nom, int col){
        super(nom, col);
    }
    
    public abstract float calcularVolumen();
    
}

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
public class TestFiguras {
    public static void main(String args[]){
        //Esfera Figura3D
        Esfera esf = new Esfera(5);
        System.out.println("//Esfera Figura3D//");
        System.out.println("Volumen: "+esf.calcularVolumen());
        esf.setColor(2);
        esf.setGrosorBorde(3);
        esf.setNombre("Estrella de la muerte!!");
        System.out.println("Nombre: "+ esf.getNombre());
        esf.dibujar();
        
       // Figura3D f3d = new Figura3D();
        //  Cubo Figura3D
        Cubo c = new Cubo(4);
        System.out.println("//Cubo Figura3D//");
        c.dibujar();
        System.out.println("Volumen: "+c.calcularVolumen());
        System.out.println("Area superficial: "+c.calcularAreaSuperficial());


        //Cuadrado Figura2D
        Cuadrado cu=new Cuadrado(5);
        System.out.println("//Cuadrado Figura2D//");
        System.out.println("El nuevo lado es: "+cu.cambiarTamanio());
        System.out.println("Area: "+cu.calcularArea());
        System.out.println("Perimetro: "+cu.calcularPerimetro());
        cu.dibujar();

        //Triangulo Figura2D
        Triangulo tri=new Triangulo(5,8);
        System.out.println("//Triangulo Figura2D//");
        System.out.println("El nuevo altura es: "+tri.cambiarTamanio());
        System.out.println("Area: "+tri.calcularArea());
        System.out.println("Perimetro: "+tri.calcularPerimetro());
        tri.dibujar();

        //Piramide Figura3D
        Piramide p=new Piramide(6);
        System.out.println("El volumen de la Piramide es: "+ p.calcularVolumen());
        p.dibujar();


    }
}

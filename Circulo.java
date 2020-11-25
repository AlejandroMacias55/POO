package herencia3;

public class Circulo extends Figura2D {
    private float radio;

    public Circulo(){

    }
    public Circulo(float rad){
        radio=rad;
    }
    public void setRadio(float rad){
        radio=rad;
    }
    public float getRadio(){
        return radio;
    }
    // sobreescribir los métodos abstractos que hereda
    public float calcularArea(){

        return (float)(Math.PI*Math.pow(radio,2));
    }
    public float calcularPerimetro(){
        return (float) (2*Math.PI*radio);
    }
    public void dibujar(){
        System.out.println("[]");
    }
    public float cambiarTamanio(){
        radio *=5;
        return radio;
    }

}

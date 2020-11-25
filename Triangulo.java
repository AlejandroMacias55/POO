package herencia3;

public class Triangulo extends Figura2D {

    private float base;
    private  float altura;

    public Triangulo(){

    }
    public Triangulo(float b, float alt){
        base=b;
        altura=alt;
    }
    public void setBase(float b){
        base=b;
    }
    public float getBase(){
        return base;
    }
    public void setAltura(float alt){
        altura=alt;
    }
    public float getAltura(){
        return altura;
    }

    public float calcularArea(){

        return (base*altura)/2;
    }
    public  float calcularPerimetro(){
        return (float)((Math.sqrt(Math.pow(base,2)+Math.pow(altura,2)))*2);
    }
    public void dibujar(){
        System.out.println("  *   ");
        System.out.println(" *  * ");
        System.out.println("******");

    }
    public float cambiarTamanio(){
        altura*=5;
        return altura;

    }

}

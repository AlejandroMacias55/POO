package herencia3;

public class Piramide extends Figura3D {


    private float altura;
    private Triangulo triang;

    public Piramide() {
        triang =new Triangulo();
    }

    public Piramide(float alt) {
        triang=new Triangulo(5, alt);
        altura = alt;

    }

    public void setTriang(Triangulo t) {
        triang = t;
    }

    public Triangulo getTriang() {
        return triang;
    }
    public float calcularVolumen() {

        return (float) (((Math.pow(triang.getBase(), 2))/3)*altura);

    }

    public void dibujar() {
        System.out.println("Cargando imagen de piramide....");//jajaja que chistoso
    }


}
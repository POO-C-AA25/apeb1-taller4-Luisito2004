
public class Problema4_Visitante {
    public int edad;
    public int tipoJuego;
    public double altura;
    public boolean acceso;

    public Problema4_Visitante() {
    }

    public Problema4_Visitante(int edad, double altura) {
        this.edad = edad;
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "De acuerdo a su Edad" + edad + " y Altura " + altura + " ";
    }
  
}

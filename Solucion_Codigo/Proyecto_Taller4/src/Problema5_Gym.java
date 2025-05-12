
public class Problema5_Gym {
    public String nombre;
    public String[] tiposEjercicios;
    public int numClientesCompletRutina;
    public int numClientesTotales;
    public int tiempoPromedioInvertido;
    public boolean estado;

    public Problema5_Gym() {
    }

    public Problema5_Gym(String nombre, String[] tiposEjercicios){
        this.nombre = nombre;
        this.tiposEjercicios = tiposEjercicios;
    }
    
    public int calcularSumaTiempo(Problema5_Cliente[] clientes1, int cn){
        this.tiempoPromedioInvertido = this.tiempoPromedioInvertido + clientes1[cn].duracionEjercicio;
        return this.tiempoPromedioInvertido;
    }
    public int calcularTiempoPromedio(){
        this.tiempoPromedioInvertido = this.tiempoPromedioInvertido / this.numClientesTotales;
        return this.tiempoPromedioInvertido;
    }

    @Override
    public String toString() {
        return "\nNombre del Establecimiento: " + nombre +
                "\nNumero de Clientes Totales: " + numClientesTotales +
                "\nNumero de Clientes que Completaron su Rutina: " + numClientesCompletRutina +
                "\nTimepo Promedio Invertido: " + tiempoPromedioInvertido + " minutos";
    }
 
}

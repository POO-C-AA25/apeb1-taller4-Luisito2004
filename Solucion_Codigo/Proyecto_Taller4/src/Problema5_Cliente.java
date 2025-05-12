
public class Problema5_Cliente {
    public String nombre;
    public int tipoEjercicioSeleccionado;
    public int duracionEjercicio;
    public String cumplimiento;

    public Problema5_Cliente() {
    }

    public Problema5_Cliente(String nombre, int tipoEjercicioSeleccionado, int duracionEjercicio, String cumplimiento) {
        this.nombre = nombre;
        this.tipoEjercicioSeleccionado = tipoEjercicioSeleccionado;
        this.duracionEjercicio = duracionEjercicio;
        this.cumplimiento = cumplimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipoEjercicio() {
        return tipoEjercicioSeleccionado;
    }

    public void setTipoEjercicioSeleccionado(int tipoEjercicioSeleccionado) {
        this.tipoEjercicioSeleccionado = tipoEjercicioSeleccionado;
    }

    public int getDuracionEjercicio() {
        return duracionEjercicio;
    }

    public void setDuracionEjercicio(int duracionEjercicio) {
        this.duracionEjercicio = duracionEjercicio;
    }

    public String getCumplimiento() {
        return cumplimiento;
    }

    public void setCumplimiento(String cumplimiento) {
        this.cumplimiento = cumplimiento;
    }

    @Override
    public String toString() {
        return "Problema5_Cliente{" + "nombre=" + nombre + ", tipoEjercicio=" + tipoEjercicioSeleccionado + ", duracionEjercicio=" + duracionEjercicio + ", cumplimiento=" + cumplimiento + '}';
    }
 
}


public class Problema3_EntradaAutobus {
    public String nombreEstud;
    public String grado;
    public String ruta;
    public boolean permiso;

    public Problema3_EntradaAutobus() {
    }

    public Problema3_EntradaAutobus(String nombreEstud, String grado, String ruta) {
        this.nombreEstud = nombreEstud;
        this.grado = grado;
        this.ruta = ruta;
    }

    public String getNombreEstud() {
        return nombreEstud;
    }

    public void setNombreEstud(String nombreEstud) {
        this.nombreEstud = nombreEstud;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
    public boolean determinarPermiso(){
        if(this.ruta.equalsIgnoreCase("A") || this.ruta.equalsIgnoreCase("B")){
            return this.permiso = true;
        }else{
            return this.permiso = false;
        }
    }

    @Override
    public String toString() {
        return "-> El Estudiante de Nombre " + nombreEstud + " que se encuentra en " + grado + " grado ";
               
    }
  
}

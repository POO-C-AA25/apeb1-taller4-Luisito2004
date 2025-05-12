
public class Problema4_Parque {
    public String nombre;
    public String[] tipoJuegos;
    public boolean estado;
    public int numAceptados;

    public Problema4_Parque() {
    }

    public Problema4_Parque(String nombre, String[] tipoJuegos) {
        this.nombre = nombre;
        this.tipoJuegos = tipoJuegos;
    }
    public int determinarJuegosAdecuados(Problema4_Visitante[] visitantes1, int cn){
        int juego;
        juego = visitantes1[cn].tipoJuego;
        
        if(juego == 1 || juego == 2){
            // Puede subir a los Juegos 1 y 2
            if(visitantes1[cn].getEdad()>= 15 && visitantes1[cn].getAltura() >= 1.50){
                visitantes1[cn].acceso= true;
                this.numAceptados ++;
                return 1;
            }else{
                visitantes1[cn].acceso = false;
                this.numAceptados ++;
                return 0;
            }
                
        }else if(juego == 3 || juego == 4){  
            // Puede subir a los juegos 3 y 4 
            if(visitantes1[cn].getEdad() > 12 && visitantes1[cn].getAltura() > 1.30){
                visitantes1[cn].acceso = true;
                this.numAceptados ++;
                return 1;
            }else{
                visitantes1[cn].acceso = false;
                this.numAceptados ++;
                return 0;
            }
        }else{
            return -1;
        }
        
    }

    @Override
    public String toString(){
        return "\nNombre del Parque: " + nombre + 
               "\nNumero de Visitantes: " + numAceptados;
    }
    
 
}

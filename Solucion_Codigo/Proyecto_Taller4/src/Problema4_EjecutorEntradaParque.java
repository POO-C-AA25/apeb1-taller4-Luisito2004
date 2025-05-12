import java.util.Scanner;

public class Problema4_EjecutorEntradaParque {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] juegosParque1 = {"La Casa del Terror", "Montania Rusa", "Carritos Chocones", "Carrusel"};
        Problema4_Parque parque1 = new Problema4_Parque("Divertilandia", juegosParque1);
        Problema4_Visitante[] visitantes1 = new Problema4_Visitante[10];
        String eleccion;
        parque1.estado = true;
        int resultAcceso;

                
                
        do{
            
            for(int cn = 0; cn < visitantes1.length; cn ++){
                System.out.println("\n+-------------------+");
                System.out.println("| Ingreso al Parque |");
                System.out.println("+-------------------+");
                
                visitantes1[cn] = new Problema4_Visitante();
                System.out.print("Ingrese su Edad: ");
                visitantes1[cn].setEdad(sc.nextInt());
                System.out.print("Ingrese su Altura: ");
                visitantes1[cn].setAltura(sc.nextDouble());
                
                System.out.println("\n+-----------------------------+");
                System.out.println("| Lista de Juegos Disponibles |");
                System.out.println("+-----------------------------+");
                for(int i = 0; i < juegosParque1.length; i ++){
                    System.out.print("[" + (i + 1) + "] " + juegosParque1[i] + "\n");
                }
                System.out.print("Ingrese el Juego de su Eleccion: ");
                visitantes1[cn].tipoJuego = sc.nextInt();
                sc.nextLine();
                
                resultAcceso = parque1.determinarJuegosAdecuados(visitantes1, cn);
                if(resultAcceso == 1){
                    System.out.print(visitantes1[cn].toString());
                    System.out.println("\n-->Ud tiene Acceso al Juego Selecionado");
                }else if(resultAcceso == 0){
                    System.out.print(visitantes1[cn].toString());
                    System.out.println("\n-->Ud No tiene Acceso al Juego Selecionado");
                }else{
                    System.out.print(visitantes1[cn].toString());
                    System.out.println("\n-->Ud No tiene Acceso al Parque");
                }
              
                System.out.print("\nDesea cerrar el Parque (Si / No): ");
                eleccion = sc.nextLine();
                if(eleccion.equalsIgnoreCase("si")){
                    parque1.estado = false;
                    break;
                }
            }
            
        }while(parque1.estado);
        
        System.out.println("\n+-----------------+");
        System.out.println("| Resumen del Dia |");
        System.out.println("+-----------------+");
        System.out.println(parque1.toString());
    }
   
}

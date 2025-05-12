import java.util.Scanner;

public class Problema5_EjecutorRutinasGym {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] ejercicios = new String[]{"Cardio", "Fuerza", "Estiramiento"};
        Problema5_Gym gym1 = new Problema5_Gym("Titanus", ejercicios);
        Problema5_Cliente[] clientes1 = new Problema5_Cliente[20];
        String finalizarDia;
        gym1.estado = true;
        
        
        do{
            for(int cn = 0; cn < clientes1.length; cn ++){
                clientes1[cn] = new Problema5_Cliente();
                System.out.println("\n+---------------------+");
                System.out.println("| Registro de Rutinas |");
                System.out.println("+---------------------+");
                
                System.out.print("Ingrese su Nombre: ");
                clientes1[cn].setNombre(sc.nextLine());
                
                System.out.println("\n+--------------------+");
                System.out.println("| Tipo de Ejercicios |");
                System.out.println("+--------------------+");
                for(int i = 0; i < ejercicios.length; i ++){
                    System.out.print("[" + (i + 1) + "] " + ejercicios[i] + "\n");
                }
                System.out.print("Ingrese el Tipo de Ejercicio Realizado: ");
                clientes1[cn].setTipoEjercicioSeleccionado(sc.nextInt());
                if(clientes1[cn].getTipoEjercicio() == 1){
                }
                System.out.print("Duracion de la Rutina(minutos): ");
                clientes1[cn].setDuracionEjercicio(sc.nextInt());
                sc.nextLine();
                System.out.print("Logro Cumplir la Rutina (Si / No): ");
                clientes1[cn].setCumplimiento(sc.nextLine());
                if(clientes1[cn].cumplimiento.equalsIgnoreCase("Si")){
                    gym1.numClientesCompletRutina ++;
                }
                gym1.numClientesTotales ++;
                gym1.calcularSumaTiempo(clientes1, cn);
                
                System.out.print("Finalizar el Dia (Si / No): ");
                finalizarDia = sc.nextLine();
                if(finalizarDia.equalsIgnoreCase("Si")){
                    gym1.estado = false;
                    break;
                }

            }
            
        }while(gym1.estado);
        
        System.out.println("\n+----------------+");
        System.out.println("| Resumen de Dia |");
        System.out.println("+----------------+");
        gym1.calcularTiempoPromedio();
        System.out.println(gym1.toString());
        
    }
    
}

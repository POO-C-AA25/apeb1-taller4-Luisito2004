import java.util.Scanner;

public class Problema3_EjecutorEntradaAutobus {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Problema3_EntradaAutobus[] entrada1;
        int numEstud, numAceptados = 0;
        System.out.println("\n+-------------------------------------+");
        System.out.println("| SISTEMA DE ENTRADAS PARA EL AUTOBUS |");
        System.out.println("+-------------------------------------+\n");
        System.out.print("Ingrese la Cantidad de Estudiantes: ");
        numEstud = sc.nextInt();
        sc.nextLine();
        entrada1 = new Problema3_EntradaAutobus[numEstud];
        
        for(int cn = 0; cn < numEstud; cn ++){
            entrada1[cn] = new Problema3_EntradaAutobus();
            System.out.println("\nEstudiante N.-" + (cn + 1));
            System.out.print("Ingrese en Nombre del Estudiante: ");
            entrada1[cn].setNombreEstud(sc.nextLine());
            System.out.print("Ingrese el Grado: ");
            entrada1[cn].setGrado(sc.nextLine());
            System.out.print("Ingrese la Ruta: ");
            entrada1[cn].setRuta(sc.nextLine());               
        }
        for(int cn = 0; cn < numEstud; cn ++){
            entrada1[cn].determinarPermiso();
        }
        
        System.out.println("\n+------------+");
        System.out.println("| Resultados |");
        System.out.println("+------------+");
        
        for(int cn = 0; cn < entrada1.length; cn ++){
            System.out.print(entrada1[cn].toString());
            if(entrada1[cn].permiso){
                System.out.print("tiene permiso");
                numAceptados ++;
            }else{
                System.out.print("no tiene permiso");
            }
        }
        System.out.println("\nEl Total de Aceptados es: " + numAceptados + " y el Total de Rechazados es: " + (numEstud - numAceptados));
        
            
            
    }
    
}

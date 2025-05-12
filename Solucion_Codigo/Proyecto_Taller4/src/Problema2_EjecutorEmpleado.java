import java.util.Scanner;

public class Problema2_EjecutorEmpleado {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        int opc, porcentaje;
        double suma = 0;
        double promedio = 0;
      
        Problema2_Empleado[] empleados = new Problema2_Empleado[2];
        empleados[0] = new Problema2_Empleado();
        empleados[1] = new Problema2_Empleado();
        
        do{
            System.out.println("\nMENU PRINCIPAL");
            System.out.println("[1] Agregar Empleado");
            System.out.println("[2] Mostrar Informacion de los Empleados");
            System.out.println("[3] Calcular Aumento de Salario");
            System.out.println("[0] Salir");
            System.out.print("Ingrese su Eleccion: ");
            opc = sc.nextInt();
            
            switch(opc){
                case 1:
                    for(int cn = 0; cn < empleados.length; cn ++){
                        sc.nextLine();
                        System.out.println("\nEmpleado N.-" + (cn + 1));
                        System.out.print("Ingrese su Nombre: ");
                        empleados[cn].setNombre(sc.nextLine());
                        System.out.print("Ingrese su Salario: ");
                        empleados[cn].setSalario(sc.nextDouble());
                        System.out.print("Ingrese su Edad: ");
                        empleados[cn].setEdad(sc.nextInt());
                    }
                    break;
                case 2:
                    for(int cn = 0; cn < empleados.length; cn ++){
                        System.out.println("\nEmpleado N.-" + (cn + 1));
                        System.out.println(empleados[cn].toString());
                        
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el Porcentaje de Aumento: ");
                    porcentaje = sc.nextInt();
                    for(int cn = 0; cn < empleados.length; cn ++){
                        suma += empleados[cn].calcularSumaSalarios(empleados, cn);
                    }
                    for(int cn = 0; cn < empleados.length; cn ++){
                        empleados[cn].calcularPromedioSalarios(empleados, suma);
                    }
                    for(int cn = 0; cn < empleados.length; cn ++){
                        empleados[cn].calcularAumentoSalarios(porcentaje);
                    }
                    
            }        
        }while(opc != 0);
    }

}

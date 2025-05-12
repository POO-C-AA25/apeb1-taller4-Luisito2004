
public class Problema2_Empleado {   
    public String nombre;    
    public double salario; 
    public int edad;
    public double aumentoSalario;
    public double promedio;
    public double sumaSalarios;
    public int porcentaje;
        
    public Problema2_Empleado(){
    }
    public Problema2_Empleado(String nombre, double salario, int edad){
        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;
    }
       
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getSalario() {
        return this.salario;
    }

    public int getEdad() {
        return this.edad;
    }
               
    public double calcularSumaSalarios(Problema2_Empleado[] empleados, int cn){
        this.sumaSalarios += empleados[cn].getSalario(); 
        return this.sumaSalarios;
    }
    
    public double calcularPromedioSalarios(Problema2_Empleado[] empleados, double suma){
        this.promedio = suma / empleados.length;
        return this.promedio;
    }

    public double calcularAumentoSalarios(int porcentaje){
        this.porcentaje = porcentaje;
        if(this.salario < this.promedio){
            this.aumentoSalario = (this.salario * (this.porcentaje / 100.0));
            return this.aumentoSalario =this.salario + this.aumentoSalario;
        }
        return this.aumentoSalario = 0;
        
    }
    
    @Override
    public String toString() {
        return "\nNombre del Empleado: " + this.nombre +
                "\nSalario Base: " + this.salario +
                "\nEdad: " + this.edad + 
                "\nPromedio Salario: " + this.promedio +
                "\nAumento del Salario: " + this.aumentoSalario;
    }
        
        
}

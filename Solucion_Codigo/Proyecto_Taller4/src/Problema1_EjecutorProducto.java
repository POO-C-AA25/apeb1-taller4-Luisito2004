
public class Problema1_EjecutorProducto {
    public static void main(String[] args){

        Problema1_Producto producto1 = new Problema1_Producto(5.25, 2);
        Problema1_Producto producto2 = new Problema1_Producto(3.50, 4);
        
        
        producto1.calcularDescuento();
        producto1.calcularPrecioFinal();
        producto2.calcularDescuento();
        producto2.calcularPrecioFinal();
        System.out.println(producto1.toString());
        System.out.println(producto2.toString());
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
import java.io.File;
import java.util.Scanner;
import java.util.Locale;

public class T2MA22 {
    public static void main(String[] args) {
        // Ruta absoluta del archivo
        String ruta = "C:\\Users\\USUARIO\\Desktop\\TRABAJOS UTA KARLA GUANOTOA\\productos.txt";
        
        double totalVenta = 0;
        double maxSubtotal = -1;
        String prodMayor = "";

        System.out.println("--- DETALLE DE PRODUCTOS ---");
        System.out.println("-------------------------------------------");

        try {
            File archivo = new File(ruta);
            Scanner lector = new Scanner(archivo).useLocale(Locale.US);

            while (lector.hasNext()) {
                String nombreProd = lector.next();
                
                if (lector.hasNextDouble()) {
                    double precio = lector.nextDouble();
                    int cantidad = lector.nextInt();

                    double subtotal = precio * cantidad;
                    
                    System.out.printf("Producto: %-12s | Subtotal: $%.2f%n", nombreProd, subtotal);

                    totalVenta += subtotal;

                    if (subtotal > maxSubtotal) {
                        maxSubtotal = subtotal;
                        prodMayor = nombreProd;
                    }
                }
            }
            lector.close();

            System.out.println("-------------------------------------------");
            if (totalVenta > 0) {
                System.out.printf("TOTAL GENERAL DE LA VENTA: $%.2f%n", totalVenta);
                System.out.printf("PRODUCTO CON MAYOR GASTO:  %s ($%.2f)%n", prodMayor, maxSubtotal);
            }

        } catch (Exception e) {
            System.out.println("Error al leer el archivo. Revisa la ruta o el formato.");
        }
    }
}

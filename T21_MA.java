/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Karla
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class T21_MA {

    public static void main(String[] args) {
        // SOLUCIÓN: Ruta exacta hacia tu Escritorio
        // Asegúrate de cambiar USUARIO por el nombre que viste en tu PC
        String ruta = "C:/Users/USUARIO/Desktop/TRABAJOS UTA KARLA GUANOTOA/estudiantes.txt";
        File archivo = new File(ruta);
        
        if (!archivo.exists()) {
            System.out.println("Error: No se encontro el archivo.");
            System.out.println("Buscando en: " + ruta);
            return;
        }

        int totalEstudiantes = 0;
        double sumaPromedios = 0;

        try {
            Scanner lector = new Scanner(archivo);
            System.out.println("--- REPORTE DE CALIFICACIONES ---");

            while (lector.hasNext()) {
                String nombre = lector.next();
                double n1 = lector.nextDouble();
                double n2 = lector.nextDouble();
                double n3 = lector.nextDouble();
                
                double promedio = (n1 + n2 + n3) / 3.0;
                
                System.out.print("Nombre: " + nombre + " | Promedio: " + String.format("%.2f", promedio));

                // Clasificación según la actividad para estudiantes
                if (promedio >= 9) {
                    System.out.println(" | Estado: Excelente");
                } else if (promedio >= 7) {
                    System.out.println(" | Estado: Bueno");
                } else {
                    System.out.println(" | Estado: Reprobado");
                }

                sumaPromedios += promedio;
                totalEstudiantes++;
            }

            if (totalEstudiantes > 0) {
                System.out.println("-------------------------------------------");
                System.out.println("Total de estudiantes: " + totalEstudiantes);
                System.out.println("Promedio general del curso: " + String.format("%.2f", (sumaPromedios / totalEstudiantes)));
            }
            lector.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: No se pudo abrir el archivo.");
        } catch (Exception e) {
            System.out.println("Error: Verifique el formato de las notas (puntos o comas).");
        }
    }
}

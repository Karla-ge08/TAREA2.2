Algoritmo ProcesarEstudiantes
    Definir nombre Como Cadena
    Definir n1, n2, n3, promedio, sumaPromedios Como Real
    Definir total Como Entero
    
    total <- 0
    sumaPromedios <- 0
    
    Escribir "Ingrese nombre (o use la palabra fin para salir):"
    Leer nombre
    
    Mientras nombre <> "fin" Hacer
        Escribir "Ingrese nota 1:"
        Leer n1
        Escribir "Ingrese nota 2:"
        Leer n2
        Escribir "Ingrese nota 3:"
        Leer n3
        
        promedio <- (n1 + n2 + n3) / 3
        
        Si promedio >= 9 Entonces
            Escribir "Nombre: ", nombre, " Promedio: ", promedio, " - Excelente"
        Sino 
            Si promedio >= 7 Entonces
                Escribir "Nombre: ", nombre, " Promedio: ", promedio, " - Bueno"
            Sino
                Escribir "Nombre: ", nombre, " Promedio: ", promedio, " - Reprobado"
            FinSi
        FinSi
        
        sumaPromedios <- sumaPromedios + promedio
        total <- total + 1
        
        Escribir "Ingrese siguiente nombre (o fin):"
        Leer nombre
    FinMientras
    
    Si total > 0 Entonces
        Escribir "-------------------------------------------"
        Escribir "Total de estudiantes: ", total
        Escribir "Promedio general: ", sumaPromedios / total
    Sino
        Escribir "No hay datos para mostrar"
    FinSi
    
FinAlgoritmo

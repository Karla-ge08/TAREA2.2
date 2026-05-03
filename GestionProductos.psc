Algoritmo GestionProductos
	Definir nombreProd, prodMayor Como Cadena
	Definir precio, subtotal, totalVenta, maxSubtotal Como Real
	Definir cantidad Como Entero
	
	totalVenta <- 0
	maxSubtotal <- 0
	prodMayor <- ""
	
	Escribir "Ingrese nombre del producto o escriba fin:"
	Leer nombreProd
	
	Mientras nombreProd <> "fin" Hacer
		Escribir "Ingrese precio:"
		Leer precio
		Escribir "Ingrese cantidad:"
		Leer cantidad
		
		subtotal <- precio * cantidad
		Escribir "Subtotal de ", nombreProd, ": ", subtotal
		
		totalVenta <- totalVenta + subtotal
		
		// Logica para encontrar el producto de mayor gasto
		Si subtotal > maxSubtotal Entonces
			maxSubtotal <- subtotal
			prodMayor <- nombreProd
		FinSi
		
		Escribir "Ingrese el nombre del siguiente producto o fin:"
		Leer nombreProd
	FinMientras
	
	Si totalVenta > 0 Entonces
		Escribir "-------------------------------------------"
		Escribir "Total de la venta es: ", totalVenta
		Escribir "El producto con mayor gasto es: ", prodMayor
		Escribir "Con un subtotal de: ", maxSubtotal
	Sino
		Escribir "No se registraron productos"
	FinSi
FinAlgoritmo

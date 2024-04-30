Algoritmo BusquedaBinaria_y_MetodoBurbuja
	
	Definir valores, inicio, final, medio, posicion, j, i, temp, numeroABuscar Como Entero;

	Dimension valores[5];
	
	valores[0] = 4
	valores[1] = 2
	valores[2] = 8
	valores[3] = 19
	valores[4] = 14

	Escribir "Numeros: " Sin Saltar
	Para i = 0 Hasta 4 Con Paso 1 Hacer
		Escribir valores[i], " " Sin Saltar
	FinPara
	
	Escribir ""
	
	Escribir "Numeros ordenados: " Sin Saltar;
	
	// Ordenacion Burbuja
	Para i = 0 Hasta 4-1 Con Paso 1 Hacer
		
		Para j = 0 Hasta 4-1 Con Paso 1 Hacer
			
			Si valores[j] > valores[j+1] Entonces
				
				temp = valores[j];
				valores[j] = valores[j+1];
				valores[j+1] = temp;
				
			FinSi
 			
		FinPara
		
	FinPara

	Para i = 0 Hasta 4 Con Paso 1 Hacer
		
		Escribir valores[i], " " Sin Saltar;
		
	FinPara
	
	Escribir ""
	
	// Busqueda Binaria
	inicio = 0;
	final = 5-1;
	posicion = -1;
	
	Escribir "Digite el número a buscar: " Sin Saltar;
	Leer numeroABuscar;

	Mientras (inicio <= final) Hacer
		
		medio = trunc(inicio + (final-inicio)/2);
		
		Si valores[medio] == numeroABuscar Entonces
			
			posicion = medio;
			inicio = final + 1 
			
		SiNo
			
			Si valores[medio] < numeroABuscar Entonces
				
				inicio = medio + 1;
				
			SiNo
				
				final = medio - 1;
				
			FinSi
			
		FinSi
		
	FinMientras

	Si posicion <> -1 Entonces
		Escribir "Número ", numeroABuscar, " encontrado en la posicion ", (posicion+1);
	SiNo
		Escribir "Número ", numeroABuscar, " NO ENCONTRADO";
	FinSi
	
	
	
FinAlgoritmo

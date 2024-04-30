Algoritmo sin_titulo
	
	Definir inicio, finBusqueda, medio, elementoBuscado Como Entero
	Definir encontro Como Logico
	Escribir "Digite la longitud del array: " Sin Saltar
	leer longitud_array
	Dimension valores[longitud_array]
	
	Para i=0 Hasta longitud_array-1 Con Paso 1 Hacer
		Escribir "Posicion ", (i+1), "°: " Sin Saltar
		Leer valores[i]
	FinPara
	
	inicio = 0;
	finBusqueda = longitud_array;
	encontro = Falso
	posicion = -1
	
	Escribir "Digite el elemento que desea buscar: " Sin Saltar
	leer elementoBuscado
	
	Mientras (encontro = falso) y (inicio <= finBusqueda) Hacer
		medio = trunc((inicio+finBusqueda)/2)
		si valores[medio] == elementoBuscado Entonces
			encontro = Verdadero
			posicion = medio
		SiNo
			si valores[medio] < elementoBuscado Entonces
				inicio = medio + 1
			SiNo
				finBusqueda = medio - 1
			FinSi
		FinSi
		
	FinMientras
	
	si posicion == -1 Entonces
		Escribir "Elemento no encontrado"
	SiNo
		Escribir "Elemento ", elementoBuscado, " encontrado en la posicion ", (posicion+1)
	FinSi
	
	
FinAlgoritmo

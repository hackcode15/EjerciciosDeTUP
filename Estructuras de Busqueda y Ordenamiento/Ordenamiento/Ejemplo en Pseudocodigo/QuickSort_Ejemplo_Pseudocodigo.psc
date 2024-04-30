Funcion quicksort(array, primero, ultimo)
	
	Definir i, j Como Entero
	Definir pivote, tmp Como Real
	
	Si primero < ultimo Entonces
		
		i := primero
		j := ultimo
		pivote := array[Redon((primero+ultimo)/2)]
		
		Mientras i <= j Hacer
			
			Mientras array[i] < pivote Hacer
				i := i + 1
			FinMientras
			
			Mientras array[j] > pivote Hacer
				j := j - 1
			FinMientras
			
			Si i <= j Entonces				
				tmp := array[i]
				array[i] := array[j]
				array[j] := tmp
				i := i + 1
				j := j - 1
			FinSi
			
		FinMientras
		
		Si primero < j Entonces
			quicksort(array, primero, j)
		FinSi
		
		Si i < ultimo Entonces
			quicksort(array, i, ultimo)
		FinSi
		
	FinSi
	
FinFuncion

Algoritmo QuickSort_Ordenamiento
	
	Definir a Como Real
	Definir n Como Entero
	
	Dimension a[10]
	
	n := 10
	
	a[0] := 5.2
	a[1] := 3.7
	a[2] := 8.1
	a[3] := 9
	a[4] := 1.9
	a[5] := 6.6
	a[6] := 6
	a[7] := 2
	a[8] := 22
	a[9] := 12
	
	Escribir "Array original: "
	
	Para i = 0 Hasta n-1 Con Paso 1 Hacer
		Escribir a[i], " " Sin Saltar
	FinPara
	
	Escribir ""
	
	quicksort(a, 0, n-1)
	
	Escribir "Array ordenado: "
	Para i = 0 Hasta n-1 Con Paso 1 Hacer
		Escribir a[i], " " Sin Saltar
	FinPara
	
	Escribir ""
	
	
FinAlgoritmo

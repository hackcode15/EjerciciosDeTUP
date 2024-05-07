/*
Escriba un algoritmo que efectúe la normalización de una colección de números reales (float).
Para llevar a cabo esta normalización, se debe en primer lugar encontrar el número mayor de la
colección; luego se divide cada número por dicho valor máximo, de forma que los valores
resultantes (normalizados) estén comprendidos en el intervalo del 0 al 1.
*/
package arreglos;

public class Ejercicio9_Arreglos {

    static float encontrarValorMaximo(float arreglo[]){
    
        float max = arreglo[0];
        
        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i] > max){
                max = arreglo[i];
            }
        }
        
        return max;
        
    }
    
    static float[] normalizarArreglo(float arreglo[], float max){
        
        float arrNormalizado[] = new float[arreglo.length];
        
        for (int i = 0; i < arreglo.length; i++) {
            arrNormalizado[i] = arreglo[i] / max;
        }
        
        return arrNormalizado;
        
    }
    
    static void imprimirArreglo(float arreglo[]){
        
        for (float arr : arreglo) {
            System.out.print(arr + " ");
        }
        
        System.out.println("");
        
    }
    
    public static void main(String[] args) {
        
        float numeros[] = {3.0f, 7.5f, 1.2f, 5.8f, 2.4f};
        
        System.out.print("Arreglo original: ");
        imprimirArreglo(numeros);
        
        float numMax = encontrarValorMaximo(numeros);
        
        System.out.println("Valor maximo: " + numMax);
        
        float arregloNormalizado[] = normalizarArreglo(numeros, numMax);
        
        System.out.print("Arreglo normalizado: ");
        imprimirArreglo(arregloNormalizado);
        
        
        
    }
    
}

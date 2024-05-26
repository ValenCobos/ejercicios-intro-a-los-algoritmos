
/**
 * Clase ArrayUtils: contiene implementaciones de rutinas fundamentales
 * sobre arreglos.
 * 
 * @author N. Aguirre
 * @version 0.1
 */
public class ArrayUtils
{
    
    /**
     * Comprueba si un elemento (entero) pertenece a un arreglo.
     */
    public boolean pertenece(int elem, int[] arreglo) {
        if (arreglo == null)
            throw new IllegalArgumentException("Arreglo nulo");
        for (int i = 0; i < arreglo.length; i++){
            if (arreglo[i] == elem){
                return true;
            }
        }
        return false;
    }
    
    /**
     * Calcula la suma de los elementos de un arreglo de enteros
     */
    public int suma(int[] arreglo) {
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        return suma;
    }
    
    /**
     * Calcula el valor mínimo de un arreglo de reales
     */
    public float minimo(float[] arreglo) {
        if (arreglo == null){
            throw new IllegalArgumentException ("el arreglo no debe ser nulo");
        } 
        float min = arreglo[0];
        for (int i = 0; i < arreglo.length; i++){
            if (min > arreglo[i]){
                    min = arreglo[i];
            }
        }
        return min;
    } 
    
    
    /**
     * Calcula el valor máximo de un arreglo de reales
     */
    public float maximo(float[] arreglo) {
        if (arreglo == null){
            throw new IllegalArgumentException ("el arreglo no debe ser nulo");
        } 
        float max = arreglo[0];
        for (int i = 0; i < arreglo.length; i++){
            if (max < arreglo[i]){
                    max = arreglo[i];
            }
        }
        return max;
    }
    
    
    /**
     * Calcula el valor promedio de un arreglo de reales
     */
    public float promedio(float[] arreglo) {
        float suma = 0;
        float prom = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
            prom = suma / arreglo.length;
        }
        return prom;
        
    }
    
    /**
     * Retorna un arreglo con los primeros n números de Fibonacci
     */
    public int[] fibSequence(int n) {
        if (n < 1){
            throw new IllegalArgumentException("n debe ser mayor a 0");
        } else {
            int[] arr = new int[n];
            arr[0] = 0;
        if (n > 1) {
            arr[1] = 1;
        }
            for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            }
        return arr;
        }
    }
    
    /**
     * Calcula la mediana de un arreglo de reales
     */
    public float mediana(float[] arreglo) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return 0;
    }
    
    /**
     * Comprueba si dos arreglos de enteros son iguales
     */
    public boolean iguales(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length){
            return false;
        } else {
            int i = 0;
            boolean encontrado = true;
            while (i < arr1.length && encontrado){
                if (arr1[i] != arr2[i]){
                    encontrado = false;
                }
                i++;
            }
            return encontrado;
        }  
    }
    
    /**
     * Comprueba si un arreglo tiene valores repetidos
     */
    public boolean tieneRepetidos(int[] arreglo) {
        if (arreglo == null){
            throw new IllegalArgumentException("el arreglo no debe ser nulo");
        }
        int i = 0;
        int num = arreglo [0];
        boolean rep = false;
        while (i < arreglo.length && !rep){
            if (num == arreglo[i]){
                rep = true;
            } else {
                rep = false;
            }
            i++;
        }
        return rep;
    }
    
    /**
     * Comprueba si un arreglo tiene dos valores cuya suma dé cero.
     */
    public boolean tieneOpuestos(float[] arreglo) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return false;
    }
    
}

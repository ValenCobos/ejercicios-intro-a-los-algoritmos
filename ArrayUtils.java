
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
     * precondicion: todos los elementos del arreglo deben de estar ordenados.
     */
    public float mediana(float[] arreglo) {
        if (arreglo == null){
            throw new IllegalArgumentException("el arreglo no debe ser nulo");
        }
        assert ordenado(arreglo):"el arreglo no esta ordenado";
        float num = 0;
        if (arreglo.length % 2 == 1){
            num = arreglo[arreglo.length / 2];
        } else {
            int arrDiv = (arreglo.length / 2);
            num = arreglo[arrDiv] + arreglo[arrDiv-1];
        }
        return num; 
    }
    
    /**
     * Comprueba si dos arreglos de enteros son iguales
     */
    public boolean iguales(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null){
            throw new IllegalArgumentException("uno de los arreglos es nulo");
        }
        if (arr1.length != arr2.length){
            return false;
        } else {
            int i = 0;
            boolean iguales = true;
            while (i < arr1.length && iguales){
                if (arr1[i] != arr2[i]){
                    iguales = false;
                }
                i++;
            }
            return iguales;
        }  
    }
    
    /**
     * Comprueba si un arreglo tiene valores repetidos
     */
    public boolean tieneRepetidos(int[] arreglo) {
        if (arreglo == null){
            throw new IllegalArgumentException("el arreglo no debe ser nulo");
        }
        if (arreglo.length < 2){
            throw new IllegalArgumentException("el arreglo debe tener al menos 2 elementos");
        }
        for(int i = 0; i < arreglo.length-1; i++){
            for(int j = i + 1; j < arreglo.length; j++){
                int test = arreglo[i];
                int test1 = arreglo[j];
                if (arreglo[i] == arreglo[j]){
                    return true;
                }
            }
        }
        return false;
    }
    
    /**
     * Comprueba si un arreglo tiene dos valores cuya suma dé cero.
     */
    public boolean tieneOpuestos(float[] arreglo) {
        if (arreglo == null){
            throw new IllegalArgumentException("el arreglo no debe ser nulo");
        }
        for (int i = 0; i < arreglo.length-1; i++){
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[i] + arreglo[j] == 0){
                return true;
                }
            }
        }
        return false;
    }
    
    public boolean ordenado(float [] arr){
        if (arr == null){
            throw new IllegalArgumentException (" el arreglo no debe ser nulo");
        }
        for (int i = 0; i < arr.length-1; i++){
            if (arr [i] <= arr[i+1]){
                return true;
            } 
        }
        return false;
    }
    
    public boolean TestB(int [] arr){
    int firstElement = arr[0]; // Obtener el primer elemento
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != firstElement) {
                // Si algún elemento es diferente del primer elemento, devuelve false
                return false;
            }
        }
        
        // Si no se encontró ningún elemento diferente, devuelve true
        return true;
    }
    public boolean verificarExpresion(int[] a) {
        int n = a.length;
        for (int i = 1; i <= n; i++) {
            if (a[n - 1] != a[n - i]) {
                return false;
            }
        }
        return true;
    }
            
    public static boolean compareElements(int[] arr, int i) {
        int n = arr.length;
        
        // Verificar si i está dentro del rango adecuado
        if (i < 0 || i >= n) {
            System.out.println("El índice i está fuera del rango.");
            return false;
        }
        
        // Comparar el elemento en la posición n con el elemento en la posición n - i
        return arr[n - 1] == arr[n - 1 - i];
    }
}


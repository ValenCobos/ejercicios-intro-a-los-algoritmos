
/**
 * Clase NumberUtils: contiene implementaciones de rutinas fundamentales
 * sobre números.
 * 
 * @author N. Aguirre
 * @version 0.1
 */
import java.util.ArrayList;

public class NumberUtils
{
    
    /**
     * Comprueba si un número es primo.
     */
    public boolean esPrimo(int n) {
    if (n <= 1) {
        return false;
    }
        for (int i = 2; i <= n / 2; i++) {
        if (n % i == 0) {
            return false;
        }
        }
        return true;
    }
    
    /**
     * Comprueba si un número es compuesto.
     */
    public boolean esCompuesto(int n) {
        if (n <= 1){
            return false;
        }
        if (esPrimo(n)){
            return false;
        } else {
            return true;
        }
    }

    /**
     * Calcula el máximo común divisor de dos números.
     */
    public int maximoComunDivisor(int n, int m) {
        int mcd = 1;
        int min = minimo(n, m);
    
        for(int i = 1; i <= min; i++){
            if (n % i == 0 && m % i == 0){
                mcd = i;
            }
        }
        return mcd;
    }

    /**
     * Calcula el mínimo común múltiplo de dos números.
     */
    public int minimoComunMultiplo(int n, int m) {
        int mcm = 0;
        if (n == 0 || m == 0){
            mcm = 0;
        } else {
            mcm = (n*m) / maximoComunDivisor(n,m);
        }
        return mcm;
    }
    
    /**
     * Calcula los divisores de un número.
     * Precondicion: n debe ser un numero positivo.
     */
    public ArrayList<Integer> divisores(int n) {
        if (n < 0){
            throw new IllegalArgumentException("el numero debe ser positivo");
        }
        ArrayList<Integer> divisoresDe = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++){
            int numero = i;
            if (n % numero == 0){
                divisoresDe.add(i);
            }
        }
        return divisoresDe;
    }
    
    
    /**
     * Calcula los primeros n números primos
     */
    public int[] primos(int n) {
        int [] numeros = new int [n];
        for (int i = 0; i < numeros.length; i++){
            if (esPrimo(i)){
                numeros[i]= i;
            }
        }
        return numeros;
    }
    
    /**
     * Calcula el n-ésimo número de Fibonacci
     */
    public int nthFib(int n) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return 0;
    }
    
    /**
     * Calcula los dígitos de un número entero positivo.
     */
    public ArrayList<Integer> digitos(int n) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return null;
    }
    
    /**
     * Calcula el valor mínimo de un arreglo de reales
     */
    public float minimo(float[] arreglo) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return 0;
    }
    
    /**
     * Calcula el valor máximo de un arreglo de reales
     */
    public float maximo(float[] arreglo) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return 0;
    }
    
    
    /**
     * Calcula el valor promedio de un arreglo de reales
     */
    public float promedio(float[] arreglo) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return 0;
    }
    
    /**
     * Retorna un arreglo con los primeros n números de Fibonacci
     */
    public int[] fibSequence(int n) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return null;
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
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return false;
    }
    
    /**
     * Comprueba si un arreglo tiene valores repetidos
     */
    public boolean tieneRepetidos(int[] arreglo) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return false;
    }
    
    /**
     * Comprueba si un arreglo tiene dos valores cuya suma dé cero.
     */
    public boolean tieneOpuestos(float[] arreglo) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return false;
    }
    private int minimo(int a, int b){
        if (a < b){
            return a;
        }else{
            return b;
        }
    }
}

package cerosnfactorial;

/**
 *
 * @author Martin Corrales
 * @version 1.0
 *
 */
public class CerosNfactorial {

    /**
     * Funcion que calcula el factorial de un numero entero
     * 
     * @param long x valor inicial en el caso del factorial siempre es 1
     * @param long n Numero al que se le sacara el factorial
     *
     * @return long Factorial de n
     *
     */
    public long factorial(long x, long n) {
        if (n > 0) {
            x = factorial(x, n - 1);
            x = x * n;
        } else {
            x = 1;
        }
        return x;
    }

    /**
     * Funcion que cuenta la cantidad de ceros en un numero long
     * 
     * @param long n numero
     *
     * @return int Cantidad de Ceros en el numero long n
     */
    public int cantidadCeros(long n) {
        String val = String.valueOf(n);
        int tam = val.length();
        int cant = 0;
        int i = 1;
        while (i < tam) {
            if (val.charAt(i) == '0') {
                cant++;
            }
            i++;
        }
        return cant;
    }
}

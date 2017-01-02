package test;

import cerosnfactorial.CerosNfactorial;


/**
 *
 * @author Martin Corrales
 */
public class testFactorial {

    public static void main(String[] args) {
        CerosNfactorial cf= new CerosNfactorial();
        long n = 24;
        long x = 1;
        long r;
        int cont = 0;
        while (cont <= n) {
            System.out.println("factorial de " + cont);
            x = cf.factorial(x, cont - 1);
            System.out.println(x);
            System.out.println("Cantidad de Ceros=" + cf.cantidadCeros(x));
            cont++;
        }
    }
}

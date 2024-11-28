/*
	6. Modificar el programa anterior perquè escriga els nombres parells en el mateix ordre en el qual es lligen. És a dir, que si es donen els números 6,4,3,2,1,0 escriga en pantalla 6,4,2.
*/

import java.util.Scanner;
import java.util.ArrayList;

public class ex6
{
    public static void main(String args[])
    {
        processarNumeros();
    }

    public static void processarNumeros()
    {
        Scanner ent = new Scanner(System.in);

        int n;

        System.out.println("Donar un número: ");
        n = ent.nextInt();
        if (n != 0) {
            if ((n%2)==0)
            	System.out.println(n);
            processarNumeros();
        }
    }
}

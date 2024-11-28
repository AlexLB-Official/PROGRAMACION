/*
    5. Indicar quin és el resultat d'executar el següent programa si s'introdueixen com a entrada els números 4,3,2,1 i 0:
    Defineix TU l'objecte Scanner necessari
public class ej5
{
	public static void main(String args[])
	{
		processarNumeros();
	}

	public static void processarNumeros()
	{
		int n;

		System.out.println("Donar un número:");
		n = ent.nextInt();
		if (n != 0)
		{
			processarNumeros();
			System.out.println(n);
		}
	}

    Resposta: El resultado del programa va a ser -> 1,2,3,4 los cuales se mostraran al terminar el programa. Ya que al momento de ejecutarse la condicional la funcion se llama a si misma
    lo que hace que antes de poder mostrar el resultado por pantalla nos pida de nuevo que introduzcamos por pantalla el siguiente. Por consiguiente no se mostraran los numeros hasta que
    se termine de llamar de manera recursiva la funcion. Y estos puedan pasar de estar guardados en memoria a mostrarse.
}
*/

import java.util.Scanner;

public class ex5
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
        if (n != 0)
        {
            processarNumeros();
            System.out.println(n);
        }
    }
}

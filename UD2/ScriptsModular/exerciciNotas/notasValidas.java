/*
    Programa que pide 7 notas válidas
        - obligar a que todas sean valides (entre 0 y 10)
    
    A mostrar
        - SI o NO promociona a 2n curso
    
    Para promocionar
        - media >= 5
        - máximo un suspenso
*/

import java.util.Scanner;

public class notasValidas {
    public static void main(String[] args) {
        Scanner mySc = new Scanner(System.in);

        // Creamos las variables
        int cont=1, suspensos=0;
        double notas, media=0;

        // Pedimos una nota
        System.out.print("Introduce una nota: ");
        notas = mySc.nextDouble();

        while (cont <= 6){
            if ((notas < 0) || (notas > 10))
                System.out.println("La nota introducida no es válida, introduce una nota entre 0 y 10.");
            else {
                if (notas < 5 ){
                    suspensos++;
                    media += notas;
                    cont++;
                } else {
                    media += notas;
                    cont++;
                }
            }

            System.out.print("Introduce una nota: ");
            notas = mySc.nextDouble();
        }
        if ((notas < 5)&&(notas >= 0)){
            suspensos++;
            media += notas;
        } else
            media += notas;

        if ((media/7) >=5)
            if (suspensos <= 1)
                System.out.println("¡Felicidades, promocionas a segundo!");
            else
                System.out.println("Lo sentimos, no puedes promocionar a segundo.");
        else
            System.out.println("Lo sentimos, no puedes promocinar a segundo.");
    }
}


import java.util.Scanner;

/*Problema 2
Realizar un programa Java que permita presentar en pantalla la siguiente secuencia:
	5/10
	10/12
	15/14
	20/16
	25/18
	30/20*/
public class Ejercicio2serie2 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int cont, lim, cont2;
        System.out.print("Ingresa el limite: ");
        lim = tcl.nextInt();
        cont=5;
        cont2=10;
        while(cont<=(lim*5)){
            System.out.print(cont+"/"+cont2+", ");
            cont+=5;
            cont2+=2;
        }
        System.out.println("");
    }
    
}
/*run:
Ingresa el limite: 10
5/10, 10/12, 15/14, 20/16, 25/18, 30/20, 35/22, 40/24, 45/26, 50/28, 
BUILD SUCCESSFUL (total time: 1 second)
*/
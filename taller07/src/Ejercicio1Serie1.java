/*
Problema 1
Realizar un programa Java que permita presentar en pantalla la siguiente secuencia:
	1/10, 2/11, 3/12, 4/13, 5/14, 6/15...

 */
import java.util.Scanner;

public class Ejercicio1Serie1 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int cont1, lim1;
        System.out.print("Escribeme el limite de los numero de: ");
        lim1 = tcl.nextInt();
        cont1 = 1;

        while (lim1 >= cont1) {
            System.out.print(cont1 + "/" + (cont1 + 9) + ", ");
            cont1++;

        }
        System.out.println("");
    }

}
/*run:
Escribeme el limite de los numero de: 10
1/10, 2/11, 3/12, 4/13, 5/14, 6/15, 7/16, 8/17, 9/18, 10/19, 
BUILD SUCCESSFUL (total time: 3 seconds)
*/

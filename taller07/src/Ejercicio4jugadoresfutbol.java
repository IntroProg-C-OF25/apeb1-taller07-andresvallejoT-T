
import java.util.Scanner;

/*Problema 4
Generar una solución que permita ingresar jugadores de fútbol; por cada jugador
se debe solicitar:

Nombre el jugador
Posición en el campo de juego
Edad
Estatura
El ciclo de ingreso de información deberá terminar cuando el usuario lo decida. 
Se debe imprimir el siguiente reporte (usar una cadena de acumulación):

Listado de Jugadores
1. Alexander Dominguez -Arquero-, edad 32, estatura 1.95
2. Xavier Arreaga -Defensa-, edad 24, estatura 1.85
3. Moisés Caicedo -Mediocentro-, edad 19, estatura 1.88
4. Ángel Mena -Delantero-, edad 32, estatura 1.75
5. Michael Estrada -Delantero-, edad 27, estatura 1.93
Promedio de edades:  26.8
Promedio de estaturas: 1.87*/
public class Ejercicio4jugadoresfutbol {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String jugador, posicion;
        double altura, promed, promalt;
        int edad, cont, lim;
        System.out.print("Dame cuanto jugadores desea registrar: ");
        lim = tcl.nextInt();
        cont = 1;
        promed = 0;
        promalt = 0;
        while (cont <= lim) {
            System.out.println("Deme el nombre, posicion edad y altura del jugador: ");
            jugador = tcl.next();
            posicion = tcl.next();
            edad = tcl.nextInt();
            altura = tcl.nextDouble();
            promed = edad + promed;
            promalt = promalt + altura;
            System.out.printf("%s-%s-%d-%.2f\n", jugador, posicion, edad, altura);
            cont++;
        }
        System.out.printf("promedio de edad: %.2f\n", (promed / lim));
        System.out.printf("Promedio de altura: %.2f\n", (promalt / lim));
    }
}
/*run:
Dame cuanto jugadores desea registrar: 3
Deme el nombre, posicion edad y altura del jugador: 

juan delantero 30 1,76
juan-delantero-30-1,76
Deme el nombre, posicion edad y altura del jugador: 
julian portero 25 1,8
julian-portero-25-1,80
Deme el nombre, posicion edad y altura del jugador: 
pedro defensa 17 1,93
pedro-defensa-17-1,93
promedio de edad: 24,00
Promedio de altura: 1,83
BUILD SUCCESSFUL (total time: 35 seconds)
*/

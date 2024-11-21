
/*Problema 3
Realizar un programa Java que permita pedir por teclado el nombre de 5 empleados.
Por cada empleado se debe solicitar el nombre, numero de días trabajados y costo 
del día trabajo. Calcular el valor a cancelar por la empresa para cada empleado. 
Presentar un reporte como el siguiente:
Nombre 1	10	$2.5	$25
Nombre 2	11	$2	$22
Nombre 3	9	$3	$27
Nombre 4	5	$4	$20
Nombre 5	12	$2	$24*/
import java.util.Scanner;

public class Ejercicio3empleados {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nom;
        int dias, cont;
        double costdia, total;
        cont = 1;

        while (cont <= 5) {
            System.out.println("Escribir el nombre del emplado los dias trabajados y el costo por dia: ");
            nom = tcl.next();
            dias = tcl.nextInt();
            costdia = tcl.nextDouble();

            total = dias * costdia;

            System.out.printf("|\t%s\t|\t%s\t|\t%s\t|\t%s\t%n", "NOMBRE", "DIAS TRABAJDOS", "COSTO POR DIA", "VALOR A PAGAR");
            System.out.printf("|\t%s\t|\t%d\t|\t%.2f\t|\t%.2f\t|%n", nom, dias, costdia, total);
            cont++;
        }

    }
}
/*
run:
Escribir el nombre del emplado los dias trabajados y el costo por dia: 
juan 8 1,2
|	NOMBRE	|	DIAS TRABAJDOS	|	COSTO POR DIA	|	VALOR A PAGAR	
|	juan	|	8	|	1,20	|	9,60	|
Escribir el nombre del emplado los dias trabajados y el costo por dia: 
pedro 5 2
|	NOMBRE	|	DIAS TRABAJDOS	|	COSTO POR DIA	|	VALOR A PAGAR	
|	pedro	|	5	|	2,00	|	10,00	|
Escribir el nombre del emplado los dias trabajados y el costo por dia: 
juan 9 1,1
|	NOMBRE	|	DIAS TRABAJDOS	|	COSTO POR DIA	|	VALOR A PAGAR	
|	juan	|	9	|	1,10	|	9,90	|
Escribir el nombre del emplado los dias trabajados y el costo por dia: 
pedro 3 3
|	NOMBRE	|	DIAS TRABAJDOS	|	COSTO POR DIA	|	VALOR A PAGAR	
|	pedro	|	3	|	3,00	|	9,00	|
Escribir el nombre del emplado los dias trabajados y el costo por dia: 
pepe 10 5
|	NOMBRE	|	DIAS TRABAJDOS	|	COSTO POR DIA	|	VALOR A PAGAR	
|	pepe	|	10	|	5,00	|	50,00	|
BUILD SUCCESSFUL (total time: 35 seconds)
*/

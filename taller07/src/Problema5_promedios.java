/*
 Problema 5
Generar un programa Java que permita ingresar 4 estudiantes; por cada uno de
ellos ingresar el nombre del estudiante, el promedio de ciclo. Presentar el 
siguiente reporte
Estudiante1	10	Aprobado
Estudiante2	6.9	Reprobado
Estudiante3	7	Aprobado
Estudiante4	5	Reprobado
Atención; con base al valor del promedio, usted debe asignar en cada registro 
el tipo Aprobado o Reprobado.*/
import java.util.Scanner;

public class Problema5_promedios {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombre, estado;
        double promedio;
        int cont = 1;
        while (cont<=4) {
            System.out.print("dame nombre y promedio del estudiante"+cont+": ");
            nombre=tcl.next();
            promedio = tcl.nextDouble();
            if (promedio>=7){
                estado="Aprobado";
            }else {
                estado="Reprobado";
            }
            System.out.printf("|\t%s\t|\t%s\t\t|\t%s\t         |%n", "nombre", "promedio","estado");
            System.out.printf("|\t%s\t|\t%.2f\t         \t|\t%s\t |%n", nombre, promedio, estado);
            cont++;
        }

    }
}
/*run:
dame nombre y promedio del estudiante1: pedro 6,9
|	nombre	|	promedio		|	estado	         |
|	pedro	|	6,90	         	|	Reprobado	 |
dame nombre y promedio del estudiante2: juan 7
|	nombre	|	promedio		|	estado	         |
|	juan	|	7,00	         	|	Aprobado	 |
dame nombre y promedio del estudiante3: julian 1
|	nombre	|	promedio		|	estado	         |
|	julian	|	1,00	         	|	Reprobado	 |
dame nombre y promedio del estudiante4: pepe 10
|	nombre	|	promedio		|	estado	         |
|	pepe	|	10,00	         	|	Aprobado	 |
BUILD SUCCESSFUL (total time: 12 seconds)
*/
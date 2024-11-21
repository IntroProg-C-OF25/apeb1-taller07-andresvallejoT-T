
import java.util.Scanner;

/*Problema 6
Una empresa de comercialización de computadoras realiza el proceso de venta 
haciendo un descuento por tipo de cliente: Si es cliente tipo 1 hay un descuento 
del 10% Si es cliente tipo 2 hay un descuento del 20% En caso que sea otro tipo
de cliente, no hay descuento. Generar un proceso que permita ingresar 7 ventas:
por cada venta preguntar los siguiente datos:

Nombre del cliente
Costo de la computadora (solo se vende una computadora por transacción)
Tipo de cliente Presentar el siguiente reporte: Cliente tipo 1, compra computadora 
con precio $100*/
public class problema6_emprezadecomercializacion {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String name;
        double costo, total;
        int tipo;
        System.out.println("Ingresar su nombre, el costo de la computadora y tipo de cliente 1,2 u otro: ");
        name = tcl.next();
        costo = tcl.nextDouble();
        tipo = tcl.nextInt();
        total = costo;
        if (tipo == 1) {
            total = costo - (costo * 0.1);

            System.out.printf("Cliente %s de tipo %s, compra computadora de %.2f\n", name, tipo, total);
        } else if (tipo == 2) {
            total = costo - (costo * 0.2);
            System.out.printf("Cliente %s de tipo %s, compra computadora de %.2f\n", name, tipo, total);
        } else {

            System.out.printf("Cliente %s de tipo %s, compra computadora de %.2f\n", name, tipo, total);
        }
    }
}
/*run:
Ingresar su nombre, el costo de la computadora y tipo de cliente 1,2 u otro: 
andres 1000 2
Cliente andres de tipo 2, compra computadora de 800,00
BUILD SUCCESSFUL (total time: 4 seconds)*/

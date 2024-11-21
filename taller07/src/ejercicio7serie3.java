
import java.util.Scanner;

/*Problema 7
Generar e imprimir la siguiente serie:

sumatoria = -(1/1)+(1/2)-(1/3)+(1/4)-(1/5)+(1/6)-(1/7)+(1/8)-(1/9)+(1/10)*/
public class ejercicio7serie3 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int cont, val, limt, val2;
        System.out.println("Escribir el limite");
        limt = tcl.nextInt();
        cont = 1;
        val = 1;
        val2 = 2;
        while (cont <= limt) {
            System.out.print("-(1/" + val + ") +(1/" + val2 + ") ");
            val += 2;
            val2 += 2;
            cont++;

        }
        System.out.println("");
    }
}
/*
run:
Escribir el limite
10
-(1/1) +(1/2) -(1/3) +(1/4) -(1/5) +(1/6) -(1/7) +(1/8) -(1/9) +(1/10) -(1/11) +(1/12) -(1/13) +(1/14) -(1/15) +(1/16) -(1/17) +(1/18) -(1/19) +(1/20) 
BUILD SUCCESSFUL (total time: 1 second)*/

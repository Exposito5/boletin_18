package boletin_18;

import java.util.Scanner;

public class Boletin_18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, text;
        Buzon mail = new Buzon();

        Boolean comprobante = false;
        int num;

        do {
            do {
                System.out.println("---MENU---\n1.Mostrar Correos \n2.Cantidad \n3.Añadir \n4.no leídos \n5.Mostrar el primer correo no leido \n6.Eliminar \n7.Salir");
                System.out.println("Introduce un número del menú.");
                num = sc.nextInt();
            } while (num <= 7 && num < 0);
            switch (num) {
                case 1:
                    System.out.println("Mostrar");
                    System.out.println("Introduce el correo que deseas mostrar");
                    mail.mostrar(sc.nextInt());
                    break;
                case 2:

                    System.out.println("Cantidad");
                    System.out.println(mail.numeroDeCorreos());
                    break;

                case 3:
                    System.out.println("Introduce el nombre del emisor");
                    nombre = sc.next();
                    System.out.println("Introduce el texto del mail");
                    text = sc.next();
                    mail.añadir(new Correo(nombre, text, false));
                    break;

                case 4:

                    System.out.println("Correos no leídos");
                    System.out.println(mail.porLer());
                    break;

                case 5:
                    System.out.println("Mostrar el primer correo no leido");
                    System.out.println(mail.amosarPrimeiroNonLeido());
                    break;

                case 6:
                    System.out.println("Eliminar");
                    System.out.println("Introduce el correo que desexas eliminar");
                    mail.borrar(sc.nextInt());
                    break;

                case 7:
                    comprobante = true;
                    System.out.println("Saliendo del menú.");
                    break;
            }
        } while (comprobante == false);

    }

}
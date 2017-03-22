package boletin_18;

import java.util.ArrayList;
import java.util.Scanner;

public class Buzon {

    Scanner sc = new Scanner(System.in);
    ArrayList<Correo> correo;

    public Buzon() {
        correo = new ArrayList();
    }

    public int numeroDeCorreos() {

        return correo.size();

    }

    public void añadir(Correo c) {

        correo.add(c);

    }

    public boolean porLer() {
        int i = 0;
        boolean leidos = false;
        for (Correo correo1 : correo) {
            if (correo1.isLeido()) {
                i++;
            }
        }
        if (i != 0) {
            leidos = true;
        }

        return leidos;
    }

    public String amosarPrimeiroNonLeido() {
        int i;
        for (i = 0; i < correo.size(); i++) {
            if (correo.get(i).isLeido()) {
                break;
            }
            break;
        }

        return "E-mail --- " + correo.get(i).getNombreCorreo() + "\n Contenido  \n" + correo.get(i).getTexto();
    }

    public String mostrar(int k) {

        return correo.get(k).toString();
    }

    public void borrar(int k) {

        correo.remove(k);
    }

}

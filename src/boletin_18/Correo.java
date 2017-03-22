package boletin_18;

public class Correo {

    String nombrecorreo;
    String texto;
    boolean leido;

    public Correo() {

    }

    @Override
    public String toString() {
        return "Correo{" + "nomecorreo=" + nombrecorreo + ", leido=" + leido + ", texto=" + texto + '}';
    }

    public Correo(String nombrecorreo, String texto, boolean leido) {
        this.nombrecorreo = nombrecorreo;
        this.texto = texto;
        this.leido = leido;
    }

    public void setNombreCorreo(String nombrecorreo) {
        this.nombrecorreo = nombrecorreo;
    }

    public String getNombreCorreo() {
        return nombrecorreo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public boolean isLeido() {
        return leido;
    }

    public void setLeido(boolean leido) {
        this.leido = leido;
    }

}

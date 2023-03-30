package modelo;

public class Libro {
    private boolean disponibilidad;
    private  String titulo;
    private int cantPrestado;

    public boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public int getCantPrestado() {
        return cantPrestado;
    }

    public void setCantPrestado(int cantPrestado) {
        this.cantPrestado = cantPrestado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void Libro(){}

   public void Libro(int cantPrestado, String titulo,boolean disponibilidad){
        this.cantPrestado=cantPrestado;
        this.titulo=titulo;
        this.disponibilidad=disponibilidad;
   }

}

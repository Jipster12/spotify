package modelo;

public class Socio {
    private String nombre;
    private int cantLibrosleidos;
    private int matricula;

    public void setCantLibrosleidos(int cantLibrosleidos) {
        this.cantLibrosleidos = cantLibrosleidos;
    }

    public int getMatricula() {
        return matricula;
    }

    public int getCantLibrosleidos() {
        return cantLibrosleidos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void Socio(){}

    public void Socio(int cantLibrosleidos,String nombre,int matricula){
        this.cantLibrosleidos=cantLibrosleidos;
        this.nombre=nombre;
        this.matricula;
    }
}

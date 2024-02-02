package u4.u5.entregable;

public abstract class Agrupacion {
    protected String nombre;
    protected String autor;
    protected String autorMusica;
    protected String autorLetras;
    protected String tipo;

    public Agrupacion(String nombre, String autor, String autorMusica, String autorLetras, String tipo) {
        this.nombre = nombre;
        this.autor = autor;
        this.autorMusica = autorMusica;
        this.autorLetras = autorLetras;
        this.tipo = tipo;
    }

    public abstract void cantarPresentacion();

    public abstract void mostrarTipo();
}

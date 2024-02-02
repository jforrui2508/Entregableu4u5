package u4.u5.entregable;

public class Romancero extends Agrupacion implements Callejera{
	
	private String tematica;

	public Romancero(String nombre, String autor, String autorMusica, String autorLetras, String tipo, String tematica) {
        super(nombre, autor, autorMusica, autorLetras, tipo);
        this.tematica=tematica;
    }
	
    public void cantarPresentacion() {
        System.out.println("Cantando la presentación del Romancero con nombre " + nombre);
    }
    
    @Override
    public void mostrarTipo() {
        System.out.println("El Romancero " + nombre + " va de " + tipo);
    }
    
    @Override
    public void amoAEscuchar() {
        System.out.println("Amo a escucha la Chirigota " + nombre);
    }
}

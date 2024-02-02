package u4.u5.entregable;

public class Chirigota extends AgrupacionOficial implements Callejera{
	
	private int numCuples;
	private int ptsObtenidos;

	public Chirigota(String nombre, String autor, String autorMusica, String autorLetras, String tipo,
            int numCuples, int ptsObtenidos) {
    super(nombre, autor, autorMusica, autorLetras, tipo);
    this.numCuples=numCuples;
    this.ptsObtenidos = ptsObtenidos;
	}
	
    //Implemento los métodos de la clase AgrupacionOficial
	
	@Override
	public void cantarPresentacion() {
        System.out.println("Cantando la presentación de la Chirigota con nombre " + nombre);
    }
    
    @Override
    public void mostrarTipo() {
        System.out.println("La Chirigota " + nombre + " va de " + tipo);
    }
    
    @Override
    public void caminitoDelFalla() {
        System.out.println("La Chirigota " + nombre + " va caminito del falla");
    }
    
    @Override
    public void amoAEscuchar() {
        System.out.println("Amo a escucha la Chirigota " + nombre);
    }
}

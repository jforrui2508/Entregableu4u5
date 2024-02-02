package u4.u5.entregable;

public class Cuarteto extends AgrupacionOficial implements Callejera{
	
	private int numMiembros;
	private int ptsObtenidos;

	public Cuarteto(String nombre, String autor, String autorMusica, String autorLetras, String tipo,
            int numMiembros, int puntosObtenidos) {
    super(nombre, autor, autorMusica, autorLetras, tipo);
    this.ptsObtenidos = ptsObtenidos;
    this.numMiembros = numMiembros;
	}
	
    //Implemento los métodos de la clase AgrupacionOficial
	
	@Override
	public void cantarPresentacion() {
        System.out.println("Cantando la presentación del Cuarteto con nombre " + nombre);
    }
    
    @Override
    public void mostrarTipo() {
        System.out.println("El Cuarteto " + nombre + " va de " + tipo);
    }
    
    @Override
    public void caminitoDelFalla() {
        System.out.println("El Cuarteto " + nombre + " va caminito del falla");
    }
    
    @Override
    public void amoAEscuchar() {
        System.out.println("Amo a escucha la Chirigota " + nombre);
    }

}

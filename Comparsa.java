package u4.u5.entregable;

class Comparsa extends AgrupacionOficial{
	
	private String empresaAtrezzo;
	private int ptsObtenidos;
	

	public Comparsa(String nombre, String autor, String autorMusica, String autorLetras, String tipo,
            String empresaAtrezzo, int ptsObtenidos) {
    super(nombre, autor, autorMusica, autorLetras, tipo);
    this.empresaAtrezzo = empresaAtrezzo;
    this.ptsObtenidos = ptsObtenidos;
	}
	
    //Implemento los métodos de la clase AgrupacionOficial
	
	@Override
    public void caminitoDelFalla() {
        System.out.println("La Comparsa " + nombre + " va caminito del falla");
    }
    
    @Override
    public void cantarPresentacion() {
        System.out.println("Cantando la presentación de la Comparsa con nombre " + nombre);
    }
    
    @Override
    public void mostrarTipo() {
        System.out.println("La Comparsa " + nombre + " va de " + tipo);
    }

}

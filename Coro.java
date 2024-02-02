package u4.u5.entregable;

class Coro extends AgrupacionOficial{

	int numBandurrias;
    int numGuitarras;
    int ptsObtenidos;

    public Coro(String nombre, String autor, String autorMusica, String autorLetras, String tipo,
                int numeroBandurrias, int numeroGuitarras, int ptsObtenidos) {
        super(nombre, autor, autorMusica, autorLetras, tipo);
        this.numBandurrias = numeroBandurrias;
        this.numGuitarras = numeroGuitarras;
        this.ptsObtenidos = ptsObtenidos;
    }
    
    //Implemento los métodos de la clase AgrupacionOficial
    
    @Override
    public void caminitoDelFalla() {
        System.out.println("El coro " + nombre + " va caminito del falla");
    }
    
    @Override
    public void cantarPresentacion() {
        System.out.println("Cantando la presentación del Coro con nombre " + nombre);
    }
    
    @Override
    public void mostrarTipo() {
        System.out.println("El Coro " + nombre + " va de " + tipo);
    }

}

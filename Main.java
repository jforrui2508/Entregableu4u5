package u4.u5.entregable;

public class Main {

	public static void main(String[]args) {
		
		//Creo las instancias de las agrupaciones con sus datos
		
		Coro coro1 = new Coro("Coro1", "Autor1", "Musica1", "Letras1", "Disfraz1", 5, 3, 100);
        Comparsa comparsa1 = new Comparsa("Comparsa1", "Autor2", "Musica2", "Letras2", "Disfraz2", "Atrezzo1", 90);
        Chirigota chirigota1 = new Chirigota("Chirigota1", "Autor3", "Musica3", "Letras3", "Disfraz3", 2, 80);
        Cuarteto cuarteto1 = new Cuarteto("Cuarteto1", "Autor4", "Musica4", "Letras4", "Disfraz4", 4, 120);
        Romancero romancero1 = new Romancero("Romancero1", "Autor5", "Musica5", "Letras5", "Disfraz5", "Cartelon1");
        
        // Crear la instancia del integrante
        
        Integrante integrante1 = new Integrante(1, 25, "Pepe", "Cádiz");
		}
		
		coro1.mostrarTipo();
		coro1.cantarPresentacion();
		coro1.caminitodelFalla();
		
		comparsa1.mostrarTipo();
		comparsa1.cantarPresentacion();
		comparsa1.caminitodelFalla();
		
		chirigota1.mostrarTipo();
		chirigota1.cantarPresentacion();
		chirigota1.caminitodelFalla();
		
		cuarteto1.mostrarTipo();
		cuarteto1.cantarPresentacion();
		cuarteto1.caminitodelFalla();
		
		romancero1.mostrarTipo();
		romancero1.cantarPresentacion();
		romancero1.caminitodelFalla();
		
		
}

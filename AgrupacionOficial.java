package u4.u5.entregable;

abstract class AgrupacionOficial extends Agrupacion{
	
	private Integrante[] integrantes;

	public AgrupacionOficial(String nombre, String autor, String autorMusica, String autorLetras, String tipo) {
        super(nombre, autor, autorMusica, autorLetras, tipo);
    }

    public abstract void caminitoDelFalla();
    
    //Inserto un integrante, si la posición es nula entonces lo añadirá
    
    public void insertar_integrante(Integrante integrante) {
        for (int i = 0; i < integrantes.length; i++) {
            if (integrantes[i] == null) {
                integrantes[i] = integrante;
                break;
            }
        }
    }

    //Elimino un integrante, si no es nulo y coincide entonces lo elimino 
    
    public boolean eliminar_integrante(Integrante integrante) {
        for (int i = 0; i < integrantes.length; i++) {
            if (integrantes[i] != null && integrantes[i].equals(integrante)) {
                integrantes[i] = null;
                return true;
            }
        }
        return false;
    }
}

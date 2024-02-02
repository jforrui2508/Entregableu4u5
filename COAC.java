package u4.u5.entregable;

public class COAC{
	
	public Agrupacion[] agrupaciones;
	public static int numAgrupaciones = 0;
	
	public COAC() {
        this.agrupaciones = new Agrupacion[50]; // Asumiendo un máximo de 50 agrupaciones oficiales, puedes ajustarlo según tus necesidades.
    }
	
	public void inscribir_agrupacion(AgrupacionOficial agrupacion) {
        for (int i = 0; i < agrupaciones.length; i++) {
            if (agrupaciones[i] == null) {
            	agrupaciones[i] = agrupacion;
                numAgrupaciones++;
                break;
            }
        }
    }

    public boolean eliminar_agrupacion(AgrupacionOficial agrupacion) {
        for (int i = 0; i < agrupaciones.length; i++) {
            if (agrupaciones[i] != null && agrupaciones[i].equals(agrupacion)) {
            	agrupaciones[i] = null;
                numAgrupaciones--;
                return true;
            }
        }
        return false;
    }
    
}

	


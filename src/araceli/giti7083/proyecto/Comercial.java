package araceli.giti7083.proyecto;
/**
 * * Declaracion de la clase Comercial *
 * 
 * @author Araceli Colmenero * Ultima revision: Febrero 2016
 */
public class Comercial {
	
	private String estado;
	private String nombre;
	private String apellidos;
	private String telefono;
	private String domicilio;
	private String rfc;
	
	//Dependencia
	IConsultarEstado iConsultarEstado;
	private Presupuesto[] calcula;
}

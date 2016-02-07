package araceli.giti7083.proyecto;
/**
 * * Declaracion de la clase Proyecto *
 * 
 * @author Araceli Colmenero * Ultima revision: Febrero 2016
 */
import java.awt.List;
import java.util.Date;




public class Proyecto {
	private String nombre;
	private String planificacion;
	private Date fechaInicio;
	private Date fechaFin;
	private String descripcion;
	private String estado;

	private Maquina[] tieneAsignadas;
	private Presupuesto[] tiene;
	//private Remitente remitente;
}

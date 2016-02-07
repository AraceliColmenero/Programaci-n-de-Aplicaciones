 package araceli.giti7083.proyecto;
 /**
  * * Declaracion de la clase Presupuesto *
  * 
  * @author Araceli Colmenero * Ultima revision: Febrero 2016
  */
import java.util.Date;

public abstract class Presupuesto implements IConsultarEstado{
	private Date fecha;
	private String descripcion;
	private double importe;
	private String estado;
	private Viaje[] seRealizaen;
}

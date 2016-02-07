package araceli.giti7083.telefonos;
/**
 * * Declaracion de la clase Telefono fijo *
 * 
 * @author Araceli Colmenero * Ultima revision: Febrero 2016
 */
public class TelefonoFijo implements Telefono {
public int marcarNumero(int numero){
	return numero;
}
public boolean  llamadaEnProceso(){
	return false;
}
}

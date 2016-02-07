package araceli.giti7083.telefonos;
/**
 * * Declaracion de la clase Test *
 * 
 * @author Araceli Colmenero * Ultima revision: Febrero 2016
 */
public class TestTelefonos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono t;
		t=new TelefonoFijo();
		 System.out.println("El Tel Fijo esta marcando: "+t.marcarNumero(12));
		t=new TelefonoMovil();
		 System.out.println("El Tel Movil esta marcando: "+t.marcarNumero(15));
		t=new VideoTelefono();
		 System.out.println("El Video telefono esta marcando: "+t.marcarNumero(16));

	}

}

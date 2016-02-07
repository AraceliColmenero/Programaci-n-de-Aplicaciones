package araceli.giti7083.factory;
/**
 * * Declaracion de la clase Factorian Concreta 2 *
 * 
 * @author Araceli Colmenero * Ultima revision: Febrero 2016
 */
public abstract class FactoriaConcreta2 implements AbstractFactory{
	//Dependencias
	 ProductoA2 productoA2;
	 ProductoB2 productoB2;
	 
	 //Implementacion de Métodos
	
	public FactoriaConcreta2() {
		
	}
	public void crearProductoA(){
		productoA2=new ProductoA2();
		 System.out.println("Producto A1 creado");	
				
		
	}
	public void crearProductoB(){
		productoB2=new ProductoB2();
		 System.out.println("Producto B2 creado");	
	}
}

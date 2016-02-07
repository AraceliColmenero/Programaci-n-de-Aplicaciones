package araceli.giti7083.factory;
/**
 * * Declaracion de la clase test *
 * 
 * @author Araceli Colmenero * Ultima revision: Febrero 2016
 */
public class TestFactory {
	
public static void main(String[] args) {
	AbstractFactory afa= new FactoriaConcreta2() {
};
afa.crearProductoA();
afa.crearProductoB();
}


}

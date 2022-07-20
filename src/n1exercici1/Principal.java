package n1exercici1;

public class Principal {
//	- Exercici 1
//	Crea una jerarquia d’objectes amb tres classes:  Treballador, TreballadorOnline i TreballadorPresencial.
//
//	La classe Treballador té els atributs nom, cognom, preu/hora, i el mètode calcularSou() que rep per paràmetre el nombre d'hores treballades i el multiplica pel preu/hora. Les classes filles l'han de sobreescriure,  emprant @Override. 
//
//	Des del main() de la classe Principal, fes les invocacions necessàries per demostrar el funcionament de l’anotació @Override.
//
//	En els treballadors presencials, el mètode per calcular el seu sou, rebrà per paràmetre el nombre d’hores treballades al mes. A l’hora de calcular el sou es multiplicarà el nombre d’hores treballades pel preu/hora, més el valor d'un atribut static anomenat benzina que afegirem en aquesta classe.
//
//	En els treballadors online, el mètode per calcular el seu sou rebrà per paràmetre el nombre d'hores treballades al mes. A l'hora de calcular el sou es multiplicarà el nombre d'hores treballades pel preu/hora i se li sumarà el preu de la tarifa plana d'Internet, que serà una constant de la classe TreballadorOnline.

//	- Exercici 2
	//	Afegeix a les classes filles alguns mètodes obsolets (deprecated), 
	// i utilitza l’anotació corresponent. Invoca des d'una classe externa els mètodes obsolets,
	// suprimint mitjançant l'anotació corresponent els “warnings” per ser obsolets.

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		Trabajador trabajador1 = new TrabajadorOnline("Alex", "Rock", 30);
		Trabajador trabajador2 = new TrabajadorOnline("Alice", "Lopez", 30);
		Trabajador trabajador3 = new TrabajadorPresencial("Nina", "Bean", 30);
		Trabajador trabajador4 = new TrabajadorPresencial("Lisa", "Li", 30);

		trabajador1.CalcularSalario(3);
		trabajador2.CalcularSalario(4);
		trabajador3.CalcularSalario(5);
		trabajador4.CalcularSalario(1);

		TrabajadorOnline trabajador5 = new TrabajadorOnline("li", "di", 1);
		TrabajadorPresencial trabajador6 = new TrabajadorPresencial("Cindy", "Vega", 4);

		trabajador5.remoto();
		trabajador6.presencial();

	}

}

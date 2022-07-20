package n1exercici1;

public class TrabajadorPresencial extends Trabajador {

	public TrabajadorPresencial(String nombre, String apellido, double precioHora) {
		super(nombre, apellido, precioHora);
		// TODO Auto-generated constructor stub
	}

	static double gasolina;

	@Override
	public void CalcularSalario(int horasTrab) {
		// TODO Auto-generated method stub
		double salarioP = super.getPrecioHora() * horasTrab + TrabajadorPresencial.gasolina;
		System.out.println("presencial: " + salarioP);
	}

	@Deprecated
	public void presencial() {
		System.out.println("Presencial");
	}
}

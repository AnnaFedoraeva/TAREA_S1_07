package n1exercici1;

public class TrabajadorOnline extends Trabajador {

	public TrabajadorOnline(String nombre, String apellido, double precioHora) {
		super(nombre, apellido, precioHora);
		// TODO Auto-generated constructor stub
	}

	final static double tarifa = 50;

	@Override
	public void CalcularSalario(int horasTrab) {
		// TODO Auto-generated method stub
		double salarioO = super.getPrecioHora() * horasTrab + TrabajadorOnline.tarifa;
		System.out.println("online: " + salarioO);
	}
	@Deprecated
	public void remoto() {
		System.out.println("Online");
	}
}

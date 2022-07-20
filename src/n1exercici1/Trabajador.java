package n1exercici1;

public class Trabajador {
	
	private String nombre;
	private String apellido;
	private double precioHora;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public double getPrecioHora() {
		return precioHora;
	}
	public void setPrecioHora(double precioHora) {
		this.precioHora = precioHora;
	}
	public Trabajador(String nombre, String apellido, double precioHora) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.precioHora = precioHora;
	}
	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", apellido=" + apellido + ", precioHora=" + precioHora + "]";
	}
	
	public void CalcularSalario(int horasTrab) {
		double salario = this.precioHora*horasTrab;
		System.out.println(salario);
		
		
	}

}

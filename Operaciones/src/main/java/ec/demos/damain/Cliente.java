package ec.demos.damain;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner; 
public class Cliente {

	private String cedula;
	private String nombre;
	private String direccion;
	private String email;
	private Date fechaNacimiento;
	
	public Cliente() {
		super();
	}
	
	public void CalcularEdad(Date fechaNacimietno) {
		SimpleDateFormat fecha=  new SimpleDateFormat("dd-MM-yyyy");
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate fechaNac = LocalDate.parse(fecha.format(fechaNacimietno), fmt);
		LocalDate ahora = LocalDate.now();

		Period periodo = Period.between(fechaNac, ahora);
		System.out.printf("Tu edad es: %s años, %s meses y %s días \n" ,
		 periodo.getYears(), periodo.getMonths(), periodo.getDays());

	}
	 
	@Override
	public String toString() {
		return "Cliente[cedula= " +cedula+ ",nombre=" + nombre+  "]";
		
	}
	
	

	

	
	
	
	
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
}

package ec.demos;

import java.sql.Date;

import ec.demos.damain.Cliente;

public class OperacionesApp {

	public static void main(String[] args) {	
      /*  
		Calculadora calculadora= new Calculadora();
		calculadora.setValues1(50);
		calculadora.setValues2(83);
		calculadora.Sumar();
	    
	    calculadora.setValues1(60);
	    calculadora.setValues2(43);
	    calculadora.Restar();
	    
	    calculadora.setValues1(5);
	    calculadora.setValues2(7);
	    calculadora.Modulo();
		
		
		
	Operaciones op = new Operaciones();
		op.setValues1(50);
	    op.setValues2(83);
	    op.Sumar();
	    
	    op.setValues1(60);
	    op.setValues2(43);
	    op.Restar();
	    
	    op.setValues1(5);
	    op.setValues2(7);
	    op.Multiplicar();
	   */
	    
	    
	    Cliente cliente1= new Cliente();   
	    cliente1.setCedula("978982");;
	    cliente1.setNombre("Rosa Ayora");
	    cliente1.setDireccion("Azogues");
	    cliente1.setEmail("rousayo@hotmail.com");
	    cliente1.setFechaNacimiento(Date.valueOf("1993-08-16"));
	    cliente1.CalcularEdad(cliente1.getFechaNacimiento());
	    System.out.println(cliente1);
	    


	    
	    
	    
	    
	    
	    
	    }
	
	
	
	
	

}

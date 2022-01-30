package ec.demos;

public class OperacionesApp {

	public static void main(String[] args) {
        
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
	    
	    
	   op.setValues1(200);
	   op.setValues2(8);
	   op.Dividir();
	   
	}


}

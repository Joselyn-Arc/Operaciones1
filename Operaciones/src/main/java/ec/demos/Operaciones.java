package ec.demos;

public class Operaciones {
	private int values1;
	private int values2;
	
	public Operaciones() {
		super();
	}

    public Operaciones(int values1, int values2) {
		super();
		this.values1 = values1;
		this.values2 = values2;
	}
  
    public void Sumar() {
	    int sumar= values1 + values2; 
	    System.out.println("Suma: " + sumar);
	
     }
      
    public void Restar() {
    	int resta= values1- values2; 
    	System.out.println("Resta: " + resta);
    }


 
public int getValues1() {
	return values1;
}
public void setValues1(int values1) {
	this.values1 = values1;
}
public int getValues2() {
	return values2;
}
public void setValues2(int values2) {
	this.values2 = values2;
} 
 
}

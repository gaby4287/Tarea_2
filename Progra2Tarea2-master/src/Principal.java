
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    rectangulo mi_rectangulo = new rectangulo(); //llamamos las clases creadas
	    System.out.println("*** RECTANGULO ***");
	    mi_rectangulo.setBase(8);
	    System.out.println("Base del rectangulo "+mi_rectangulo.getBase());
	    mi_rectangulo.setAltura(10);
	    System.out.println("ALtura del rectangulo "+mi_rectangulo.getAltura());
	    mi_rectangulo.getArea(mi_rectangulo.base, mi_rectangulo.altura);
	    System.out.println("EL area es: "+mi_rectangulo.getArea(mi_rectangulo.base, mi_rectangulo.altura));
	    mi_rectangulo.getPerimetro(mi_rectangulo.base, mi_rectangulo.altura);
	    System.out.println("EL perimetro es: "+mi_rectangulo.getPerimetro(mi_rectangulo.base, mi_rectangulo.altura));
	
	    PentagonoRegular pentagono = new PentagonoRegular(0);
	    System.out.println("*** PENTAGONO REGULAR ***");
	    pentagono.setLado(10);
	    System.out.println("Lado: "+pentagono.getLado());;
	    System.out.println("El perimetro es: "+pentagono.getPerimetro());
	    
	    
	}

}

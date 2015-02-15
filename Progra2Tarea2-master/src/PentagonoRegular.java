public class PentagonoRegular {
     int lado;
     
     PentagonoRegular(int lado)
     {
        this.lado=lado;	 //this es para diferenciar 2 variables con el mismo nombre
     }
     

	int getLado()
     {
    	 return lado; //retornamos la variable lado
     }
     
     void setLado(int lado)
     {
    	 this.lado=lado; //establecemos la variable lado
     }
     
     int getPerimetro()
     {
    	 return lado*5; //retornamos el perimetro multiplicando el lado po 5
     }
}

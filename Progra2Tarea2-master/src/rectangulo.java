
	public class rectangulo
	{
		//Declaracion de variables
		int base;
		int altura;
		
		void setBase(int base) //establecer el valor de la base
		{
			this.base=base;
		}
		void setAltura(int altura) //establecer el valor de la altura
		{
			this.altura=altura;
		}
		
		int getBase() //obtener el valor de la base
		{
			return base; //retornarlo
		}
		int getAltura()  //obtener el valor de la altura
		{
			return altura; //retornarlo
		}
		
		int getArea(int base, int altura)
		{
			return(base*altura); //retornar el area multiplicando base por altura
		}
		
		int getPerimetro(int base, int altura)
		{
			return ((base*altura)*2); //retornar el perimetro multiplicando base por altura elevado al cuadrado
		}
		

        void setAtributos(int base, int altura)
        {
         setBase(base);
         setAltura(altura);
        }
}

    	

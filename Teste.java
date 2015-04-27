class Teste{
	public static void main (String args[]){
		Retangulo x;
		int area;
		int perimetro;
		x= new Retangulo();
		x.setBase(5);
		x.setLado(4);
		area=x.area();
		perimetro=x.perimetro();
		System.out.println("Base: " +x.getBase() );
		System.out.println("Lado: " +x.getLado() );
		System.out.println("Area: " + area);
		System.out.println("Perimetro: " + perimetro);
	}
}
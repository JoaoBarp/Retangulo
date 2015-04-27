class Retangulo {
	private int base=0,lado=0;

	public int area(){
		int area;
		area=base*lado;
		return area;
	}

	public int perimetro () {
		int perimetro;
		perimetro=(2*base)+(2*lado);
		return perimetro;
	}

	 public void setBase (int x){
	 	base=x;
	}

	public void setLado(int x){
		lado=x;
	}

	public int getBase (){
	 	return this.base;
	}

	public int getLado(){
		return this.lado;
	}
}
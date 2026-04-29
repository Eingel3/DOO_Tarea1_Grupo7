public abstract class Moneda implements Comparable<Moneda>{
	public Moneda(){} //Moneda solo necista usar this como identificador
	public Moneda getSerie(){
	return this; //se usa el hashcode para identificar a la Moneda
	}
	public abstract int getValor();
	
    @Override
	public int compareTo(Moneda entrada){//Aqui se han de comparar los valores entre dos monedas

		return Integer.compare(this.getValor(), entrada.getValor());
	}
}

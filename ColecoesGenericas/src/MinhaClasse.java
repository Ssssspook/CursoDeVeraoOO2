
public class MinhaClasse {

	public int num;
	public Double num1;
	
	public MinhaClasse (int num) {
		this.num = num;
	}
	
	public MinhaClasse (Double num1) {
		this.num1 = num1;
	}
	
	public int aoQuadrado() {
		return num * num;
	}
	
	public Double aoQuadradoDouble() {
		return num1 * num1;
	}
}

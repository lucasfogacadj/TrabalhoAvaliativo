
public class teste {
	
	public static void main(String[] args) {
		
		Metodos teste = new Metodos();
		
		if(teste.isPositive(3)){
			System.out.println("Positivo");
		}
		else{
			System.out.println("Negativo");
		}
		
		if(teste.isZero(0)){
			System.out.println("É zero");
		}
		else{
			System.out.println("Não é zero");
		}
		
		System.out.println("Delta");
	
		System.out.println(teste.delta(2, 8, 6));
		
		System.out.println("Mairo");
		
		System.out.println(teste.maior(5, 7));
		
		System.out.println("Menor");
		
		System.out.println(teste.menor(5, 7));
		
		System.out.println("Math max");
		
		System.out.println(teste.madMax(5, 7, 8));
		
		System.out.println("Math min");
		
		System.out.println(teste.madMix(6, 7, 8));
		
		System.out.println("Dado");
		
		System.out.println(teste.dado());
		
		System.out.println("Testa dado com Max");
		
		System.out.println(teste.dadoMax(7));
		
	}
	
}

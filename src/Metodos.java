
public class Metodos {
	
	boolean isPositive(float num){
		if(num>0){
			return true;
		}
		else{
			return false;
		}
	}
	
	boolean isZero(float num){
		if(num==0){
			return true;
		}
		else{
			return false;
		}
	}
	
	float delta(float a, float b, float c){
		float num;
		float aux;
		b = b*b;
		aux = a*c;
		num =(b-(4*aux));
		return num;
	}
	
	float maior (float a, float b){
		if(a>b){
			return a;
		}
		else{
			return b;
		}
	}
	
	float menor (float a, float b){
		if(a<b){
			return a;
		}
		else{
			return b;
		}
	}
	
	float madMax (int a, int b, int c){
		if(a>b){
			return Math.max(a, c);
		}
		else{
			return Math.max(b, c);
		}
	}
	
	float madMix (int a, int b, int c){
		if(a<b){
			return Math.min(a, c);
		}
		else{
			return Math.min(b, c);
		}
	}
	
	double dado(){
		double a;
		a = (Math.random())*6;
		return a;
	}
	
	double dadoMax(double b){
		double a;
		a = (Math.random())*b;
		return a;
		
	}

}	

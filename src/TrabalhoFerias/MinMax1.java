package TrabalhoFerias;
public class MinMax1 {
	
	int vetor[] ;
	
	public int recebeVetor(int vetor[]) {
		int maior = vetor[0];
		int menor = vetor[0];
		int contador = 0;
		
		for(int i = 0; (vetor.length) < i ; i+=2 ){
			contador++;
			if (vetor[i] > maior){
				contador++;
				maior = vetor[i] ;
			} 
			contador++;
			if ( vetor[i] < menor){
				contador++;
				menor = vetor[i];
			}
		}
		
		return contador;
	}
}
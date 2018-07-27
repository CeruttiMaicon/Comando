package TrabalhoFerias;
public class MinMax1 {
	
	public int recebeVetor(int vetor[]) {
		int maior = vetor[0];
		int menor = vetor[0];
		int contador = 0;
		
		for( int i = 0; i < (vetor.length); i++ ) {
			contador += 1;
			if (vetor[i] > maior){
				contador +=1;
				maior = vetor[i] ;
			} 
			contador += 1;
			if ( vetor[i] < menor){
				contador += 1;
				menor = vetor[i];
			}
		}
		return contador;
	}
}
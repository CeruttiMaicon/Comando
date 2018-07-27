package TrabalhoFerias;
public class MinMax2 {
	
	int vetor[] ;
	
	public int recebeVetor(int vetor[]) {
		int maior = vetor[0];
		int menor = vetor[0];
		int contador = 0;
		
		for(int i = 0; (vetor.length) < i ; i++ ){
			contador++;
			if (vetor[i] > maior){
				contador++;
				maior = vetor[i] ;
			} else {
				contador++;
				if ( vetor[i] < menor){
					contador++;
					menor = vetor[i];
				}
			}
		}
		
		return contador;
	}
}
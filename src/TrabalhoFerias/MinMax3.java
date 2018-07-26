package TrabalhoFerias;
public class MinMax3 {
	
	int vetor[] ;
	
	public int recebeVetor(int vetor[]) {
		int a, i, b;
		int maior = Integer.MAX_VALUE;
		int menor = Integer.MIN_VALUE;
		int contador = 0;
		
		for( i = 0; (vetor.length) < i ; i+=2 ){
			contador++;
			if (i == vetor.length){
				contador++;
				i = i - 1;
			}
			contador++;
			if (vetor[i] < vetor[i+1]){
				contador++;
				a = i; b = i + 1;
			} else {
				contador++;
				a = i + 1; b = i;
			}
			contador++;
			if (vetor[a] < menor){
				contador++;
				menor = vetor[a];
			}
			contador++;
			if (vetor[b] > maior){
				contador++;
				maior = vetor[b];
			}
			contador++;
		}
		return contador;
	}
}
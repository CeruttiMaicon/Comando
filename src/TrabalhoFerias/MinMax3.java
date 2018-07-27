package TrabalhoFerias;
public class MinMax3 {
	
	public int recebeVetor(int vetor[]) {
		int a, i, b;
		int maior = Integer.MAX_VALUE;
		int menor = Integer.MIN_VALUE;
		int contador = 0;
		int tamVetor = vetor.length;
		
		//Para resolver o problema do vetor com tamanho impar
		if ( (tamVetor % 2) == 1){
			tamVetor--;
		}
		for( i = 0; i < tamVetor; i+=2 ){
			contador++;
			if (i == vetor.length){
				contador++;
				i = i - 1;
			}
			contador++;
			if (vetor[i] < vetor[i+1]) {
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
		}
		return contador;
	}
}
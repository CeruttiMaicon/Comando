package TrabalhoFerias;

public class Utilizador {

	public static void main(String[] args) {
		
		// Fila com os valores Crescentes
		Popula p = new Popula();
		for (int n = 1; n < 100; n++){
			int[] crescenteVar   = new int[n];
			int[] decrescenteVar = new int[n];
			int[] aleatorioVar   = new int[n];
			
			try{
				//Adicionando os elementos na filaCrescentes
				p.aleatorio(aleatorioVar);
				p.crescente(crescenteVar);
				p.decrescente(decrescenteVar);
				
				MinMax1 minmax1 = new MinMax1();
				MinMax2 minmax2 = new MinMax2();
				MinMax3 minmax3 = new MinMax3();
				
				minmax1.recebeVetor(crescenteVar);
				minmax2.recebeVetor(crescenteVar);
				minmax2.recebeVetor(decrescenteVar);
				minmax2.recebeVetor(aleatorioVar);
				minmax3.recebeVetor(crescenteVar);
				
				System.out.println("=================");
				for(int i=0; i<aleatorioVar.length; i++) {
					System.out.println(aleatorioVar[i]);
				}

			}catch(Exception e){
				System.out.println(e);
			}
		}
	}
}
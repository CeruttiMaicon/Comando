package TrabalhoFerias;

import java.io.FileWriter;
import java.io.IOException;

public class Utilizador {

	public static void main(String[] args) {
		
		// Fila com os valores Crescentes
		try{
			Popula p = new Popula();
//			Aqui definimos o local de criacao do arquivo CSV, no meu Ubuntu coloquei esta rota
			FileWriter writer = new FileWriter("/home/dev3/Documentos/array.csv");
			
//			Faz o cabeçalho do arquivo CSV
			
			writer.append("MinMax1-Cresc,");
			writer.append("MinMax2-Cresc,");
			writer.append("MinMax2-Decresc,");
			writer.append("MinMax2-Desord,");
			writer.append("MinMax3-Cresc,");
			writer.append('\n');
			for (int n = 1; n <= 100; n++){
				int[] crescenteVar   = new int[n];
				int[] decrescenteVar = new int[n];
				int[] aleatorioVar   = new int[n];

					//Adicionando os elementos na filaCrescentes
					p.aleatorio(aleatorioVar);
					p.crescente(crescenteVar);
					p.decrescente(decrescenteVar);
					
					MinMax1 minmax1 = new MinMax1();
					MinMax2 minmax2 = new MinMax2();
					MinMax3 minmax3 = new MinMax3();
									
//					Escreve no arquivo CSV
					writer.append(minmax1.recebeVetor(crescenteVar) 	+ ",");
					writer.append(minmax2.recebeVetor(aleatorioVar) 	+ ",");
					writer.append(minmax2.recebeVetor(decrescenteVar) 	+ ",");
					writer.append(minmax2.recebeVetor(aleatorioVar) 	+ ",");
					writer.append(minmax3.recebeVetor(crescenteVar) 	+ ",");
					writer.append('\n');
					
	////				Testando as variaveis com o array com itens desordenados
	//				System.out.println("=================");
	//				for(int i=0; i<aleatorioVar.length; i++) {
	//					System.out.println(aleatorioVar[i]);
	//				}
					
	////				Testando as variaveis com o array com itens crescentes
	//				System.out.println("=================");
	//				for(int i=0; i<crescenteVar.length; i++) {
	//					System.out.println(crescenteVar[i]);
	//				}
	//				
	////				Testando as variaveis com o array com itens decrescentes
	//				System.out.println("=================");
	//				for(int i=0; i<decrescenteVar.length; i++) {
	//					System.out.println(decrescenteVar[i]);
	//				}
					
					//					Criando CSV com o array
					// 99 para pegar o array cheio
					if (n == 100){
	//					FileWriter writer = new FileWriter("/home/dev3/Documentos/array.csv");
	//					
//						writer.append("MinMax1-Cresc,");
//						writer.append("MinMax2-Cresc,");
//						writer.append("MinMax2-Decresc,");
//						writer.append("MinMax2-Desord,");
//						writer.append("MinMax3-Cresc,");
//						Pula linha no arquivo CSV
	//			        writer.append('\n');
						
	//					for(int i=0; i < aleatorioVar.length; i++) {
							
	//						minmax1.recebeVetor(crescenteVar);
	//						minmax2.recebeVetor(crescenteVar);
	//						minmax2.recebeVetor(decrescenteVar);
	//						minmax2.recebeVetor(aleatorioVar);
	//						minmax3.recebeVetor(crescenteVar);
							
							//Aqui é apenas um teste de impressão no terminal
	//						System.out.println("Valor do array " + minmax1.recebeVetor(aleatorioVar));
							
							// grava as informações de numero de interações feitas no arquivo CSV para gerar o grafico
	//						writer.append(minmax1.recebeVetor(crescenteVar) 	+ ",");
	//						writer.append(minmax2.recebeVetor(aleatorioVar) 	+ ",");
	//						writer.append(minmax2.recebeVetor(decrescenteVar) 	+ ",");
	//						writer.append(minmax2.recebeVetor(aleatorioVar) 	+ ",");
	//						writer.append(minmax3.recebeVetor(crescenteVar) 	+ ",");
							
	//				        	Aqui foi feito o teste para verificar se o valor dos arrays CRESCENTE, DECRESCENTE E ALEATORIO 
	//								estavam de acordo com o especificado
	//				        writer.append(aleatorioVar[i] + "");
	//				        writer.append(',');
	//				        writer.append(decrescenteVar[i] + "");
	//				        writer.append(',');
	//				        writer.append(crescenteVar[i] + "");
	//				        writer.append(',');
							
							
					        //Pula linha no arquivo CSV
	//				        writer.append('\n');
	//					}
						
	//					Essa tag fecha a conexão com o arquivo e encera a escrita, e deve ser feito apenas na ultima interacao
						writer.flush();
						writer.close();
						System.out.println("Arquivo CSV criado com Sucesso!");
					}
			}
		}catch(IOException e){
			System.out.println(e);
		}
	}
}
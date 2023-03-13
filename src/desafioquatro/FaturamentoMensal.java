package desafioquatro;

public class FaturamentoMensal {

	public static void main(String[] args) {
		double[] vetorFaturamento = {67836.43,36678.66,29229.88,27165.48};
		String []vetorEstados = {"SP" ,"RJ", "MG", "ES", "outros"};
		String auxiliar;
		double soma = 0;
		double percent = 0;
		
		for(int i=0; i<vetorFaturamento.length; i++) {
			soma += vetorFaturamento[i];
		}
		
		for(int i=0; i<vetorFaturamento.length;i++) {
			percent = (vetorFaturamento[i]*100)/soma;
			System.out.printf(vetorEstados[i]+"= %.2f", percent);
			System.out.println("%");
		}
		
	}
	
}

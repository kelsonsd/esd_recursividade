public class Soma {

    public static void main(String[] args) {

		int[] vetor = new int[args.length];
		for (int i = 0; i < args.length; i++) {
			vetor[i] = Integer.parseInt(args[i]);

		}

		System.out.println("Soma: " + somaVetor(vetor, vetor.length));

	}

	public static int somaVetor(int vetor[], int tamanho) {
		if (tamanho > 0) {
			return vetor[tamanho - 1] + somaVetor(vetor, tamanho - 1);
		} else {
			return 0;
		}
	}
}

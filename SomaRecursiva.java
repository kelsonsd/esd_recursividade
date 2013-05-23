    public class SomaRecursiva {  
      
        public static void main(String[] args) {  
            int vetor[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };  
            System.out.println("soma: " + somaVetor(vetor, vetor.length));  
        }  
      
        public static int somaVetor(int vetor[], int tamanho) {  
            if (tamanho > 0) {  
                return vetor[tamanho - 1] + somaVetor(vetor, tamanho - 1);  
            } else {  
                return 0;  
            }  
        }  
    }  
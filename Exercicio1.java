public class Exercicio1 {

    public static void executar() {
        
        int[] vetor = new int[5]; // Cria um vetor com 5 posições.
        int soma = 0;
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Prompt.lerInteiro("Digite um número: ");
            soma += vetor[i]; // Adiciona o valor do usuário
        }
        int media = soma / 5;
        System.out.println("Média: " + media);

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i]>media) {
                System.out.println("Números digitados que são superiores a média: " + vetor[i]);
            } else if (vetor[i]<media) {
                System.out.println("Números que são menores que a média: " + vetor[i]);
            } else {
                System.out.println("Números que são iguais a média: " + vetor[i]);
            }{
                
            }
        }

    }

}

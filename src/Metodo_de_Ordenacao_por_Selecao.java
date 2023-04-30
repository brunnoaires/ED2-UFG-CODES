// Alunos: GIANLLUCA DO CARMO LEME e BRUNNO AIRES SILVA TURMA: A01

public class Metodo_de_Ordenacao_por_Selecao {
    public static void main(String[] args) {

        int[] vetor = new int[10];

        for (int i=0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random() * vetor.length);
        }

        System.out.println("Desordenado:");
        for(int i=0; i < vetor.length; i++){
            System.out.print(vetor[i]);
            if(i < vetor.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println(".");

        //Selection sort O(N^2)
        int posicao_menor, aux;
        for (int i=0; i < vetor.length; i++){ //O(N)
            posicao_menor = i;
            for(int j = i+1; j < vetor.length; j++){ //O(N)
                if (vetor[j] < vetor[posicao_menor]){
                    posicao_menor = j;
                }
            }
            aux = vetor[posicao_menor];
            vetor[posicao_menor] = vetor[i];
            vetor[i] = aux;
        }
        System.out.println("\nOrdenado:");
        for(int i=0; i < vetor.length; i++){
            System.out.print(vetor[i]);
            if(i < vetor.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println(".");
        int menor = vetor[0];
        System.out.println("\no menor valor e: "+menor+".");
    }
}
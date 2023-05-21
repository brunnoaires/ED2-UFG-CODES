public class ShellSort {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
        }
        System.out.println("Vetor desordenado:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
            if (i < vetor.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(".");
        //  Imprimir o vetor para cada sequência de h-ordenado.


        int h = 1;
        int n = vetor.length;
        while (h < n) {
            h = h * 3 + 1;
        }
        h = (int) Math.floor(h / 3);

        int elemento, j;
        while (h > 0) {
            for (int i = h; i < n; i++) {
                elemento = vetor[i];
                j = i;
                while (j >= h && vetor[j - h] > elemento) {
                    vetor[j] = vetor[j - h];
                    j = j - h;
                }
                vetor[j] = elemento;
            }

            System.out.println("\nsequencia de h = "+h);
            for (int i = 0; i < vetor.length; i++) {
                System.out.print(vetor[i]);
                if (i < vetor.length - 1) {
                    System.out.print(", ");
                }
            }
            h = h / 2;
        } //0 1 2 3 4 5 6 7 8 9 10

        System.out.println("");
        System.out.println("\nVetor ordenado:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
            if (i < vetor.length - 1) {
                System.out.print(", ");
            }

        }
    }
}

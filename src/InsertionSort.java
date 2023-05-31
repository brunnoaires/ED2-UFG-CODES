    // Alunos: GIANLLUCA DO CARMO LEME (202009490)
    // BRUNNO AIRES SILVA (202014616)
    // TURMA: A01

    import java.util.Arrays;
    import java.util.Random;

    public class InsertionSort {

        public static void main(String[] args) {
            int[] v = gerarVetor(10);
            int valorMaximo = v[0];
            for(int i = 0; i < v.length; i++){
                if(v[i] > valorMaximo){
                    valorMaximo = v[i];
                }
            }

            System.out.println("Desordenado: " + Arrays.toString(v));
            insertionSort(v);
            System.out.println("Ordenado: " + Arrays.toString(v));
            System.out.println("O maior valor é: " + valorMaximo + ".");
        }

        private static int[] gerarVetor(int n) {
            int[] v = new int[n];
            Random gerador = new Random();
            for (int i = 0; i < n; i++) {
                v[i] = gerador.nextInt(100);
            }
            return v;
        }

        public static void insertionSort(int[] v) {
            int aux, j;
            for (int i = 0; i < v.length; i++) {
                aux = v[i];
                j = i - 1;
                while ((j >= 0) && v[j] > aux) {
                    v[j + 1] = v[j];
                    j = j - 1;
                }
                v[j + 1] = aux;
            }
        }
    }







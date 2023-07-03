package Sorting;

import java.util.ArrayList;

public class MetodosOrdenacao {

    public long[] bubbleSort(int[] array) {
        int temp;
        long trocas = 0;
        long comparacoes = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                comparacoes++;
                if (array[j] > array[j + 1]) { //comparação aqui
                    trocas++;
                    temp = array[j];  //todo esse trecho até o fim do if é o sistema de troca
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        long[] resultados = new long[2];
        resultados[0] = comparacoes;
        resultados[1] = trocas;
        return resultados;
    }

    public long[] selectionSort(int[] array) {
        int minIndex, aux;
        long trocas = 0;
        long comparacoes = 0;

        for (int i = 0; i < array.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                comparacoes++;
                if (array[j] < array[minIndex]) { //comparação
                    minIndex = j;
                }
            }

            if (array[minIndex] != array[i]) { //só realiza troca se os valores forem diferentes, se não deixa como está
                aux = array[i]; //troca
                array[i] = array[minIndex];
                array[minIndex] = aux;
                trocas++;
            }
        }
        long[] resultados = new long[2];
        resultados[0] = comparacoes;
        resultados[1] = trocas;
        return resultados;
    }

    public long[] insertionSort(int[] vetor) {
        int pivo;
        int j;
        long trocas = 0;
        long comparacoes = 0;
        for (int i = 0; i < vetor.length; i++) {
            pivo = vetor[i];
            j = i - 1;
            while (j >= 0 && vetor[j] > pivo) { //compara
                comparacoes++; //comparou acima, cada loop do while ele faz uma comparação
                trocas++;
                vetor[j + 1] = vetor[j]; //troca, mas o pivô não fica em lugar nenhum
                j--;
            }
            comparacoes++; // a última comparação não foi contada pq não entrou no while, ele testou e passou reto, então é aumentada aqui no lugar
            vetor[j + 1] = pivo; //seta o pivô na posição correta, tecnicamente não conta como troca
        }
        long[] resultados = new long[2];
        resultados[0] = comparacoes;
        resultados[1] = trocas;
        return resultados;
    }

    public static void bucketSort(int[] aArray, long[] resultados) {
        int iTamanho = aArray.length;
        int iValorMinimo = Integer.MAX_VALUE;
        int iValorMaximo = Integer.MIN_VALUE;
        for (int iLinha = 0; iLinha < iTamanho; iLinha++) {
            if (aArray[iLinha] < iValorMinimo) {
                iValorMinimo = aArray[iLinha];
            }
            if (aArray[iLinha] > iValorMaximo) {
                iValorMaximo = aArray[iLinha];
            }
        }
        int iNumeroBaldes = (iValorMaximo - iValorMinimo) / iTamanho + 1;
        ArrayList<Integer>[] aBaldes = new ArrayList[iNumeroBaldes];
        for (int iLinha = 0; iLinha < iNumeroBaldes; iLinha++) {
            aBaldes[iLinha] = new ArrayList<>();
        }
        for (int iLinha = 0; iLinha < iTamanho; iLinha++) {
            int iIndiceBalde = (aArray[iLinha] - iValorMinimo) / iTamanho;
            aBaldes[iIndiceBalde].add(aArray[iLinha]);
        }
    }


    public long[] shellSort(int vetor[]) {
        long[] resultados = new long[2];
        int n = vetor.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = vetor[i];
                int j = i;
                for (j = i; j >= gap && vetor[j - gap] > temp; j -= gap) { //comparação
                    resultados[0]++;
                    resultados[1]++;
                    vetor[j] = vetor[j - gap];//troca, no debaixo colocar o valor no lugar certo
                }
                resultados[0]++;
                vetor[j] = temp;
            }
        }
        return resultados;
    }

    //Métodos recursivos

    //Merge sort
    public void mergeSort(int[] array, int inicio, int fim, long[] resultados) {
        int meio;
        if (inicio < fim) {
            meio = (inicio + fim) / 2;
            mergeSort(array, inicio, meio, resultados);
            mergeSort(array, meio + 1, fim, resultados);
            merge(array, inicio, meio, fim, resultados);
        }
    }

    private void merge(int[] array, int inicio, int meio, int fim, long[] resultados) {
        int[] aux = new int[array.length];
        for (int i = inicio; i <= meio; i++) {
            aux[i] = array[i];
        }
        for (int j = meio + 1; j <= fim; j++) {
            aux[fim + meio + 1 - j] = array[j];
        }
        int i = inicio;
        int j = fim;
        for (int k = inicio; k <= fim; k++) {
            resultados[0]++;
            if (aux[i] <= aux[j]) {
                array[k] = aux[i];
                i = i + 1;
            } else {
                resultados[1]++;
                array[k] = aux[j];
                j = j - 1;
            }
        }
    }

    //Quick sort
    public void quickSort(int[] vetor, int inicio, int fim, long[] resultados) {
        if (inicio < fim) {
            resultados = particao(vetor, inicio, fim, resultados);
            quickSort(vetor, inicio, (int) resultados[2], resultados);
            quickSort(vetor, (int) resultados[2] + 1, fim, resultados);
        }
    }

    private long[] particao(int[] vetor, int inicio, int fim, long[] resultados) {
        int pivo, i, j, aux;
        pivo = vetor[(inicio + fim) / 2];
        i = inicio - 1;
        j = fim + 1;
        while (i < j) {
            do {
                j = j - 1;
                resultados[0]++; // contador
            } while (vetor[j] > pivo); // comparação aqui, contador acima
            do {
                i = i + 1;
                resultados[0]++; // contador
            } while (vetor[i] < pivo); //comparação aqui, contador acima

            if (i < j) { //só troca se a posição de i for menor que a posição de j, mas não é uma comparação porque não é sobre o valor, e sim pela posição
                aux = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = aux;
                resultados[1]++; //troca
            }
        }
        //resultados[0] = num de comparações
        //resultados[1] = num de trocas
        resultados[2] = j; // retorno padrão do quicksort
        return resultados;
    }
}
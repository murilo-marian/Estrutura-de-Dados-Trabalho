package Main;

import Sorting.MetodosOrdenacao;
import Util.Util;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        long inicio; // inicio da conta de tempo
        long fim; // fim da conta de tempo
        long tempoDecorrido = 0; //fim - inicio


        int[] vetor = Util.geraArray(1_000_000);
        System.out.println("Array criado");

        int[] vetorAleatorizado = Util.aleatorizaArray(vetor.clone());
        System.out.println("Array aleatorizado");

        int[] vetorReverso = Util.geraArrayInverso(1_000_000);
        System.out.println("Vetor reverso criado");

        MetodosOrdenacao teste = new MetodosOrdenacao();

        long[] resultados;

        //Começo dos testes (vetor aleatório)


        inicio = System.nanoTime();
        resultados = teste.bubbleSort(vetorAleatorizado.clone());
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;
        System.out.println("------------------");
        System.out.println("Bubble Sort - Vetor Aleatório:");
        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");
        System.out.println("Comparações realizadas: " + resultados[0]);
        System.out.println("Trocas realizadas: " + resultados[1]);


        inicio = System.nanoTime();
        resultados = teste.insertionSort(vetorAleatorizado.clone());
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;
        System.out.println("------------------");
        System.out.println("Insertion Sort - Vetor Aleatório:");
        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");
        System.out.println("Comparações realizadas: " + resultados[0]);
        System.out.println("Trocas realizadas: " + resultados[1]);

        inicio = System.nanoTime();
        resultados = teste.selectionSort(vetorAleatorizado.clone());
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;
        System.out.println("------------------");
        System.out.println("Selection Sort - Vetor Aleatório:");
        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");
        System.out.println("Comparações realizadas: " + resultados[0]);
        System.out.println("Trocas realizadas: " + resultados[1]);

        long[] resultadosQuick = new long[]{0, 0, 0};
        inicio = System.nanoTime();
        teste.quickSort(vetorAleatorizado.clone(), 0, vetorAleatorizado.length - 1, resultadosQuick);
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;
        System.out.println("------------------");
        System.out.println("Quick Sort - Vetor Aleatório:");
        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");
        System.out.println("Comparações realizadas: " + resultadosQuick[0]);
        System.out.println("Trocas realizadas: " + resultadosQuick[1]);


        long[] resultadosMerge = new long[]{0, 0};
        inicio = System.nanoTime();
        teste.mergeSort(vetorAleatorizado.clone(), 0, vetorAleatorizado.length - 1, resultadosMerge);
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;
        System.out.println("------------------");
        System.out.println("Merge Sort - Vetor Aleatório:");
        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");
        System.out.println("Comparações realizadas: " + resultadosMerge[0]);
        System.out.println("Trocas realizadas: " + resultadosMerge[1]);

        inicio = System.nanoTime();
        resultados = teste.shellSort(vetorAleatorizado.clone());
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;
        System.out.println("------------------");
        System.out.println("Shell Sort - Vetor Aleatório:");
        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");
        System.out.println("Comparações realizadas: " + resultados[0]);
        System.out.println("Trocas realizadas: " + resultados[1]);




        //Começo dos testes (vetor organizado)


        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

        inicio = System.nanoTime();
        resultados = teste.bubbleSort(vetor.clone());
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;
        System.out.println("------------------");
        System.out.println("Bubble Sort - Ordenado:");
        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");
        System.out.println("Comparações realizadas: " + resultados[0]);
        System.out.println("Trocas realizadas: " + resultados[1]);


        inicio = System.nanoTime();
        resultados = teste.insertionSort(vetor.clone());
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;
        System.out.println("------------------");
        System.out.println("Insertion Sort - Ordenado:");
        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");
        System.out.println("Comparações realizadas: " + resultados[0]);
        System.out.println("Trocas realizadas: " + resultados[1]);


        inicio = System.nanoTime();
        resultados = teste.selectionSort(vetor.clone());
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;
        System.out.println("------------------");
        System.out.println("Selection Sort - Ordenado:");
        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");
        System.out.println("Comparações realizadas: " + resultados[0]);
        System.out.println("Trocas realizadas: " + resultados[1]);

        resultadosQuick = new long[]{0, 0, 0};
        inicio = System.nanoTime();
        teste.quickSort(vetor.clone(), 0, vetorAleatorizado.length - 1, resultadosQuick);
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;
        System.out.println("------------------");
        System.out.println("Quick Sort - Vetor Ordenado:");
        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");
        System.out.println("Comparações realizadas: " + resultadosQuick[0]);
        System.out.println("Trocas realizadas: " + resultadosQuick[1]);

        resultadosMerge = new long[]{0, 0};
        inicio = System.nanoTime();
        teste.mergeSort(vetor.clone(), 0, vetorAleatorizado.length - 1, resultadosMerge);
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;
        System.out.println("------------------");
        System.out.println("Merge Sort - Vetor Ordenado:");
        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");
        System.out.println("Comparações realizadas: " + resultadosMerge[0]);
        System.out.println("Trocas realizadas: " + resultadosMerge[1]);

        inicio = System.nanoTime();
        resultados = teste.shellSort(vetor.clone());
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;
        System.out.println("------------------");
        System.out.println("Shell Sort - Vetor Ordenado:");
        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");
        System.out.println("Comparações realizadas: " + resultados[0]);
        System.out.println("Trocas realizadas: " + resultados[1]);


        //Começo dos testes (vetor invertido)
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

        inicio = System.nanoTime();
        resultados = teste.bubbleSort(vetorReverso.clone());
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;
        System.out.println("------------------");
        System.out.println("Bubble Sort - Invertido:");
        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");
        System.out.println("Comparações realizadas: " + resultados[0]);
        System.out.println("Trocas realizadas: " + resultados[1]);


        inicio = System.nanoTime();
        resultados = teste.insertionSort(vetorReverso.clone());
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;
        System.out.println("------------------");
        System.out.println("Insertion Sort - Invertido:");
        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");
        System.out.println("Comparações realizadas: " + resultados[0]);
        System.out.println("Trocas realizadas: " + resultados[1]);

        inicio = System.nanoTime();
        resultados = teste.selectionSort(vetorReverso.clone());
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;
        System.out.println("------------------");
        System.out.println("Selection Sort - Invertido:");
        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");
        System.out.println("Comparações realizadas: " + resultados[0]);
        System.out.println("Trocas realizadas: " + resultados[1]);


        resultadosQuick = new long[]{0, 0, 0};
        inicio = System.nanoTime();
        teste.quickSort(vetorReverso.clone(), 0, vetorAleatorizado.length - 1, resultadosQuick);
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;
        System.out.println("------------------");
        System.out.println("Quick Sort - Invertido:");
        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");
        System.out.println("Comparações realizadas: " + resultadosQuick[0]);
        System.out.println("Trocas realizadas: " + resultadosQuick[1]);


        resultadosMerge = new long[]{0, 0};
        inicio = System.nanoTime();
        teste.mergeSort(vetorReverso.clone(), 0, vetorAleatorizado.length - 1, resultadosMerge);
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;
        System.out.println("------------------");
        System.out.println("Merge Sort - Vetor Invertido:");
        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");
        System.out.println("Comparações realizadas: " + resultadosMerge[0]);
        System.out.println("Trocas realizadas: " + resultadosMerge[1]);

        inicio = System.nanoTime();
        resultados = teste.shellSort(vetorReverso.clone());
        fim = System.nanoTime();
        tempoDecorrido = fim - inicio;
        System.out.println("------------------");
        System.out.println("Shell Sort - Vetor Invertido:");
        System.out.println("Tempo decorrido: " + TimeUnit.MILLISECONDS.convert(tempoDecorrido, TimeUnit.NANOSECONDS) + "ms");
        System.out.println("Comparações realizadas: " + resultados[0]);
        System.out.println("Trocas realizadas: " + resultados[1]);
    }
}

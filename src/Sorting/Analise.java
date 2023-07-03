package Sorting;

public class Analise {
    private long comparacoes;
    private long trocas;
    private int j;

    public Analise(long comparacoes, long trocas, int j) {
        this.comparacoes = comparacoes;
        this.trocas = trocas;
        this.j = j;
    }

    public Analise() {
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public long getComparacoes() {
        return comparacoes;
    }

    public void setComparacoes(long comparacoes) {
        this.comparacoes = comparacoes;
    }

    public long getTrocas() {
        return trocas;
    }

    public void setTrocas(long trocas) {
        this.trocas = trocas;
    }
}

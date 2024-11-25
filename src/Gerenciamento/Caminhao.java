package Gerenciamento;

public class Caminhao extends Veiculos {
    private Double capacidade;
    private int numEixos;

    public Caminhao(String marca, String modelo, int ano, Double preço, Double capacidade, int numEixos) {
        super(marca, modelo, ano, preço);
        this.capacidade = capacidade;
        this.numEixos = numEixos;
    }

    public Double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Double capacidade) {
        this.capacidade = capacidade;
    }

    public int getNumEixos() {
        return numEixos;
    }

    public void setNumEixos(int numEixos) {
        this.numEixos = numEixos;
    }

    @Override
    public String toString() {
        return "Caminhao{" +
                "capacidade=" + capacidade +
                ", numEixos=" + numEixos +
                '}';
    }
}
